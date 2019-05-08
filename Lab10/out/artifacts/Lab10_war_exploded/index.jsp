<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>Index.jsp</title>
    <style>
      span{
        margin-right: 10px;
      }
    </style>
  </head>
  <body>


    <span>Several info via servlet: </span>
    <form method="get" action="get_servlet_info">
      <input type="submit" value="Show Info"/>
    </form>

    <br>
    <br>

    <form method="get" action="LoginForm.jsp">
      <input type="submit" value="Go to login"/>
    </form>

  </body>
</html>
