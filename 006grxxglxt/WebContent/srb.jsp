<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@ taglib uri="http://java.sun.com/jstl/core_rt" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>

<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>主界面</title>
</head>
<body>

<center>
	
	<hr>
	<h1><font size="7">个人信息管理系统</font></h1>
	<h1 style="background-color:#0000ff;"><font size="8">welcome ${uname }</font></h1>
</center>

<div id="main">
  <div id="leftDiv">
    <ul>
    	<li><a href="${pageContext.request.contextPath}/YhbServlet?uid=${uid }">个人信息</a></li>
    	<li><a href="${pageContext.request.contextPath}/TxlServlet?uid=${uid }">通讯录</a></li>
    	<li><a href="${pageContext.request.contextPath}/BwlServlet?uid=${uid }">备忘录</a></li>
    	<li><a href="${pageContext.request.contextPath}/RjbServlet?uid=${uid }">日记</a></li>
    	<li><a href="${pageContext.request.contextPath}/SrbServlet?uid=${uid }">收入</a></li>
    	<li><a href="${pageContext.request.contextPath}/ZcbServlet?uid=${uid }">支出</a></li>
    	<br/>
    	<li><a href="${pageContext.request.contextPath}/index.jsp">退出</a></li>
    </ul>
  </div>
  <center>
  
<c:forEach items="${list}" var="list" varStatus="st">
	<div id="rightDiv">
        <p><span style="display:inline-block;width:200px;text-align:right;">项目 </span>
        <input name="ntitle" type="text" class="opt_input" value="${list.project}"/></p>
    
        <p><span style="display:inline-block;width:200px;text-align:right;">金额</span>
        <input name="nauthor" type="text" class="opt_input" value="${list.imoney }"/></p>

        <p><span style="display:inline-block;width:200px;text-align:right;">时间</span>
        <input name="ntitle" type="text" class="opt_input" value="${list.addtime }"/></p>
    
        <p><span style="display:inline-block;width:200px;text-align:right;">收入</span>
        <input name="nauthor" type="text" class="opt_input" value="${list.income }"/></p>
    
    	<input type="submit" value="修改" />
    	<input type="reset"  value="重置" />
    </div>
</c:forEach>
  
  </center>
</div>

<style type="text/css">
#leftDiv {
 float: left;
 width: 150px;
 background-color: #00FFFF;
}
#rightDiv {
 background-color: #8EFFFF;
 float: left;
 width: 400px;
}
}
</style>
</body>
</html>