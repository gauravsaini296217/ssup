<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<body>
<div class="request-status-box">
<form:form modelAttribute="requestStatus" method="post"  cssClass="input-box" action="/ssup/user/request-status" >
<h3>Request Status</h3>
<table>
<tr>
<td><form:label path="inputType">InputType</form:label></td>
<td><form:select path="inputType">
<form:option value="Inward">Inward</form:option>
<form:option value="Aadhaar">Aadhaar</form:option>
<form:option value="Urn">Urn</form:option>
</form:select></td>
<td><form:errors path="inputType" cssClass="error"></form:errors></td>
</tr>

<tr>
<td><form:label path="input">Input</form:label></td>
<td><form:input type="text" path="input" /></td>
<td><form:errors path="input" cssClass="error"></form:errors></td>
</tr>

</table>
    
<input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}" >
<input type="submit" value="Submit"/>
</form:form>
</div>
<c:if test="${not empty result}">
<div class="result-view">


            <table class="result-table">

                <tr><th>Inward No</th>
                    <th>Name of Resident</th>
                    <th>Language</th>
                    <th>Aadhaar No</th>
                    <th>Mobile No</th>
                    <th>State</th>
                    <th>Entry Date</th>
                    <th>Urn No</th>
                    <th>Status</th>
                    <th>Urn Status Date</th>
                </tr>    
                <c:forEach var="item" items="${result}">
                    <tr>   <td>${item.inwardno}</td>
                        <td>${item.nameofresident}</td>
                        <td>${item.language}</td>   
                        <td>${item.aadharno}</td>
                        <td>${item.mobileno}</td>
                        <td>${item.state}</td>
                        <td>${item.entrydate}</td>
                        <td>${item.URNO}</td>
                        <td>${item.STATUSU}</td>
                        <td>${item.URNSTATUSDATE}</td>
                    </tr>
                </c:forEach>
      
</table>
</div>
</c:if>
</body>