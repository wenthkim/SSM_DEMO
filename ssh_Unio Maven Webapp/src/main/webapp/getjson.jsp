<%@page import="com.wsj.ssh.bean.User"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>Test Json</title>
</head>
<body>


	<form action="/ssh_Unio/user/findall.action" method="post">
		userName:<input type="text" name="username" value="">
		<input type="submit" value="submit">
	</form>

</body>
</html>