
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



    <title>Agent Dashboard</title>

</head>
<body>
<div class="container">

    <div id="tab" class="btn-group" data-toggle="buttons-radio">
      <a href="#profile" class="btn btn-large btn-info active" data-toggle="tab">Profile</a>
      <a href="#serviceRequests" class="btn btn-large btn-info" data-toggle="tab">Service Requests</a>
      <a href="#subscriptions" class="btn btn-large btn-info" data-toggle="tab">Subscriptions</a>
     </div>

  <!-- Tab panes -->
  <div class="tab-content">
    <div role="tabpanel" class="tab-pane active" id="profile" data-url="http://localhost:8090/agent/profile">Loading Profile...</div>
    <div role="tabpanel" class="tab-pane" id="serviceRequests" data-url="http://localhost:8090/agent/serviceRequests">Loading Service Requests...</div>
    <div role="tabpanel" class="tab-pane" id="subscriptions" data-url="http://localhost:8090/agentManagedSubscriptions">Loading Subscriptions...</div>
  </div>

</div>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.1.1/jquery.min.js"></script>
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
<script type='text/javascript' src='js/agentDashboard.js'></script>

</body>