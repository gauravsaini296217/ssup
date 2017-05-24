<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<body>
<div class="request-status-box">
<form:form modelAttribute="dailyOnline" method="post"  cssClass="input-box" action="/ssup/user/dailyonline" >
<h3>Daily Online</h3>
<table>
<tr>
<td><form:label path="urn">Urn</form:label></td>
<td><form:input type="text" path="urn" /></td>
<td><form:errors path="urn" cssClass="error"></form:errors></td>
</tr>

</table>
    
<input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}" >
<input type="submit" value="Submit"/>
</form:form>
</div>
<c:if test="${not empty result}">
<div class="result-view">


            <table class="result-table">

                <tr><th>SNo</th>
                    <th>Urn</th>
                    <th>Urn Status</th>
                    <th>Role</th>
                    <th>Username</th>
                    <th>UserID</th>
                    <th>Process Date</th>
                </tr>    
                <c:forEach var="item" items="${result}">
                    <tr>   <td>${item.sno}</td>
                        <td>${item.urn}</td>
                        <td>${item.urnStatus}</td>   
                        <td>${item.p_role}</td>
                        <td>${item.username}</td>
                        <td>${item.userId}</td>
                        <td>${item.processDate}</td>
                    </tr>
                </c:forEach>
      
</table>
</div>
</c:if>
</body>