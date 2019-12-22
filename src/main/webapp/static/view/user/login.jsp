<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
  <head>
	  <%@include file="/static/view/common/head.jsp" %>
	  <link href="<%=basePath %>/static/css/floating-labels.css" rel="stylesheet" type="text/css">
	  <script type="text/javascript" src="<%=basePath %>/static/js/jquery.md5.js"></script>
	  <title>登入</title>
  </head>
<body>
  <form class="form-signin" action="/login/in" method="post" id="loginForm">
	  <div class="text-center mb-4">
      <i class="fas fa-user-circle fa-5x" aria-hidden="true"></i>
	    <h1 class="h3 mb-3 font-weight-normal">eazy-net</h1>
	    <p>欢迎来到eazy-net，这只是个人娱乐使用，不支持商业等其他用途，详情请查看<a href="https://www.baidu.com">相关说明</a></p>
	  </div>
	
	  <div class="form-label-group">
	    <input type="text" id="name" name="name" class="form-control" placeholder="Email address" required>
	    <label for="name">登录名</label>
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
	  <div class="checkbox mb-3">
	    <button type="button" class="btn btn-link float-left">忘记密码?</button>
	    <button type="button" class="btn btn-link float-right" data-toggle="modal" data-target="#exampleModal">注册</button>
	  </div>
	  <p class="mt-5 mb-3 text-muted text-center">&copy; 2019</p>
  </form>
  <!-- Modal -->
	<div class="modal fade" id="exampleModal" tabindex="-1" role="dialog" aria-labelledby="exampleModalLabel" aria-hidden="true">
	  <div class="modal-dialog modal-dialog-centered" role="document">
	    <div class="modal-content">
	      <div class="modal-header">
	        <h5 class="modal-title" id="exampleModalLabel">用户注册</h5>
	        <button type="button" class="close" data-dismiss="modal" aria-label="Close">
	          <span aria-hidden="true">&times;</span>
	        </button>
	      </div>
	      <div class="modal-body">
          <form class="needs-validation" action="/user/regist" id="userConfigFrom" method="post">
            <div class="form-group col-md-12 mb-3 row">
              <label for="nickName" class="col-sm-3 col-form-label">昵称</label>
              <input type="text" class="form-control col-sm-9" id="nickName" name="nickName" placeholder="Super saiyan" required>
              <div class="invalid-feedback">
                <p>必须输入有效的昵称。</p>
              </div>
            </div>
            <div class="form-group col-md-12 mb-3 row">
              <label for="loginName" class="col-sm-3 col-form-label">登录名</label>
              <input type="text" class="form-control col-sm-9" id="loginName" name="loginName" placeholder="" required>
              <div class="invalid-feedback">
                <p>必须输入有效的登录名。</p>
              </div>
            </div>
            <div class="form-group col-md-12 mb-3 row">
              <label for="registerPassword" class="col-sm-3 col-form-label">登录密码</label>
              <input type="password" class="form-control col-sm-9" id="registerPassword" name="registerPassword" placeholder="" required>
              <div class="invalid-feedback">
                <p>必须输入有效的登录密码。</p>
              </div>
            </div>
            <div class="form-group col-md-12 mb-3 row">
              <label for="confirmPassword" class="col-sm-3 col-form-label">确认密码</label>
              <input type="password" class="form-control col-sm-9" id="confirmPassword" name="confirmPassword" placeholder="" required>
              <div class="invalid-feedback">
                <p>必须输入有效的确认密码。</p>
              </div>
            </div>
            <button class="btn btn-primary btn-lg btn-block" type="submit" id="registerBtn">注册用户</button>
	        </form>
	      </div>
	      <div class="modal-footer">
	        <!-- <button type="button" class="btn btn-secondary" data-dismiss="modal">关闭</button> -->
	        <!-- <button type="button" class="btn btn-primary">注册用户</button> -->
	      </div>
	    </div>
	  </div>
	</div>
</body>
<script type="text/javascript">
  $(document).ready(function(){
	  $("#registerPassword").change(function() {
		  $(this).val($.md5($(this).val()));
	  });
	  $("#confirmPassword").change(function() {
      $(this).val($.md5($(this).val()));
    });
	  $("#password").change(function() {
      $(this).val($.md5($(this).val()));
    });
	});
</script>
<script type="text/javascript">
  feather.replace();
</script>
</html>