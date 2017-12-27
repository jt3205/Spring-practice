<%-- <%@page import="customer.vo.CustomerVO"%>
<%@page import="java.util.List"%> --%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html><head><meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title></head>
<body>

<c:if test="${empty list}">
	<h3>고객 정보가 없습니다</h3>
</c:if>
<c:if test="${!empty list}">
	<h3>** 고객 정보 리스트 **</h3><hr>
	<c:forEach items="${list}"  var="ob">
		${ob.id} &nbsp;&nbsp;&nbsp; ${ob.password} &nbsp;&nbsp;&nbsp; ${ob.name}<br>
	</c:forEach>
</c:if><br>
<a href="/customer/index.html">홈 화면으로 이동</a>



<%-- <%
	List<CustomerVO> list=(List<CustomerVO>)request.getAttribute("list");
	if(list.size() == 0){
%>
		<h3>고객 정보가 없습니다</h3>
<%		
	}else{
%>
		<h3>** 고객 정보 리스트 **</h3><hr>
<%		
		for(CustomerVO vo:list){
%>
			<%=vo.getId()%> <%=vo.getPassword()%> <%=vo.getName()%><br>
<%
		}
	}
%><br>
<a href="/mvc3/index.html">홈 화면으로 이동</a> --%>
</body>
</html>