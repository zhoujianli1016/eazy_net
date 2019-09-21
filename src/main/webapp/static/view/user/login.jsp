<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
  <%@include file="/static/view/common/head.jsp" %>
  <link href="/static/css/floating-labels.css" rel="stylesheet" type="text/css">
<body>
   <form class="form-signin" action="/user/login/in" method="post">
	  <div class="text-center mb-4">
	    <img class="mb-4" src="{{ site.baseurl }}/docs/{{ site.docs_version }}/assets/brand/bootstrap-solid.svg" alt="" width="72" height="72">
	    <h1 class="h3 mb-3 font-weight-normal">eezy-net</h1>
	    <p>欢迎来到eezy-net，这只是个人娱乐使用，不支持商业等其他用途，详情请查看<a href="https://www.baidu.com">相关说明</a></p>
	  </div>
	
	  <div class="form-label-group">
	    <input type="text" id="name" name="name" class="form-control" placeholder="Email address" required autofocus>
	    <label for="inputEmail">登录名/邮箱</label>
	  </div>
	
	  <div class="form-label-group">
	    <input type="password" id="password" name="password" class="form-control" placeholder="Password" required>
	    <label for="inputPassword">密码</label>
	  </div>
	
	  <div class="checkbox mb-3">
	    <label>
	      <input type="checkbox" value="remember-me"> 记住密码
	    </label>
	  </div>
	  <button class="btn btn-lg btn-primary btn-block" type="submit">登入</button>
	  <p class="mt-5 mb-3 text-muted text-center">&copy; 2017-2019</p>
	</form>
</body>
</html>