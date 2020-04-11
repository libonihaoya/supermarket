package cn.xm.supermarket.controller;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import cn.xm.supermarket.controller.ex.FileEmptyException;
import cn.xm.supermarket.controller.ex.FileSizeException;
import cn.xm.supermarket.controller.ex.FileTypeException;
import cn.xm.supermarket.entity.Merchandise;
import cn.xm.supermarket.service.MerchandiseService;
import cn.xm.supermarket.util.JsonResult;

/**
 * 商品控制器类
 * @author asus
 *
 */
@RestController
@RequestMapping("Merchandises")
public class MerchandiseController {
	
	@Autowired
	private MerchandiseService merchandiseService;
	
	private static final SimpleDateFormat sdf = new SimpleDateFormat("yyMMddHHmmss");
	
	//可以上传的图片类型
	@Value("${project.image-type}")
	private List<String> type;
	
	//最大图片大小
	@Value("${project.image-max-size}")
	private Long maxSize;
	
	private static final Integer OK = 2000;

	// http://localhost:8080/Merchandises/add?mname=旺仔&image=/user/image/shan.jsp&costPrice=10&price=20&num=10&datail=这是一个很棒的奶&cid=101&isPutaway=1
	@RequestMapping("add")
	public JsonResult<Void> addNew(MultipartFile file ,Merchandise merchandise,HttpSession session){
		
		//判断文件是否为空
		boolean isEmpty = file.isEmpty();
	System.err.println("isEmpty:"+isEmpty);
		if (isEmpty) {
			throw new FileEmptyException("图片上传失败，该文件为空");//TODO
		}
		//判断文件类型
		//-获取文件的类型
		String contentType = file.getContentType();
		System.err.println("contentType:"+contentType);
		if (!type.contains(contentType)) {
			throw new FileTypeException("图片上传失败，文件类型错误，请上传图片格式的文件");//TODO
		}
		//判断文件大小，不能超过1M
		//-获取文件大小
		long size = file.getSize();
	System.err.println("size:"+size);
		if (size > maxSize) {
			throw new FileSizeException("图片上传失败，可上传的最大值是1M");//TODO
		}
		
		//获取源文件的名称
		String originalName = file.getOriginalFilename();
	System.err.println("originalName:"+originalName);
		//获取文件的后缀
		int index = originalName.lastIndexOf(".");
		String suffix = "";
		if (index > 1) {
			suffix = originalName.substring(index);
		}
		//获取当前时间
		Date date = new Date();
		//以时间给文件命名，精确到纳秒
		String fileName = sdf.format(date) + System.nanoTime();
		//文件的完整名称
		String child = fileName + suffix;
	System.err.println("child:"+child);
		//确定路径，第一次将在webapp下创建文件夹
		String parent = session.getServletContext().getRealPath("GoodsIMG");
		//判断这个文件夹是否存在
		File parentFile = new File(parent);
		//如果不存在则创建出来
		if (!parentFile.exists()) {
			parentFile.mkdirs();
		}
		
		//确定保存在哪
		File dest = new File(parent, child);
		//运行时可能丢失文件，再次检测
		if (dest != null) {
			//测试应用程序是否可以执行此抽象路径名表示的文件
			dest.canExecute();
		}
		try {
			//执行保存
			file.transferTo(dest);
		} catch (IllegalStateException e) {
			//文件状态异常
			e.printStackTrace();
		} catch (IOException e) {
			//文件传输过程异常
			e.printStackTrace();
		};
		//将图片路径存入存入merchandise中
		String image = "/GoodsIMG/"+child;
		merchandise.setImage(image);
		merchandiseService.addNew(merchandise);
		//TODO 这里合并时需统一处理异常
		return new JsonResult<Void>(OK);
	}
}
