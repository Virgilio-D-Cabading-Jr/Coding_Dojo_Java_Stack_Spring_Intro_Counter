<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!--/////////////////////////////////////////////////////
//	COUNTER JSP
///////////////////////////////////////////////////////// -->

<!DOCTYPE html>
<html lang="en">
<head>
	<meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
	<meta name="viewport" content="width=device-width, initial-scale=1.0">
    <!-- ---- CSS LINKS --------------------------------- -->
    <link rel="stylesheet" href="/webjars/bootstrap/css/bootstrap.min.css">
	<link rel="stylesheet" type="text/css" href="css/style.css">
	<title>Counter</title>
</head>
<body>
    	<!-- //// HEADER //////// -->
	<header>
		<div class="navbar navbar-dark box-shadow">
			<div class="container d-flex justify-content-between">
				<a href="/" class="navbar-brand d-flex align-items-center"> 
					<strong>Counter</strong>
				</a> <a class="btn btn-dblue" href="/">HOME</a>
			</div>
		</div>
	</header>

	<!-- //// MAIN AREA //////// -->
	<main role="main">
		<div class="container mt-4">
			<h1>
				You have visited <a href="/">this site</a>
				<c:out value="${ count }"></c:out>
				times.
					
			</h1>
			<div class="btn btn-dblue" onclick="window.location.href='/';">
				HOME
			</div>
			<div class="btn btn-success" onclick="window.location.href='/counter/addtwo';">
				ADD 2 TO COUNT
			</div>
			<div class="btn btn-danger" onclick="window.location.href='/counter/reset';">
				RESET COUNT
			</div>
		</div>
	</main>


    <!-- ---- JAVASCRIPT LINKS ---------------------------- -->
    <script src="/webjars/jquery/jquery.min.js"></script>
    <script src="/webjars/bootstrap/js/bootstrap.min.js"></script>
</body>