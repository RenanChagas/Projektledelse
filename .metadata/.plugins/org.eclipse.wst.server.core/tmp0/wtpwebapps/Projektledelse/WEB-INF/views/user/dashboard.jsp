<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
		<title>Projektledelse</title>
		
    	<link type="text/css" rel="stylesheet" media="screen,projection" href="<c:url value='/static/css/materialize.css' />"/>
		<link type="text/css" rel="stylesheet" href="<c:url value='/static/css/material.css' />"/>

		<script src="<c:url value="/static/js/jquery-2.1.4.min.js" />"></script>
    	<script src="<c:url value="/static/js/materialize.min.js" />"></script>
    	<script src="<c:url value="/static/js/material.min.js" />"></script>
    	<!-- circliful -->
    	<script src="<c:url value="/static/js/jquery.circliful.js" />"></script>

    	<!-- Icon font -->
    	<link rel="stylesheet" href="https://fonts.googleapis.com/icon?family=Material+Icons">
    	<link href='https://fonts.googleapis.com/css?family=Roboto|Montserrat' rel='stylesheet' type='text/css'>

		<!--Let browser know website is optimized for mobile-->
      	<meta name="viewport" content="width=device-width, initial-scale=1.0"/>

	</head>
<body>

	<!-- Simple header with scrollable tabs - Begin -->
	<div class="mdl-layout mdl-js-layout mdl-layout--fixed-header">
		<header class="mdl-layout__header">

			<!-- Search Row - Begin -->
			<div class="mdmc-container-search">
				<div class="mdl-layout__header-row-dashboard">

				<!-- Logo -->
				<div class="mdlc-dashboard-logo"></div>

				<!-- Search Box - Begin -->
				<nav clas="navbar-fixed">
					<div class="nav-wrapper">
						<div class="mdlc-dashboard-search">
							<form>
					      <div class="input-field invalid white-text ">
					        <div class="material-icons mdmc-prefix-search">search</div>
					          <input type="text" id="search" name="search" placeholder="Search" class="mdmc-search-icon-left">
					      </div>
					    </form>
					  </div>
					</div>
				</nav>
				<!-- Search Box - End -->

				<!-- Avatar - Begin -->
				<div class="mdlc-dashboard-avatar">
					
					<img src="<c:url value="/static/images/Avatar_1.png" />" class="mdmc-circle-border">
					
						<span>Renan Chagas</span>

						<button id="demo-menu-lower-right" class="mdl-button mdl-js-button mdl-button--icon">
							<i class="material-icons">more_vert</i>
						</button>

						<ul class="mdl-menu mdl-menu--bottom-right mdl-js-menu mdl-js-ripple-effect"
								for="demo-menu-lower-right">
							<li class="mdl-menu__item">Some Action</li>
							<li class="mdl-menu__item">Another Action</li>
							<li disabled class="mdl-menu__item">Disabled Action</li>
							<li class="mdl-menu__item">Yet Another Action</li>
						</ul>
					</div>
				</div>
				<!-- Avatar - End -->
	   
	    	</div>
	    	<!-- Search Row - End -->
	    
	    <!-- Tabs -->
	    <div class="mdl-layout__tab-bar mdl-js-ripple-effect">
	      <a href="#scroll-tab-1" class="mdl-layout__tab is-active">My Courses</a>
	      <a href="#scroll-tab-2" class="mdl-layout__tab">Some Action</a>
	      <a href="#scroll-tab-3" class="mdl-layout__tab">Another Action</a>
	      <a href="#scroll-tab-4" class="mdl-layout__tab">Disabled Action</a>
	      <a href="#scroll-tab-5" class="mdl-layout__tab">One Action</a>
	      <a href="#scroll-tab-6" class="mdl-layout__tab">More Action</a>
	    </div>

	  </header>

	  <main class="mdl-layout__content">

		<!-- Courses - Begin -->
	   	<section class="mdl-layout__tab-panel is-active" id="scroll-tab-1">
	    	<div class="page-content">
				<br>
			<div class="mdmc-container-card">
				<div class="row">
        			<div class="col s12">
        			
					<!-- Card Content - Begin -->
          			<div class="card small mdmc-visible mdmc-card-small-350">

						<!-- Card Menu - Begin -->
						<div class="row">
							<div class="col s12 m6 l8">

							<!-- Card Menu Title - Begin -->
							<div class="mdmc-dashboard-card-menu">

							<!-- Courses Availables -->
							<a class="mdl-button mdl-js-button dropdown-button mdmc-dashboard-card-menu-margin-left" 
								href="#" data-activates="dropdown-card-title" data-beloworigin="true">
								Active Courses
							<i class="tiny material-icons">expand_more</i>
							</a>

							<!-- Courses Dropdown Structure -->
								<ul id='dropdown-card-title'
									class="mdmc-dropdown-content-card-title mdmc-box-shadow-min " constrainwidth="false">
									<li>
										<a href="#!">Favorite Courses
											<span class="mdl-badge mdlc-badge-dashboard" data-badge="6"></span>
										</a>
									</li>
									<li>
										<a href="#!">Latest Courses
											<span class="mdl-badge mdlc-badge-dashboard" data-badge="4"></span>
										</a>
									</li>
									<li>
										<a href="#!">Important Courses
											<span class="mdl-badge mdlc-badge-dashboard" data-badge="5"></span>
										</a>
									</li>
								</ul>
							</div>
							</div>
							<!-- Card Menu Title - End -->
							
							<!-- Card Menu buttons- Begin -->
							<div class="col s12 m6 l4">
								<div class="mdmc-dashboard-card-menu right">

									<!-- Add Icon -->
									<button id="add_course" type="submit"
												class="btn waves-effect waves-light blue mdmc-dashboard-card-menu-margin"  name="Add">
	                					<i class="material-icons left">add</i>
										Add
	                				</button>

									<!-- Settings Icon -->
									<button id="card-dashboard-settings" class="mdl-button mdl-js-button mdl-button--icon
												mdmc-dashboard-card-menu-margin-icon">
										<i class="material-icons">settings</i>
									</button>

									<ul class="mdl-menu mdl-menu--bottom-right mdl-js-menu mdl-js-ripple-effect"
										for="card-dashboard-settings">
										<li class="mdl-menu__item">Some Action</li>
										<li class="mdl-menu__item">Another Action</li>
										<li disabled class="mdl-menu__item">Disabled Action</li>
										<li class="mdl-menu__item">Yet Another Action</li>
									</ul>

									<!-- Reorder Icon -->
									<button id="card-dashboard-reorder" class="mdl-button mdl-js-button mdl-button--icon
												mdmc-dashboard-card-menu-margin-icon">
										<i class="material-icons">reorder</i>
									</button>

									<ul class="mdl-menu mdl-menu--bottom-right mdl-js-menu mdl-js-ripple-effect"
										for="card-dashboard-reorder">
										<li class="mdl-menu__item">Some Action</li>
										<li class="mdl-menu__item">Another Action</li>
										<li disabled class="mdl-menu__item">Disabled Action</li>
										<li class="mdl-menu__item">Yet Another Action</li>
									</ul>
								</div>
							</div>
							<!-- Card Menu buttons- End -->
							
							</div>
							<!-- Card Menu - End -->

							<!-- Card Main Content - Begin -->

							<!-- Message when no courses are available -->
							<div class="mdmc-container-card-title" hidden="true">
								<div class="mdmc-text-align-center mdmc-text-title">
									There are currently no courses available
								</div>
							</div>

							<!-- Courses Progress - Begin -->
							<div class="row">

								<!-- Course 1 - Begin -->
								<div class="col">
									<div class="mdmc-dashboard-card-courses">
									
									<!-- Progress Bar -->
										<div id="myStat2" data-dimension="200" data-text="70" data-info="Days" data-width="30" 
											data-fontsize="38" data-percent="70" data-fgcolor="#2196F3" data-bgcolor="#eee">
										</div>
											
										<div class="mdmc-dashboard-courses-size ">
											<div class="mdmc-dashboard-center mdmc-dashboard-bottom">
												Java
											</div>
										</div>
									</div>
								</div>
								<!-- Course 1 - End -->
								
								<!-- Course 2 - Begin -->
								<div class="col">
									<div class="mdmc-dashboard-card-courses">
									
									<!-- Progress Bar -->
										<div id="myStat3" data-dimension="200" data-text="35" data-info="Days" data-width="30" 
											data-fontsize="38" data-percent="40" data-fgcolor="#2196F3" data-bgcolor="#eee">
										</div>
												
										<div class="mdmc-dashboard-courses-size ">
											<div class="mdmc-dashboard-center mdmc-dashboard-bottom">
												GBS Security
											</div>
										</div>
									</div>
								</div>
								<!-- Course 2 - End -->

							</div>
							<!-- Courses Progress - End -->

							<!-- Expand Card -->
							<div class="mdmc-dashboard-card-expand">
								<a class="btn-floating btn-large waves-effect waves-light blue">
									<i class="material-icons">expand_more</i>
								</a>
							</div>

					</div>
					<!-- Card Content - End -->
							
							
				</div>
				</div>
			</div>
			</div>
	    </section>
	    <!-- Courses - END -->

	    <section class="mdl-layout__tab-panel" id="scroll-tab-2">
	      <div class="page-content"><!-- Your content goes here --></div>
	    </section>
	    <section class="mdl-layout__tab-panel" id="scroll-tab-3">
	      <div class="page-content"><!-- Your content goes here --></div>
	    </section>
	    <section class="mdl-layout__tab-panel" id="scroll-tab-4">
	      <div class="page-content"><!-- Your content goes here --></div>
	    </section>
	    <section class="mdl-layout__tab-panel" id="scroll-tab-5">
	      <div class="page-content"><!-- Your content goes here --></div>
	    </section>
	    <section class="mdl-layout__tab-panel" id="scroll-tab-6">
	      <div class="page-content"><!-- Your content goes here --></div>
	    </section>
	  </main>
	  
	</div>
	<!-- Simple header with scrollable tabs - Begin -->
	
	<script type="text/javascript">
			$( document ).ready(function(){

				$('#myStat2').circliful();
				$('#myStat3').circliful();

				$('.mdl-button').dropdown({
					constrain_width: false, // Does not change width of dropdown to that of the activator
					gutter: 0, // Spacing from edge
					belowOrigin: true, // Displays dropdown below the button
					alignment: 'left' // Displays dropdown with edge aligned to the left of button
					});


			});

			//Progress Courses
			$('#myStat2').hover(function () {

				$('#myStat2').find("span.circle-text").css('font-size','45px');
				$('#myStat2').find("span.circle-text").css('color','#2196F3');

				},
				function () {
				$('#myStat2').find("span.circle-text").css('font-size','38px');
				$('#myStat2').find("span.circle-text").css('color','#000');
				}
			);

			//Progress Courses
			$('#myStat3').hover(function () {

				$('#myStat3').find("span.circle-text").css('font-size','45px');
				$('#myStat3').find("span.circle-text").css('color','#2196F3');

				},
				function () {
				$('#myStat3').find("span.circle-text").css('font-size','38px');
				$('#myStat3').find("span.circle-text").css('color','#000');
				}
			);


	</script>

</body>
</html>