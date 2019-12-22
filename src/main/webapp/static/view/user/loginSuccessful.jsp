<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
  <head>
    <%@include file="/static/view/common/head.jsp" %>
    <title>登入成功</title>
  </head>
<body>
  <%@include file="/static/view/common/topNavbar.jsp" %>
  <div class="container">
	  <main role="main">
	    <div class="jumbotron">
	      <div class="col-sm-8 mx-auto">
	        <h1>登录成功</h1>
	        <p>错误代码：${code}</p>
          <p>错误消息：${message}</p>
	        <p>
	          <a class="btn btn-primary" href="{{ site.baseurl }}/docs/{{ site.docs_version }}/components/navbar/" role="button">View navbar docs &raquo;</a>
	        </p>
	      </div>
	    </div>
	  </main>
  </div>
</body>
</html>