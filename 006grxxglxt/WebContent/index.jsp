<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>首页</title>
</head>
<body>
<center>
	<hr>
	<h1><font size="7">个人信息管理系统</font></h1>
	<h1 style="background-color:#0000ff;"><font size="8">welcome</font></h1>
</center>
<script type="text/javascript">
	function login(){
		var uname=document.getElementById("uname").value;
		var upwd=document.getElementById("upwd").value;
		location.href="login?uname="+uname+"&upwd="+upwd;
	}
</script>

 <div id="leftDiv">
    	请输入您的用户名 +_+<br />
        <p><label> 用户 </label>
        <input name="uname" type="text" id="uname"/></p>
        <p><label> 密码 </label>
        <input name="upwd" type="password" id="upwd"/></p>
    
    	<input type="submit" value="登录" onclick="login()" />
    	<input type="reset"  value="重置" />${error }
 </div>
<style type="text/css">
#leftDiv {
 float: left;
 width: 300px;
 background-color: #8EFFFF;
}
</style>
</body>
</html>