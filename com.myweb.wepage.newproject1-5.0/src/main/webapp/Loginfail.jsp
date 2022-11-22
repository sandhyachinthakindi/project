
<!DOCTYPE html>
<html>
<head>
     <meta charset="ISO-8859-1">
     <title>Insert title here</title>
</head>
<body>
    <% 
        String name=(String)request.getAttribute("LOGINSTATUS");
    %>
    
    
can't login<%=name %>
<a href="./register.html"> please get registered if you don't have an account or check your login details.</a>


</body>
</html>