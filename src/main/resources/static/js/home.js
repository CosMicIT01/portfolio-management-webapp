$(document).ready(function(){

    $("#dashboardLink").click(function(){
    alert('dashboard Clicked');
    $('#mainContent').load('http://localhost:8090/agent/dashboard');
    });

    $("#notificationLink").click(function(){
    alert('notification Clicked');
    });

    $("#profileLink").click(function(){
        alert('profile link Clicked');
    });
    $("#viewSubscriptionsLink").click(function(){
        $('#mainContent').load('http://localhost:8090/agent/managedSubscriptions');
    });
    $("#viewServiceRequestsLink").click(function(){
    alert('serviceRequests Clicked');
    });
    $("#createServiceRequestLink").click(function(){
        $('#mainContent').load('http://localhost:8090/servicerequest');
        });
    $("#settingsLink").click(function(){
    alert('settings Clicked');
    });

});