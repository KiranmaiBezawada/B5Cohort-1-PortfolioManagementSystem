
<html>
	<head>
		<title> Portfolio Management System<</title>
	</head>
	<body>
		<h1>Portfolio Management System</h1>
		<jsp:include page="welcome.jsp" />
				<form action="ri" method="POST">
			<div>
				<label>Fisrt Name</label>
				<input type="string" name="Username" required/>
			</div>
			<div>
				<label>Password</label>
				<input type="string" name="passowrd" required />				
			</div>
			
			<div>
				<button>Login</button>
				<button>Cancel</button>
			</div>
		</form>
	</body>
	
</html>