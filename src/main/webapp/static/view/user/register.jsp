<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
  <head>
    <%@include file="/static/view/common/head.jsp" %>
    <title>用户信息</title>
    <link href="/static/css/form-validation.css" rel="stylesheet" type="text/css">
    <script type="text/javascript" src="/static/js/form-validation.js"></script>
  </head>
<body>
  <div class="container">
	  <div class="py-5 text-center">
	    <i class="fas fa-user-circle fa-5x" aria-hidden="true"></i>
	    <h2>用户信息</h2>
	    <p class="lead">选择您的信息，适用于此平台，eazy-net不会将您的数据做其他用途。</p>
	  </div>
	
	  <div class="row">
	    <div class="col-md-12 order-md-1">
	      <h4 class="mb-3">基本信息</h4>
	      <form class="needs-validation" novalidate action="#" id="userInfoForm">
	        <div class="row">
	          <div class="col-md-6 mb-3">
	            <label for="firstName">名字</label>
	            <input type="text" class="form-control" id="firstName" name="firstName" placeholder="三" required>
	            <div class="invalid-feedback">
	              <p>必须输入有效的名字。</p>
	            </div>
	          </div>
	          <div class="col-md-6 mb-3">
	            <label for="lastName">姓氏</label>
	            <input type="text" class="form-control" id="lastName" name="lastName" placeholder="张" required>
	            <div class="invalid-feedback">
	              <p>必须输入有效的姓氏</p>
	            </div>
	          </div>
	        </div>
	        
	        <div class="row">
            <div class="col-md-6 mb-3">
              <label for="firstName">昵称</label>
              <input type="text" class="form-control" id="nickName" name="nickName" placeholder="大发明家-闻西" value="" norequired>
              <div class="invalid-feedback">
                <p>必须输入有效的名字。</p>
              </div>
            </div>
            <div class="col-md-6 mb-3">
              <label for="country">性别</label>
              <select class="custom-select d-block w-100" id="sex" name="sex" norequired>
                <option value="">请选择...</option>
                <option value="0">其他</option>
                <option value="1">先生</option>
                <option value="2">女士</option>
              </select>
              <div class="invalid-feedback">
                <p>请选择有效的性别。</p>
              </div>
            </div>
          </div>
          
          <div class="row">
            <div class="col-md-6 mb-3">
	            <label for="email">电子邮件 <span class="text-muted">(可选)</span></label>
	            <input type="email" class="form-control" id="email" name="email" placeholder="xxx@example.com">
	            <div class="invalid-feedback">
	              <p>请输入有效的电子邮件地址以进行运输更新。</p>
	            </div>
	          </div>
	  
	          <div class="col-md-6 mb-3">
	            <label for="username">联系电话 <span class="text-muted">(可选)</span></label>
	            <div class="input-group">
	              <div class="input-group-prepend">
	                <span class="input-group-text">+86</span>
	              </div>
	              <input type="text" class="form-control" id="mobile" placeholder="" name="mobile" norequired>
	              <div class="invalid-feedback" style="width: 100%;">
	                <p>请输入正确的联系电话。</p>
	              </div>
	            </div>
	          </div>
          </div>
          
          <div class="row">
            <div class="col-md-4 mb-3">
              <label for="sex">省份<span class="text-muted">(可选)</span></label>
              <select class="custom-select d-block w-100" id="sex" name="sex" norequired>
                <option value="">请选择...</option>
                <option value="0">北京市</option>
                <option value="1">上海市</option>
                <option value="2">天津市</option>
              </select>
            </div>
    
            <div class="col-md-4 mb-3">
              <label for="sex">市<span class="text-muted">(可选)</span></label>
              <select class="custom-select d-block w-100" id="sex" name="sex" norequired>
                <option value="">请选择...</option>
                <option value="0">北京市</option>
                <option value="1">上海市</option>
                <option value="2">天津市</option>
              </select>
            </div>
            
            <div class="col-md-4 mb-3">
              <label for="country">区</label>
              <select class="custom-select d-block w-100" id="sex" name="sex" norequired>
                <option value="">请选择...</option>
                <option value="0">北京市</option>
                <option value="1">上海市</option>
                <option value="2">天津市</option>
              </select>
            </div>
          </div>
          
	        <hr class="mb-4">
	        <button class="btn btn-primary btn-lg btn-block" type="submit" onclick="javascript:submitForm();">注册用户</button>
	      </form>
	    </div>
	  </div>
	
	  <footer class="my-5 pt-5 text-muted text-center text-small">
	    <p class="mb-1">&copy; 2019</p>
	    <ul class="list-inline">
	      <li class="list-inline-item"><a href="#">隐私</a></li>
	      <li class="list-inline-item"><a href="#">条款</a></li>
	      <li class="list-inline-item"><a href="#">支持</a></li>
	    </ul>
	  </footer>
	</div>
	<script type="text/javascript">
    function submitForm() {
      $.ajax({
        url: "http://localhost:8080/user/regist",
        data: $("#userInfoForm").serialize(),
        type: "post",
        success: function(result){
          alert(result);
        },
        error: function(e) {
          
        }
      });
    }
  </script>
</body>
</html>