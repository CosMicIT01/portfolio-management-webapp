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
    <link href='/static/css/colorbox.css' rel='stylesheet' type='text/css'/>

</head>
<body>
<div class="container">
    <div class="row">
    <div class="panel panel-primary filterable">
    <div class="panel-heading">
        <h3 class="panel-title">Subscriptions</h3>
        <div class="pull-right">
            <button class="btn btn-default btn-xs btn-filter"><span class="glyphicon glyphicon-filter"></span> Filter</button>
        </div>
    </div>

    <table class="table">
      <thead>
        <tr class="filters">
          <th> <input type="text" class="form-control" placeholder="#" disabled></th>
          <th><input type="text" class="form-control" placeholder="Subscription Name" disabled></th>
          <th><input type="text" class="form-control" placeholder="Subscription Date" disabled></th>
          <th><input type="text" class="form-control" placeholder="Expiry Date" disabled></th>
          <th><input type="text" class="form-control" placeholder="Details" disabled></th>
        </tr>
      </thead>
      <tbody>
       <c:forEach items="${subscriptions}" var="subscriptionVar" varStatus="subscriptionStatusVar">
           <tr>
               <td>${(subscriptionStatusVar.index)+1}</td>
               <td>${subscriptionVar.name}</td>
               <td>${subscriptionVar.creationDate}</td>
               <td>${subscriptionVar.expiryDate}</td>
               <td><a class="iframe" href="/subscription/<c:out value="${subscriptionVar.id}"/>">Details</a></td>
           </tr>
       </c:forEach>
      </tbody>
    </table>
   </div>
  </div>
</div>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.1.1/jquery.min.js"></script>
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
<script type='text/javascript' src='/static/js/table.js'></script>

<script type='text/javascript' src='/static/js/agentDashboard.js'></script>
<script type='text/javascript' src='/static/js/jquery.colorbox-min.js'></script>
</body>