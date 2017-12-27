<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
[추가하기 화면]<br><br>

<form  method="post"  action="/mvc/insertProc.sp">
<table>
	<tr>
		<td>이름</td>
		<td><input type="text"  name="name"></td>
	</tr>	
	<tr>	
		<td>나이</td>
		<td><input type="text"  name="age"></td>
	</tr>
	<tr>	
		<td>취미</td>
		<td><input type="text"  name="hobby"></td>
	</tr>
	<tr>
		<td colspan="2">
			<input type="submit"  value="추가하기">  
		</td>
	</tr>
</table>
</form><br>
<a href="/mvc/index.sp">처음화면</a>
</body>
</html>