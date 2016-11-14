<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
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

	
	
	<style>
	
			@import('https://cdnjs.cloudflare.com/ajax/libs/twitter-bootstrap/3.3.0/css/bootstrap.min.css') 

.funkyradio div {
  clear: both;
  overflow: hidden;
}

.funkyradio label {
  width: 100%;
  border-radius: 3px;
  border: 1px solid #D1D3D4;
  font-weight: normal;
}

.funkyradio input[type="radio"]:empty,
.funkyradio input[type="checkbox"]:empty {
  display: none;
}

.funkyradio input[type="radio"]:empty ~ label,
.funkyradio input[type="checkbox"]:empty ~ label {
  position: relative;
  line-height: 2.5em;
  text-indent: 3.25em;
  margin-top: 2em;
  cursor: pointer;
  -webkit-user-select: none;
     -moz-user-select: none;
      -ms-user-select: none;
          user-select: none;
}

.funkyradio input[type="radio"]:empty ~ label:before,
.funkyradio input[type="checkbox"]:empty ~ label:before {
  position: absolute;
  display: block;
  top: 0;
  bottom: 0;
  left: 0;
  content: '';
  width: 2.5em;
  background: #D1D3D4;
  border-radius: 3px 0 0 3px;
}

.funkyradio input[type="radio"]:hover:not(:checked) ~ label,
.funkyradio input[type="checkbox"]:hover:not(:checked) ~ label {
  color: #888;
}

.funkyradio input[type="radio"]:hover:not(:checked) ~ label:before,
.funkyradio input[type="checkbox"]:hover:not(:checked) ~ label:before {
  content: '\2714';
  text-indent: .9em;
  color: #C2C2C2;
}

.funkyradio input[type="radio"]:checked ~ label,
.funkyradio input[type="checkbox"]:checked ~ label {
  color: #777;
}

.funkyradio input[type="radio"]:checked ~ label:before,
.funkyradio input[type="checkbox"]:checked ~ label:before {
  content: '\2714';
  text-indent: .9em;
  color: #333;
  background-color: #ccc;
}

.funkyradio input[type="radio"]:focus ~ label:before,
.funkyradio input[type="checkbox"]:focus ~ label:before {
  box-shadow: 0 0 0 3px #999;
}

.funkyradio-default input[type="radio"]:checked ~ label:before,
.funkyradio-default input[type="checkbox"]:checked ~ label:before {
  color: #333;
  background-color: #ccc;
}

.funkyradio-primary input[type="radio"]:checked ~ label:before,
.funkyradio-primary input[type="checkbox"]:checked ~ label:before {
  color: #fff;
  background-color: #337ab7;
}

.funkyradio-success input[type="radio"]:checked ~ label:before,
.funkyradio-success input[type="checkbox"]:checked ~ label:before {
  color: #fff;
  background-color: #5cb85c;
}

.funkyradio-danger input[type="radio"]:checked ~ label:before,
.funkyradio-danger input[type="checkbox"]:checked ~ label:before {
  color: #fff;
  background-color: #d9534f;
}

.funkyradio-warning input[type="radio"]:checked ~ label:before,
.funkyradio-warning input[type="checkbox"]:checked ~ label:before {
  color: #fff;
  background-color: #f0ad4e;
}

.funkyradio-info input[type="radio"]:checked ~ label:before,
.funkyradio-info input[type="checkbox"]:checked ~ label:before {
  color: #fff;
  background-color: #5bc0de;
}

/* SCSS STYLES */
/*
.funkyradio {

    div {
        clear: both;
        overflow: hidden;
    }

    label {
        width: 100%;
        border-radius: 3px;
        border: 1px solid #D1D3D4;
        font-weight: normal;
    }

    input[type="radio"],
    input[type="checkbox"] {

        &:empty {
            display: none;

            ~ label {
                position: relative;
                line-height: 2.5em;
                text-indent: 3.25em;
                margin-top: 2em;
                cursor: pointer;
                user-select: none;

                &:before {
                    position: absolute;
                    display: block;
                    top: 0;
                    bottom: 0;
                    left: 0;
                    content: '';
                    width: 2.5em;
                    background: #D1D3D4;
                    border-radius: 3px 0 0 3px;
                }
            }
        }

        &:hover:not(:checked) ~ label {
            color: #888;

            &:before {
                content: '\2714';
                text-indent: .9em;
                color: #C2C2C2;
            }
        }

        &:checked ~ label {
            color: #777;

            &:before {
                content: '\2714';
                text-indent: .9em;
                color: #333;
                background-color: #ccc;
            }
        }

        &:focus ~ label:before {
            box-shadow: 0 0 0 3px #999;
        }
    }

    &-default {
        input[type="radio"],
        input[type="checkbox"] {
            &:checked ~ label:before {
                color: #333;
                background-color: #ccc;
            }
        }
    }

    &-primary {
        input[type="radio"],
        input[type="checkbox"] {
            &:checked ~ label:before {
                color: #fff;
                background-color: #337ab7;
            }
        }
    }

    &-success {
        input[type="radio"],
        input[type="checkbox"] {
            &:checked ~ label:before {
                color: #fff;
                background-color: #5cb85c;
            }
        }
    }

    &-danger {
        input[type="radio"],
        input[type="checkbox"] {
            &:checked ~ label:before {
                color: #fff;
                background-color: #d9534f;
            }
        }
    }

    &-warning {
        input[type="radio"],
        input[type="checkbox"] {
            &:checked ~ label:before {
                color: #fff;
                background-color: #f0ad4e;
            }
        }
    }

    &-info {
        input[type="radio"],
        input[type="checkbox"] {
            &:checked ~ label:before {
                color: #fff;
                background-color: #5bc0de;
            }
        }
    }
}
*/

	
	
	
	
	
	
	
	</style>
	
	
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
                        <a href="listofrooms.html">BACK</a>
                    </li>
                    
                </ul>
            </div>
            
        </div>
        
    </nav>
	
    <!-- Page Content -->
    <div class="container">

        <!-- Jumbotron Header -->
        <header class="jumbotron hero-spacer">
            <h2>Meal Plan</h2>
		  </p>
        </header>

        <hr>

  

        <!-- Page Features -->
        <div class="row text-center">
            <!--start of code for radio buton -->
			
			
			<div class="col-md-12">
				<div class="col-md-6">
				<h4>Select a Meal Plan</h4>
                 <form action="GoToVehiclePageServlet">
					<div class="funkyradio" id="mealtype">
						<div class="funkyradio-default">
							<input type="radio" name="radio" id="radio1" value="None" checked/>
							<label for="radio1">None</label>
						</div>
						<div class="funkyradio-primary">
							<input type="radio" name="radio" id="radio2" value="Breakfast"  />
							<label for="radio2">Breakfast</label>
						</div>
						<div class="funkyradio-success">
							<input type="radio" name="radio" id="radio3" value="Breakfast + Lunch" />
							<label for="radio3">Breakfast + Lunch</label>
						</div>
						<div class="funkyradio-danger">
							<input type="radio" name="radio" id="radio4" value="Breakfast + Lunch + Dinner"/>
							<label for="radio4">Breakfast + Lunch + Dinner</label>
						</div>
						
						
					</div>
					<br>
					<button type="submit" class="btn btn-primary col-md-12" "form-group">Proceed</button>
				</div>
				</form>
			
</div>
			

			
			
			
			
			<!--end of code for radio buton -->
			
			
			
        </div>
        <!-- /.row -->

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
