
<html>
<head>
       <meta charset="UTF=8">
       <title>Insert title here</title>
</head>
<body>
   <%
       String name=(String)request.getAttribute("userdata");
    %>
   <h2>
        welcome<%=name%>
   </h2>
</body>
</html>