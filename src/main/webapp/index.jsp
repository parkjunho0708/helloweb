<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>Hello World, Junho</h1>
	<img src=' /helloweb/assets/images/yunakim.jpg' style='width: 100px;' />
	<br />
	<br />
	<a href='/helloweb/hello?name=junho&email=junho@gmail.com&no=10'>
	여기를 누르면 HelloServlet를 호출합니다.</a>
	<br />
	<br />
	<a href='/helloweb/table.jsp?c=20&r=30'>테이블 보기(JSP)</a>
	<br />
	<br />
	<a href='/helloweb/table?c=20&r=30'>테이블 보기(servlet)</a>
</body>
</html>