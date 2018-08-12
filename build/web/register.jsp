<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<%
    if (session.getAttribute("user") != null) {
        response.sendRedirect("index.jsp");
    }
%>



<!DOCTYPE html>
<html>
    <head>
        <title>KBS Project</title>
        <link rel="stylesheet" type="text/css" href="vendor/font-awesome/css/font-awesome.css">
        <link rel="stylesheet" type="text/css" href="css/style.css">
    </head>
    <body>

        <div class="app">
            <div class="content">
                <c:if test="${success eq 'false'}">
                    <div class="alert alert-warning">Sorry this user not available </div>
                </c:if>
                <div class="button register">
                    <div class="sign-up">SIGN UP</div>
                    <form class="hidden form" action="SignUpServlet" method="post">
                        <input type="text" placeholder="Username" name="username"/>
                        <input type="text" placeholder="Name " name="name"/>
                        <input type="password" placeholder="Password" name="password"/>
                        <button type="submit" class="hidden"><span class="text">DONE</span></button>

                    </form>
                </div> <!-- End Button -->
                <div class="button login">
                    <div class="sign-up">LOGIN</div>
                    <form class="hidden form" method="post" action="LoginServlet">
                        <input type="text" placeholder="User name " name="username"/>
                        <input type="password" placeholder="Password" name="password"/>
                        <button type="submit" class="hidden"><span class="text">DONE</span></button>
                    </form>
                </div> <!-- End Button -->
            </div> <!-- End content -->
        </div> <!-- End App -->
        <script src="vendor/jquery/jquery.js"></script>
        <!--    <script src="vendor/handlebars/handlebars.js"></script>-->
        <!--    <script src="vendor/list/list.js"></script>-->
        <script src="js/main.js"></script>
    </body>
</html>