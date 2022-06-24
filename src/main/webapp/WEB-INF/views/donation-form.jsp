<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="input" uri="http://www.springframework.org/tags/form" %>


<!DOCTYPE html>

<jsp:include page="head.jsp"/>


<body>

<form:form modelAttribute="donation" action="/donation" method="post">

<%--    <div>--%>
<%--        <form:checkboxes path="categories" items="${categories}" itemValue="id" itemLabel="name"/>--%>
<%--    </div>--%>
    <div>
        <c:forEach items="${categories}" var="category">
            <p> <form:checkbox path="categories" value="${category.id}" label="${category.name}"/></p><br>
        </c:forEach>
    </div>


    <div>
        <p><form:radiobuttons path="institution" items="${institutions}" itemValue="id" itemLabel="name"/></div></p>
    </div>

    <div>
        kod-pocztowy:<p><form:input path="zipCode"/></p>
        ulica:<p><form:input path="street"/></p>
        miasto:<p><form:input path="city"/></p>
        ilosc:<p><form:input path="quantity"/></p>
        komentarz<p><form:textarea path="pickUpComment"/></p>
        data odbioru:<p><form:input type="date" path="pickUpDate"/></p>
        czs odbioru:<p><form:input type="time" path="pickUpTime"/></p>

    <form:button>Zatwierdz</form:button>
    </div>

</form:form>


</body>
</html>