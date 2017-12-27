<%-- <%@page import="customer.vo.CustomerVO"%> --%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html><head><meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title></head>
<body>
<h3>** 검색된 고객의 정보 **</h3><hr>
아이디 : ${vo.id}<br>           <!-- vo.id는 getId()를 호출함 -->
패스워드 : ${vo.password}<br>       
이름 : ${vo.name}<br>       
<a href="/customer/index.html">홈 화면으로 이동</a>


<%-- <%
	CustomerVO vo=(CustomerVO) request.getAttribute("vo");
%>
<h3>** 검색된 고객의 정보 **</h3><hr>
아이디 : <%=vo.getId()%><br>
패스워드 : <%=vo.getPassword()%><br>
이름 : <%=vo.getName() %><br>
<a href="/mvc3/index.html">홈 화면으로 이동</a> --%>
</body>
</html>