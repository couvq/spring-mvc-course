<!DOCTYPE html>
<html>
<head>
<title>Login Page</title>
</head>

<body>
	<form action="/login.do" method="post">
		<label for="name">Please enter your name:</label> 
		<input name="name" type="text" /> 
		<label for="password">Please enter your password:</label> 
		<input name="password" type="password" />
		<input type="submit" />
	</form>
	<p><font color="red">${errorMessage}</font></p>
</body>
</html>