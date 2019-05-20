package drunkenRogue.action;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.util.ValueStack;

public class UploadAction extends ActionSupport {

	private File upload;
	private String uploadContentType;
	private String uploadFileName;

	public File getUpload() {
		return upload;
	}

	public void setUpload(File upload) {
		this.upload = upload;
	}

	public String getUploadContentType() {
		return uploadContentType;
	}

	public void setUploadContentType(String uploadContentType) {
		this.uploadContentType = uploadContentType;
	}

	public String getUploadFileName() {
		return uploadFileName;
	}

	public void setUploadFileName(String uploadFileName) {
		this.uploadFileName = uploadFileName;
	}

	@Override
	public String execute() throws Exception {
		
		

	
		
		
		System.out.println("文件上传！");
		
		System.out.println("文件类型："+uploadContentType);
		System.out.println("文件类型："+uploadFileName);
		
		FileUtils.copyFile(upload, new File("D:/uploadTest",uploadFileName));
		return null;
		
		//sys
	}

}
