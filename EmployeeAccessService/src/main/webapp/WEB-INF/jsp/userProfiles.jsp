<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html xmlns="http://www.w3.org/1999/xhtml" xml:lang="en" lang="en">

<head>
	<title>Employees Name</title>
</head>

<body>
	<div class="container">
		<div class="row">
			<h2>Employee List</h2>
			<ul>
				<c:forEach items="${profiles}" var="profile">
					<li><a href="userDetails?id=${profile.userId}">${profile.name}</a></li>
				</c:forEach>
			</ul>
		</div>
	</div>
</body>
</html>