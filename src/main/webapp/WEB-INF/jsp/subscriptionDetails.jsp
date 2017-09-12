<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<!DOCTYPE html>
<html lang="en">
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
    <meta name="viewport" content="width=device-width, initial-scale=1"/>
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">

    <!-- Website Font style -->
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/font-awesome/4.6.1/css/font-awesome.min.css"/>

    <!-- Google Fonts -->
    <link href='https://fonts.googleapis.com/css?family=Passion+One' rel='stylesheet' type='text/css'/>
    <link href='https://fonts.googleapis.com/css?family=Oxygen' rel='stylesheet' type='text/css'/>

    <link href='/static/css/table.css' rel='stylesheet' type='text/css'/>

</head>
<body>
<div class="container">
    <h3>The columns titles are merged with the filters inputs thanks to the placeholders attributes</h3>
    <hr>
    <div class="row">
    <div class="panel panel-primary filterable">
    <div class="panel-heading">
        <h3 class="panel-title">Subscription Detailss</h3>
    </div>

    <table class="table">
           <tr><td>Subscription Name</td>  <td>${subscription.name}</td></tr>
           <tr><td>Subscription Date</td>  <td>${subscription.creationDate}</td></tr>
           <tr><td>Expiry Date</td>  <td>${subscription.expiryDate}</td></tr>
    </table>
   </div>
  </div>
</div>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.1.1/jquery.min.js"></script>
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
</body>