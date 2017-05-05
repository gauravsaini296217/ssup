<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<body>
<ul>
  <li><a href="#home">Request Status</a></li>
  <li><a href="#news">News</a></li>
  <li><a href="#contact">Contact</a></li>
  <li class="right"><a href="javascript:formSubmit()">${pageContext.request.userPrincipal.name} Logout</a></li>
</ul>

<c:url value="/logout" var="logoutUrl" />
	<form  class="frm" action="${logoutUrl}" method="post" id="logoutForm">
    <input type="hidden" name="${_csrf.parameterName}"
			value="${_csrf.token}" />
	</form>





<script>
		function formSubmit() {
			document.getElementById("logoutForm").submit();
		}
	</script>


</body>