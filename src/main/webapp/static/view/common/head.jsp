<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<% 
String path = request.getContextPath();  
String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort() + path;  
String remoteAddress=request.getRemoteAddr();  
String servletPath=request.getServletPath();  
String realPath=request.getRealPath("/");  
String remoteUser=request.getRemoteUser();  
String requestURI=request.getRequestURI();  
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
<link href="<%=basePath %>/static/css/bootstrap.min.css" rel="stylesheet" type="text/css">
<link href="<%=basePath %>/static/dist/css/fontawesome.min.css" rel="stylesheet" type="text/css">
<link href="<%=basePath %>/static/dist/css/brands.css" rel="stylesheet" type="text/css">
<link href="<%=basePath %>/static/dist/css/solid.css" rel="stylesheet" type="text/css">
<link href="<%=basePath %>/static/css/navbar.css" rel="stylesheet" type="text/css">
<script src="<%=basePath %>/static/js/jquery-3.4.1.min.js" type="text/javascript"></script>
<script src="<%=basePath %>/static/js/popper.min.js" type="text/javascript"></script>
<script src="<%=basePath %>/static/js/bootstrap.min.js" type="text/javascript"></script>
<script src="<%=basePath %>/static/js/jquery.validate.min.js" type="text/javascript"></script>
<script src="<%=basePath %>/static/js/feather.min.js" type="text/javascript"></script>