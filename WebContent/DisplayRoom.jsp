 <%@page import="java.util.*" %>
  <%@page import="ExamplePackage.RoomBean" %>


<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<%
ArrayList<RoomBean> list = (ArrayList<RoomBean>)request.getAttribute("list");
 %>
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<head>

    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <meta name="description" content="">
    <meta name="author" content="">

    <title>List Of Rooms</title>

    <!-- Bootstrap Core CSS -->
    <link href="css/bootstrap.min.css" rel="stylesheet">

    <!-- Custom CSS -->
    <link href="css/heroic-features.css" rel="stylesheet">

    <!-- HTML5 Shim and Respond.js IE8 support of HTML5 elements and media queries -->
    <!-- WARNING: Respond.js doesn't work if you view the page via file:// -->
    <!--[if lt IE 9]>
        <script src="https://oss.maxcdn.com/libs/html5shiv/3.7.0/html5shiv.js"></script>
        <script src="https://oss.maxcdn.com/libs/respond.js/1.4.2/respond.min.js"></script>
    <![endif]-->
    <!-- Place favicon.ico and apple-touch-icon.png in the root directory -->
	<link rel="shortcut icon" href="favicon.ico">
	<!-- <link href='https://fonts.googleapis.com/css?family=Lato:400,100,100italic,300,300italic,400italic,700italic,900,700,900italic' rel='stylesheet' type='text/css'> -->

	<!-- Stylesheets -->
	<!-- Dropdown Menu -->
	<link rel="stylesheet" href="css/superfish.css">
	<!-- Owl Slider -->
	<!-- <link rel="stylesheet" href="css/owl.carousel.css"> -->
	<!-- <link rel="stylesheet" href="css/owl.theme.default.min.css"> -->
	<!-- Date Picker -->
	<link rel="stylesheet" href="css/bootstrap-datepicker.min.css">
	<!-- CS Select -->
	<link rel="stylesheet" href="css/cs-select.css">
	<link rel="stylesheet" href="css/cs-skin-border.css">

</head>

<body class="fh5co-parallax" style="background-image: url(images/slider1.jpg);" data-stellar-background-ratio="0.5">

    <!-- Navigation -->
    <nav class="navbar navbar-inverse navbar-fixed-top" role="navigation">
        <div class="container">
            
            <div class="navbar-header">
                <button type="button" class="navbar-toggle" data-toggle="collapse" data-target="#bs-example-navbar-collapse-1">
                    <span class="sr-only">Toggle navigation</span>
                    <span class="icon-bar"></span>
                    <span class="icon-bar"></span>
                    <span class="icon-bar"></span>
                </button>
                <a class="navbar-brand " href="#">ABC HOTEL</a>
            </div>
            
            <div class="collapse navbar-collapse" id="bs-example-navbar-collapse-1">
                <ul class="nav navbar-nav">
                    <li>
                        <a href="search.html">BACK</a>
                    </li>
                    
                </ul>
            </div>
            
        </div>
        
    </nav>
	
    <!-- Page Content -->
    <div class="container">

        <hr>

        <!-- Title -->
        <div class="row">
            <div class="col-lg-12">
                <h3>Rooms </h3>
            </div>
        </div>
        <!-- /.row -->

        <!-- Page Features -->
 
 
 
<%
//if (room != null && !room.isEmpty()) {
%>
<table border="1" width="80%" align="center" style="color:black">
<tr>
<td>Image</td>
<td>Room Number</td>
<td>Category</td>
<td>Features</td>
<td>Price</td>
<td>Select</td>



</tr>
<%
for(RoomBean objRoomBean: list){

%>
<tr style="color:black" >
<td><%=objRoomBean.getR_image()%></td>
<td><%=objRoomBean.getRoom_id()%></td>
<td><%=objRoomBean.getRoom_type()%></td>
<td><%=objRoomBean.getRfeatures() %></td>
<td><%=objRoomBean.getRprice()%></td> 
<td><form action="BookingServlet" method="post">

	<input type="hidden" name="id" value=<%=objRoomBean.getRoom_id()%>>
	
	<input type="hidden" name="price" value=<%=objRoomBean.getRprice()%>>
	
	<input type="submit" value="Book" name="submit"> </form> </td>
 </tr>

 <%} %>
 </table> 
 
 <hr>

        <!-- Footer -->
        <footer>
            <div class="row">
                <div class="col-lg-12">
                    <p>Copyright &copy; SSDI-fall-16- Team -11</p>
                </div>
            </div>
        </footer>

    </div>
    <!-- /.container -->

    <!-- jQuery -->
    <script src="js/jquery.js"></script>

    <!-- Bootstrap Core JavaScript -->
    <script src="js/bootstrap.min.js"></script>

</body>

</html>
