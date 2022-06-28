<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix = "fmt" uri = "http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>


<jsp:include page="fragments/head.jsp"/>


<section class="login-page">
    <h2>Załóż konto</h2>

    <form:form modelAttribute="user" method="post" action="/register">
    <form>
        <div class="form-group">
        <form:input path="firstName" placeholder="Imię"/>
        </div>

        <div class="form-group">
        <form:input path="lastName" placeholder="Nazwisko"/>
        </div>

        <div class="form-group">
        <form:input path="email" placeholder="email"/>
        </div>

        <div class="form-group">
        <form:input path="password" placeholder="password"/>
        </div>

<%--        <div class="form-group">--%>
<%--        <form:input path="password2" placeholder="password repat"/>--%>
<%--        </div>--%>

        <div class="form-group form-group--buttons">
            <a href="login.html" class="btn btn--without-border">Zaloguj się</a>
            <button class="btn" type="submit">Załóż konto</button>
        </div>
        </form:form>
</section>

<%@include file="fragments/footer.jsp" %>

<script src="<c:url value="resources/js/app.js"/>"></script>
</body>
</html>
