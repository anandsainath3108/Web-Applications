<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib prefix="f" uri="http://www.springframework.org/tags/form"%>  
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Feedback and Rating</title>
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css" integrity="sha384-MCw98/SFnGE8fJT3GXwEOngsV7Zt27NXFoaoApmYm81iuXoPkFOJwJ8ERdknLPMO" crossorigin="anonymous">
</head>
<body>
<table border="1" align="center">

<f:form modelAttribute="feedback" >

<tr>
<td>Enter Product ID:: </td>
<td> <f:input path="productId" /></td>
</tr>

<tr>
<td>Enter Your E-Mail: </td>
<td> <f:input path="customerEmailId" /></td>
</tr>

<tr>
<td>Enter Your Feedback: </td>
<td> <f:input type="text" path="feedbackForProduct" /></td>
</tr>

<tr>
<td>Give your Rating: </td>
<td>
<div class="btn-toolbar" role="toolbar" aria-label="Toolbar with button groups">
  <div class="btn-group mr-2" role="group" aria-label="Group">

<f:button path="productRating" items="${Rating}" type="button" class="btn btn-secondary"></f:button>
   
  </div>
</div>
</td>

</tr>
<tr>
<td>Average Ratings:</td>
<td> "${averageRatings}" </td>
</tr>

<tr>
<td>Number of Ratings:</td>
<td> "${noRatings}" </td>
</tr>

<tr>
<td>
<input type="submit" value="Save" />
</td>
</tr>

</f:form>
</table>

<h1>${details}</h1>

<script src="https://code.jquery.com/jquery-3.3.1.slim.min.js" integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo" crossorigin="anonymous"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.3/umd/popper.min.js" integrity="sha384-ZMP7rVo3mIykV+2+9J3UJ46jBk0WLaUAdn689aCwoqbBJiSnjAK/l8WvCWPIPm49" crossorigin="anonymous"></script>
<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/js/bootstrap.min.js" integrity="sha384-ChfqqxuZUCnJSK3+MXmPNIyE6ZbWh2IMqE241rYiqJxyMiZ6OW/JmZQ5stwEULTy" crossorigin="anonymous"></script>
</body>
</html>
