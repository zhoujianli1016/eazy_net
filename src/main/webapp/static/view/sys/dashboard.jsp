<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html lang="zh">
	<head>
    <%@include file="/static/view/common/head.jsp" %>
    <link href="<%=basePath%>/static/css/Chart.min.css" rel="stylesheet" type="text/css">
    <%-- <link href="<%=basePath%>/static/css/floating-labels.css" rel="stylesheet" type="text/css"> --%>
    <title>仪表盘</title>
    <link href="<%=basePath%>/static/css/dashboard.css" rel="stylesheet" type="text/css">
    <script type="text/javascript" src="<%=basePath%>/static/js/Chart.min.js"></script>
</head>
<body>
  <nav class="navbar navbar-dark fixed-top bg-dark flex-md-nowrap p-0 shadow">
	  <a class="navbar-brand col-sm-3 col-md-2 mr-0" href="#">Eazy net</a>
	  <input class="form-control form-control-dark w-100" type="text" placeholder="Search" aria-label="Search">
	  <ul class="navbar-nav px-3">
	    <li class="nav-item text-nowrap">
	      <a class="nav-link" href="#">登&nbsp;&nbsp;&nbsp;出</a>
	    </li>
	  </ul>
	</nav>
	
	<div class="container-fluid">
	  <div class="row">
	  
      <%@include file="/static/view/common/leftNavbar.jsp" %>
	  
	    <main role="main" class="col-md-9 ml-sm-auto col-lg-10 px-4">
        <div class="d-flex justify-content-between flex-wrap flex-md-nowrap align-items-center pt-3 pb-2 mb-3 border-bottom">
	        <h1 class="h2">仪表盘</h1>
	        <div class="btn-toolbar mb-2 mb-md-0">
	          <div class="btn-group mr-2">
	            <button type="button" class="btn btn-sm btn-outline-secondary">分享</button>
	            <button type="button" class="btn btn-sm btn-outline-secondary">导出</button>
	          </div>
	          <button type="button" class="btn btn-sm btn-outline-secondary dropdown-toggle">
	            <span data-feather="calendar"></span>
	            <span>今天</span>
	          </button>
	        </div>
	      </div>
	      <canvas class="my-4 w-100" id="myChart" width="900" height="380"></canvas>
	      <h2>登录日志</h2>
	      <div class="table-responsive">
	        <table class="table table-striped table-sm">
	          <thead>
	            <tr>
	              <th>#</th>
	              <th>Header</th>
	              <th>Header</th>
	              <th>Header</th>
	              <th>Header</th>
	            </tr>
	          </thead>
	          <tbody>
	            <tr>
	              <td>1,001</td>
	              <td>Lorem</td>
	              <td>ipsum</td>
	              <td>dolor</td>
	              <td>sit</td>
	            </tr>
	            <tr>
	              <td>1,002</td>
	              <td>amet</td>
	              <td>consectetur</td>
	              <td>adipiscing</td>
	              <td>elit</td>
	            </tr>
	            <tr>
	              <td>1,003</td>
	              <td>Integer</td>
	              <td>nec</td>
	              <td>odio</td>
	              <td>Praesent</td>
	            </tr>
	            <tr>
	              <td>1,003</td>
	              <td>libero</td>
	              <td>Sed</td>
	              <td>cursus</td>
	              <td>ante</td>
	            </tr>
	            <tr>
	              <td>1,004</td>
	              <td>dapibus</td>
	              <td>diam</td>
	              <td>Sed</td>
	              <td>nisi</td>
	            </tr>
	            <tr>
	              <td>1,005</td>
	              <td>Nulla</td>
	              <td>quis</td>
	              <td>sem</td>
	              <td>at</td>
	            </tr>
	            <tr>
	              <td>1,006</td>
	              <td>nibh</td>
	              <td>elementum</td>
	              <td>imperdiet</td>
	              <td>Duis</td>
	            </tr>
	            <tr>
	              <td>1,007</td>
	              <td>sagittis</td>
	              <td>ipsum</td>
	              <td>Praesent</td>
	              <td>mauris</td>
	            </tr>
	            <tr>
	              <td>1,008</td>
	              <td>Fusce</td>
	              <td>nec</td>
	              <td>tellus</td>
	              <td>sed</td>
	            </tr>
	            <tr>
	              <td>1,009</td>
	              <td>augue</td>
	              <td>semper</td>
	              <td>porta</td>
	              <td>Mauris</td>
	            </tr>
	            <tr>
	              <td>1,010</td>
	              <td>massa</td>
	              <td>Vestibulum</td>
	              <td>lacinia</td>
	              <td>arcu</td>
	            </tr>
	            <tr>
	              <td>1,011</td>
	              <td>eget</td>
	              <td>nulla</td>
	              <td>Class</td>
	              <td>aptent</td>
	            </tr>
	            <tr>
	              <td>1,012</td>
	              <td>taciti</td>
	              <td>sociosqu</td>
	              <td>ad</td>
	              <td>litora</td>
	            </tr>
	            <tr>
	              <td>1,013</td>
	              <td>torquent</td>
	              <td>per</td>
	              <td>conubia</td>
	              <td>nostra</td>
	            </tr>
	            <tr>
	              <td>1,014</td>
	              <td>per</td>
	              <td>inceptos</td>
	              <td>himenaeos</td>
	              <td>Curabitur</td>
	            </tr>
	            <tr>
	              <td>1,015</td>
	              <td>sodales</td>
	              <td>ligula</td>
	              <td>in</td>
	              <td>libero</td>
	            </tr>
	          </tbody>
	        </table>
	      </div>
	    </main>
	  </div>
	</div>
</body>
<script type="text/javascript" src="<%=basePath%>/static/js/dashboard.js"></script>
</html>