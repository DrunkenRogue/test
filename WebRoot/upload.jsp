<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <title>My JSP 'index.jsp' starting page</title>
  </head>
  
  <body>
  <h1>文件上传</h1>
  
<form action="${pageContext.request.contextPath }/doUpload" method="post" enctype="multipart/form-data">
	<input type="file" name="upload"> 
	<input type="submit" value="上传">
</form>
  
  
  </body>
</html>
