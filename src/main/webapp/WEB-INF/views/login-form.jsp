<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix = "fmt" uri = "http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>


<jsp:include page="head.jsp"/>

<body>
<jsp:include page="header.jsp"/>

<section class="login-page">
    <h2>Zaloguj się</h2>

<form:form action="/login" modelAttribute="loginForm" method="post">

        <div class="form-group">
            <form:input path="userName" placeholder="userName"/>
        </div>

        <div class="form-group">
            <form:input path="email" placeholder="email"/>
        </div>

        <div class="form-group">
        <form:input path="password" placeholder="password"/>
            <a href="#" class="btn btn--small btn--without-border reset-password">Przypomnij hasło</a>
        </div>

        <div class="form-group form-group--buttons">
            <a href="#" class="btn btn--without-border">Załóż konto</a>
            <button class="btn" type="submit">Zaloguj się</button>
        </div>

    </form:form>
</section>

<%@include file="footer.jsp" %>

<script src="<c:url value="resources/js/app.js"/>"></script>
</body>
</html>


