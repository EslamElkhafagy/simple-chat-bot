
<%@page import="com.kbs.controller.CSController"%>
<%@page import="com.kbs.pojo.User"%>

<%= session.getAttribute("user") %>
<%
    if (session.getAttribute("user") == null) {

        response.sendRedirect("register.jsp");
        return;
    }

    User user = (User) session.getAttribute("user");

%>


<%
    CSController csCon=new CSController();
    
    

%>

<!DOCTYPE html>
<html>
    <head>
        <title>KBS Project</title>
        <link rel="stylesheet" type="text/css" href="vendor/font-awesome/css/font-awesome.css">
        <link rel="stylesheet" type="text/css" href="css/style.css">
    </head>
    <body>
        <div class="container clearfix">



            <div class="chat">
                <div class="chat-header clearfix">
                    <img src="image/aa.jpg" alt="avatar" />

                    <div class="chat-about">
                        <div class="chat-with">Chat with Chat Bot</div> <!-- End chat-with -->
                        <div class="chat-num-messages">already 1 902 messages</div> <!-- End chat-num-messages -->
                    </div> <!--  End chat-about -->
                    <!--                <i class="fa fa-star"></i>-->
                </div> <!-- end chat-header -->

                <div class="chat-history">
                    <ul>
                        <li class="clearfix">
                            <div class="message-data align-right">
                                <span class="message-data-time" >10:10 AM, Today</span> &nbsp; &nbsp;
                                <span class="message-data-name" >Bot</span> <i class="fa fa-circle me"></i>
                            </div> <!-- End message-data -->
                            <div class="message other-message float-right">
                                Hi Abdelhameed, how are you? How is the project now?
                            </div> <!-- End message -->
                        </li>

                        <li class="clearfix">
                            <div class="message-data">
                                <span class="message-data-name"><i class="fa fa-circle online"></i> <%= user.getUsername() %></span>
                                <span class="message-data-time">10:12 AM, Today</span>
                            </div>
                            <div class="message my-message">
                                Lorem ipsum dolor sit amet, consectetur adipisicing elit, sed do eiusmod
                            </div>
                        </li>

                        <li class="clearfix">
                            <div class="message-data align-right">
                                <span class="message-data-time" >10:14 AM, Today</span> &nbsp; &nbsp;
                                <span class="message-data-name" >Bot</span> <i class="fa fa-circle me"></i>

                            </div>
                            <div class="message other-message float-right">
                                Lorem ipsum dolor sit amet, consectetur adipisicing elit, sed do eiusmod
                                tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam,
                            </div>
                        </li>

                        <li class="clearfix">
                            <div class="message-data">
                                <span class="message-data-name"><i class="fa fa-circle online"></i> Abdelhameed</span>
                                <span class="message-data-time">10:20 AM, Today</span>
                            </div>
                            <div class="message my-message">
                                Actually everything was fine. I'm very excited to show this to our team.
                            </div>
                        </li>

                    </ul>
                </div> <!-- end chat-history -->

                <div class="chat-message clearfix">
                    <div class="typing">
                        <i class="fa fa-circle online"></i>
                        <i class="fa fa-circle online" style="color: #AED2A6"></i>
                        <i class="fa fa-circle online" style="color:#DAE9DA"></i>
                    </div>
                    <textarea name="message-to-send" id="message-to-send" placeholder ="Type your message" rows="3"></textarea>

                    <!--                <i class="fa fa-file-o"></i> &nbsp;&nbsp;&nbsp;-->
                    <!--                <i class="fa fa-file-image-o"></i>-->

                    <button><i class="fa fa-paper-plane"></i></button>
                </div> <!-- end chat-message -->

            </div> <!-- end chat -->

        </div> <!-- end container -->
        <script id="message-template" type="text/x-handlebars-template">
            <li class="clearfix">
            <div class="message-data align-right">
            <span class="message-data-time" >{{time}}, Today</span> &nbsp; &nbsp;
            <span class="message-data-name" >Bot</span> <i class="fa fa-circle me"></i>
            </div>
            <div class="message other-message float-right">
            {{messageOutput}}
            </div>
            </li>
        </script>

        <script id="message-response-template" type="text/x-handlebars-template">
            <li>
            <div class="message-data">
            <span class="message-data-name"><i class="fa fa-circle online"></i> Abdelhameed</span>
            <span class="message-data-time">{{time}}, Today</span>
            </div>
            <div class="message my-message">
            {{response}}
            </div>
            </li>
        </script>
        <script src="vendor/jquery/jquery.js"></script>
        <script src="vendor/handlebars/handlebars.js"></script>
        <script src="vendor/list/list.js"></script>
        <script src="js/main.js"></script>
    </body>
</html>