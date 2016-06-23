<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html >
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheet" type="text/css"
	href="<%= request.getContextPath()%>/css/style.css">
</head>
<style>
div {
	border: 1px solid black;
	margin: 10px;
	padding: 10px;
}

.table td {
	border: 1px solid black;
	margin: 10px;
	padding: 10px;
}

.table th {
	border: 1px solid black;
	margin: 10px;
	padding: 10px;
	background: pink;
}
</style>
<body>

	<div>
		<form action="getClients">
			<table>
				<tr>
					<td>mot cle:</td>
					<td><input type="text" name="motCle"></td>
					<td><input type="submit" value="envoyer"></td>
				</tr>
			</table>
		</form>
	</div>
	<div>
		<table class="table">
			<tr>
				<th>Id</th>
				<th>nomClient</th>
				<th>PrenomClient</th>
				<th>AgeClient</th>
			</tr>
			<c:forEach items="${AttrClient}" var="cl">
				<tr>
					<td>${cl.idClient}</td>
					<td>${cl.nomClient}</td>
					<td>${cl.prenomClient}</td>
					<td>${cl.ageClient}</td>
				</tr>
			</c:forEach>
		</table>
	</div>
	<div>
		<form action="suprimer">
			<select name="idClient">
				<c:forEach items="${AttrClient}" var="e">
					<option value="${e.idClient}">${e.nomClient}</option>
				</c:forEach>
			</select> <input type="submit" value="supprimer">
		</form>
	</div>
	<div>
		<form action="save" method="post">
		   <table>
		   
		    <tr>
				<td>Nom Client</td>
				<td><input type="text" name="nom"></td>
			</tr>

			<tr>
				<td>PreNom Client</td>
				<td><input type="text" name="prenom"></td>
			</tr>

			<tr>
				<td>age Client</td>
				<td><input type="text" name="age" ></td>
			</tr>

			<tr>
				<td><input type="submit" value="save" /></td>
			</tr>
		   
		   </table>
		</form>
	</div>
</body>
</html>