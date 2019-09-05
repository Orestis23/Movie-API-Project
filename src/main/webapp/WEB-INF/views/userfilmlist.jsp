<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>IMDb Movies</title>
<link rel="stylesheet" type="text/css" href="styles/styles.css">

<link href="https://stackpath.bootstrapcdn.com/bootswatch/4.3.1/minty/bootstrap.min.css" rel="stylesheet" integrity="sha384-9NlqO4dP5KfioUGS568UFwM3lbWf3Uj3Qb7FBHuIuhLoDp3ZgAqPE1/MYLEBPZYM" crossorigin="anonymous"></head>
<!-- <body background=http://www.pptbackgrounds.org/uploads/film-movies-movie-making-minimalism-creative-backgrounds-wallpapers.jpg> -->

	<center><h1>IMDb Full Movie List</h1></center>

<div class="container">
  <table class="table">
    <tr>

      <th><font size="14">Title</font></th>
      <th><font size="14">Plot</font></th>
      <th><font size="14">Genre</font></th>
      <th><font size="14">Rating</font></th>
      <th><font size="14">Release Year</font></th>

      
      
    </tr>
    
    <c:forEach var="d" items="${List }">
				<tr>
					<td>${d.title }</td>
					<td>${d.plot }</td>
					<td>${d.genre }</td>
					<td>${d.rated }</td>
					<td>${d.year }</td>
					<td></td>
				</tr>
			</c:forEach>
    
  </table>
</div>
<%-- <a class="btn btn-primary" href="details?id=${d.id }">Back to Film Manager</a> --%>


</body>
</html>