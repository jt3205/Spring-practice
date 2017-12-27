<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html><head><meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title></head>
<body>
<c:if test="${!empty result}">
	${result}님의 고객정보등록이 완료 되었습니다<br>
	<a href="/customer/index.html">홈 화면으로 이동</a>
</c:if>
<c:if test="${empty result}">
	이미 존재하거나 잘못 입력하셨습니다<br>
	다시 입력해 주세요<br>
	<a href="/mvc3/insert.jsp">다시 입력</a>
</c:if>


<%-- <%                                       //request명     
	String rs=(String)request.getAttribute("result");
	if(rs != null)
	{
%>
		<%=rs%>님의 고객정보등록이 완료 되었습니다<br>
		<a href="/mvc3/index.html">홈 화면으로 이동</a>
<%		
	}else{
%>
		이미 존재하거나 잘못 입력하셨습니다<br>
		다시 입력해 주세요<br>
		<a href="/mvc3/insert.jsp">다시 입력</a>
<%		
	}
%> --%>
</body>
</html>