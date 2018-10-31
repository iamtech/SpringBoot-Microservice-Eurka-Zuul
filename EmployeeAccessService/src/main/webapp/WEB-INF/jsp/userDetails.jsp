<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html xmlns="http://www.w3.org/1999/xhtml" xml:lang="en" lang="en">

<head>
	<title>All Employee Page</title>
</head>

<body>
	<div class="container">
		<div class="row">
			<h2>Employee Details</h2>
			<ul>
				<li><strong>Employee ID:</strong> ${profile.userId}</li>
				<li><strong>Employee Name:</strong> ${profile.name}</li>
			</ul>
		</div>
	</div>
</body>
</html>