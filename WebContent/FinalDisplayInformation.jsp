<%@page import="ExamplePackage.SelectedRoom"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
  
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
  <title>My Reservation</title>
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.1.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
  <style>
  <!--.jumbotron {
      background-color: #f4511e;
      color: #fff;
      padding: 100px 25px;
  }
  .container-fluid {
      padding: 60px 50px;
  }
  .bg-grey {
      background-color: #f6f6f6;
  }-->
  .logo-small {
      color: #f4511e;
      font-size: 50px;
  }
  .logo {
      color: #f4511e;
      font-size: 200px;
  }
  .thumbnail {
      padding: 0 0 15px 0;
      border: none;
      border-radius: 0;
  }
  .thumbnail img {
      width: 100%;
      height: 100%;
      margin-bottom: 10px;
  }
  .carousel-control.right, .carousel-control.left {
     background-image: none;
     color: #f4511e;
  }
  .carousel-indicators li {
      border-color: #f4511e;
  }
  .carousel-indicators li.active {
      background-color: #f4511e;
  }
  .item h4 {
      font-size: 19px;
      line-height: 1.375em;
      font-weight: 400;
      font-style: italic;
      margin: 70px 0;
  }
  .item span {
      font-style: normal;
  }
  @media screen and (max-width: 768px) {
    .col-sm-4 {
      text-align: center;
      margin: 25px 0;
    }
  }
  </style>
</head>
<body>

<%
HttpSession fsession =request.getSession();
SelectedRoom room=(SelectedRoom) fsession.getAttribute("SelectedRoomSession"); 
 %>
<!-- Container (Pricing Section) -->
<div class="container-fluid">
  <div class="text-center">
    <h2>Your Reservation Receipt:</h2>
    
  </div>
  <div class="row">
    <div class="col-sm-6 col-md-6 col-xs-6">
      <div class="panel panel-default text-center">
        <div class="panel-heading">
          <h1><b>Room No :</b><%=room.getRoomid()%></h1>
        </div>
        <div class="panel-body">
          <p><strong>Standard</strong></p>
          <p><strong>Meal Plan</strong>type</p>
          <p><strong>Cab Plan</strong>type</p>
          <p><strong>start Date</strong></p>
          <p><strong>End Date</strong></p>
        </div>
        <div class="panel-footer">
          <h3>Total Cost</h3>
          

        </div>
      </div>
    </div>
    <div class="col-sm-6 col-md-6 col-xs-6">
      <div class="panel panel-default text-center">
        <div class="panel-heading">
          <h1>Pricing</h1>
        </div>
        <div class="panel-body">
          <p><strong><%=room.getRoomPrice()%></strong>$ </p>
          <p><strong><%=room.getMealprice()%></strong>$</p>
          <p><strong><%=room.getVehicleprice()%></strong>$</p>
          <p><strong><%=room.getFromDate()%></strong></p>
          <p><strong><%=room.getToDate()%></strong></p>
        </div>
        <div class="panel-footer">
          <h3><%=room.getTotalprice()%></strong>$</h3>
          
          
        </div>
      </div>
    </div>
    
	<div class="col-sm-6 col-md-6 col-xs-12">
     <!-- <div class="panel panel-default text-center">-->
        <div class="panel-heading">
        <form action="UserLogged.jsp">
     <button onClick="UserLogged.jsp" type="submit" class="btn btn-primary col-md-12" "form-group">Finish</button>
</form>
    
        </div>
      <!--</div>-->
    </div>



</body>
</html>

