<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html lang="en" xmlns:c="">
<head>
  <meta charset="UTF-8">
  <title>Login Form</title>
</head>
<body>

<form method="post" action="loginSubmit">
  <p>
    <label for="name">Name: </label>
    <input type="text" name="name" id="name" />
  </p>

<%--  <table>--%>
<%--    <td><c:out value="toto"></c:out><td>--%>
<%--  </table>--%>

  <input type="submit" />
</form>

</body>
</html>