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

    <link href='/static/css/home.css' rel='stylesheet' type='text/css'/>

    <title>Home Page</title>

</head>
<body>
<div class="row">
  <div class="col-sm-4">
    <div class="nav-side-menu">
        <div class="brand">Brand Logo</div>
        <i class="fa fa-bars fa-2x toggle-btn" data-toggle="collapse" data-target="#menu-content"></i>

            <div class="menu-list">

                <ul id="menu-content" class="menu-content collapse out">
                    <li>
                      <a href="#" id="dashboardLink">
                      <i class="fa fa-dashboard fa-lg"></i> Dashboard
                      </a>
                    </li>

                     <li>
                      <a href="#" id="profileLink">
                      <i class="fa fa-user fa-lg"></i> Profile
                      </a>
                      </li>

                    <li  data-toggle="collapse" data-target="#products" class="collapsed active">
                      <a href="#" id="notificationLink"><i class="fa fa-envelope fa-lg" aria-hidden="true"></i> Notifications </a>
                    </li>

                     <li data-toggle="collapse" data-target="#subscriptions" class="collapsed">
                      <a href="#"><i class="fa fa-newspaper-o" aria-hidden="true"></i> Subscriptions <span class="arrow"></span></a>
                    </li>
                    <ul class="sub-menu collapse" id="subscriptions">
                      <li> <a href="#" id="createSubscriptionsLink"> Create New  </a></li>
                      <li> <a href="#" id="viewSubscriptionsLink">View Subscriptions </a></li>
                    </ul>

                    <li data-toggle="collapse" data-target="#serviceRequest" class="collapsed">
                      <a href="#"><i class="fa fa-globe fa-lg"></i> Service Reguests <span class="arrow"></span></a>
                    </li>
                    <ul class="sub-menu collapse" id="serviceRequest">
                          <li> <a href="#" id="createServiceRequestLink"> Create New </a></li>
                      <li>  <a href="#" id="viewServiceRequestLink"> View Requests </a></li>
                    </ul>


                    <li data-toggle="collapse" data-target="#new" class="collapsed">
                      <a href="#"><i class="fa fa-cog fa-lg" aria-hidden="true"></i> Settings <span class="arrow"></span></a>
                    </li>
                    <ul class="sub-menu collapse" id="new">
                      <li>Setting 1</li>
                      <li>Setting 2</li>
                    </ul>



                    <!-- .logout wAS HERE -->
                </ul>
                <!-- MOVED TO HERE -->
                <div class="logout">
                    <li>
                        <a>
                          <i class="glyphicon glyphicon-off"></i> LOGOUT
                         </a>
                    </li>
                 </div>
         </div>
    </div>
  </div>
  <div class="col-sm-8">
      <div class="container">
        <div class="row">
            <div id="mainContent">
            </div>
        </div>
      </div>
  </div>
</div>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.1.1/jquery.min.js"></script>
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
<script type='text/javascript' src='/static/js/home.js'></script>
</body>
</html>