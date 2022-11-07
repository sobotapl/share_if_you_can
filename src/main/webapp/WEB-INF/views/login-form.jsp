<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix = "fmt" uri = "http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>


<jsp:include page="fragments/head.jsp"/>


<section class="login-page">
    <h2>Zaloguj się</h2>

    <section class="login-page">
        <h2>Zaloguj się</h2>
            <form:form action="/login" modelAttribute="user" method="post">
            <div class="form-group">
                <input type="text" name="username" placeholder="UserName" />
            </div>

            <div class="form-group">
                <input type="password" name="password" placeholder="Hasło" />
                <a href="#" class="btn btn--small btn--without-border reset-password">Przypomnij hasło</a>
            </div>

            <div class="form-group form-group--buttons">
                <a href="#" class="btn btn--without-border">Załóż konto</a>
                <input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}"/>
                <button class="btn" type="submit">Zaloguj się</button>
            </div>
        <form/form>
    </section>
</section>
<%@include file="fragments/footer.jsp" %>

<script src="<c:url value="resources/js/app.js"/>"></script>
</body>
</html>


