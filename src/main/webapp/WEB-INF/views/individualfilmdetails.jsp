<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Individual Film Info</title>
<link rel="stylesheet" type="text/css" href="styles/styles.css">

<link href="https://stackpath.bootstrapcdn.com/bootswatch/4.3.1/minty/bootstrap.min.css" rel="stylesheet" integrity="sha384-9NlqO4dP5KfioUGS568UFwM3lbWf3Uj3Qb7FBHuIuhLoDp3ZgAqPE1/MYLEBPZYM" crossorigin="anonymous"></head>


	<center><h1>Details about an Individual Film</h1></center>

  <table class="table">
    <tr>

      <th>Title</th>
      <th>Plot</th>
      <th>Genre</th>
      <th>Rating</th>
      <th>Release Year</th>
      
      
    </tr>
    

   <%--  <c:forEach var="d" items="${id }"> --%>
				<tr>
					<td>${d.title }</td>
					<td>${d.plot }</td>
					<td>${d.genre }</td>
					<td>${d.rated }</td>
					<td>${d.year }</td>
					<td> <a class="btn btn-primary" href="add-list?title=${d.title}&plot=${d.plot}&genre=${d.genre}&rated=${d.rated}&year=${year}" >Add to Favorites</a>
				</tr>
	<%-- 		</c:forEach> --%>
  </table>

<%-- <a class="btn btn-primary" href="details?id=${d}">Your Info</a> --%>

<a href="display-list"class="button">View Your Favorites</a>

</body>
</html>