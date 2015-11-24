<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1">
<meta name="description" content="">
<meta name="author" content="">
<link href="bootstrap/css/bootstrap.min.css" rel="stylesheet">
<link href="css/wt.css" rel="stylesheet">
<title>用户登录</title>
<!--[if lt IE 9]>
	<script src="js/html5shiv.js"></script>
    <script src="js/respond.min.js"></script>
<![endif]-->
</head>
<body>
	<div class="container">
		<div class="row">
			<div class="col-md-5 col-md-offset-4">
				<div class="login-panel panel panel-default">
					<div class="panel-heading">
						<h4>帐号登录</h4>
					</div>
					<div class="panel-body">
						<form class="form-horizontal" role="form" action="vlogin" method="post">
							<div class="form-group">
								<label for="userEmail" class="col-sm-2 control-label">账户</label>
								<div class="col-sm-10">
									<input class="form-control" placeholder="邮箱" id="userEmail" name="userEmail" type="email" autofocus="">
								</div>
							</div>
							<div class="form-group">
								<label for="userPassword" class="col-sm-2 control-label">密码</label>
								<div class="col-sm-10">
									<input type="password" class="form-control" id="userPassword" name="userPassword" placeholder="密码">
								</div>
							</div>
							<div class="form-group">
								<div class="col-sm-offset-2 col-sm-10">
									<div class="checkbox">
										<label> <input type="checkbox"> 记住我
										</label>
									</div>
								</div>
							</div>
							<div class="form-group">
								<div class="col-sm-offset-2 col-sm-10">
									<button type="submit" class="btn btn-lg btn-success btn-block">登录</button>
								</div>
							</div>
						</form>
					</div>
				</div>
			</div>
		</div>
	</div>
	<script src="js/jquery-1.11.3.min.js"></script>
	<script src="bootstrap/js/bootstrap.min.js"></script>
</body>
</html>