<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<html>
<body>
<h1>${msg}</h1>
<h2>Hoy es <fmt:formatDate value="${today}" pattern="yyy-MM-dd" /></h2>
<h2>Usuario de la bd: ${user}</h2>
<h2>Conexion a la bd ${testdb}<br>${testdbdetail}</h2>
</body>
</html>