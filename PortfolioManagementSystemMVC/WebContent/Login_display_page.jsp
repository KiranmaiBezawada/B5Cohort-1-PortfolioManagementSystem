<%@page import="com.wellsfargo.batch5.fmvc.model.Login"%>

<html>
	<head>
		<title>Portfolio Management System</title>
	</head>
	<body>		
		<h1>Portfolio Management System</h1>
		<jsp:include page="welcome.jsp" />
			
		<% Login login = (Login) request.getAttribute("login"); %>
		
		<table>
			<tr><td>username</td><td><strong><%=loan.getusername() %></strong></td></tr>
			<tr><td>password</td><td><strong><%=loan.getpassword() %></strong></td></tr>
			
		</table>
	</body>
	
</html>