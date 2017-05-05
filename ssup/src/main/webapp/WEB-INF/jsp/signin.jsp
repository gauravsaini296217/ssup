<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<body>
<div class="floating-box">
<div class="hometext">
<h3>SSUP Introduction</h3>
<h5>What is Aadhaar?</h5>
<p style="color:#000">Aadhaar is a 12 digit unique identification number issued by the Unique Identification Authority of India on behalf of the Government of India. Aadhaar number will be a nationally valid unique lifetime identifier for Indian residents and many services are expected to ride on Aadhaar in future. Aadhaar platform will become the country's central identity management system.
Any individual, irrespective of age and gender, who is a resident of India and satisfies the verification process laid down by the UIDAI can enroll for Aadhaar. Each Aadhaar number will be unique to an individual and will remain valid for life. The uniqueness is assured through de-duplication of resident's demographic & biometric information. The number itself is bereft of any intelligence and avoids profiling the individual.
The Aadhaar number is expected to become a convenient, real-time means for individuals to verify their identity anywhere in India.
</p>
<hr>
<h5>Need for Demographic Updates :</h5>
<p style="color:#000">Residents could have the need to update any of the data fields captured by UIDAI during resident enrolment, or during a prior update.
For demographic data update, the needs could arise from:</p>
<ul>
<li>Changes in life events such as marriage may lead to residents changing their basic demographic details such as name and address. Address and mobile number could also change due to migration to newer locations. Residents may also want changes in their relative's details due to changes in life events such marriage, death of a relative etc. In addition, residents could have other personal reasons to change their mobile number, email address etc.</li> 
<li>Changes in various service delivery platforms may lead residents to request changes to "information sharing consent", and to add mobile number to CIDR etc. </li>
<li>Errors made during the enrolment process wherein the resident's demographic data may have been captured incorrectly. Changes to "DoB/Age" and "Gender" fields are expected primarily due to enrolment errors. </li>
</ul>

<h5>What all information can be updated through ssup portal?</h5>
<p style="color:#000">Residents can update Name, Address, Gender, Date of Birth, Mobile Number and Email ID through ssup portal. For other updates, please visit Aadhaar Enrollment / Updation Center.</p>
</div>

</div>
<div class="login">
<div class="login-box"><h3>Login</h3>

<c:if test="${SPRING_SECURITY_LAST_EXCEPTION !=null}">

<div class="errorblock">
   Your Login attempt was not successful.<br/>
   ${sessionScope["SPRING_SECURITY_LAST_EXCEPTION"].message}

</div>

</c:if>

<form action="<c:url value='/login' />" method="POST">
    <label for="username">Username</label>
    <input type="text" id="username" name="username" placeholder="Your Username">

    <label for="password">Password</label>
    <input type="password" id="password" name="password" placeholder="Your Password">

    <input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}" >
    <input type="submit" value="Submit" >
    
  </form>
</div>
</div>
</body>  
