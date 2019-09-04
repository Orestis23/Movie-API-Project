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
    
    <tr>
      <td>Film Title</td>
      <td>Film Plot</td>
      <td>Film Genre</td>
      <td>Film Rating</td> 
      <td>Film Release Year</td> 
      <td> <a class="btn btn-primary" href="details?id=${d.id }">Add to Favorites</a>
    </tr>
    
  </table>

<a class="btn btn-primary" href="details?id=${d.id }">Back to Film Manager</a>

<a class="btn btn-primary" href="details?id=${d.id }">View Your Favorites</a>

</body>
</html>