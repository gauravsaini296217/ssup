<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles"%>  
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>  
<head> 
<meta name="viewport" content="width=device-width, initial-scale=1.0"> 
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">  
<link href="<c:url value="/resources/css/style.css" />" rel="stylesheet">
<title><tiles:insertAttribute name="title" ignore="true" /></title>  
</head>  
<body class="bclass">  
        <div class="header"><tiles:insertAttribute name="header" /></div>  
        <div><tiles:insertAttribute name="body" /></div>  
        <div style="clear:both"><tiles:insertAttribute name="footer" /></div>  
  
</body>  
</html>  