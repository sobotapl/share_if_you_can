<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="input" uri="http://www.springframework.org/tags/form" %>


<jsp:include page="fragments/head.jsp"/>
<body>
<jsp:include page="fragments/header.jsp"/>

<div data-step="5">
    <h3>Podsumowanie Twojej darowizny</h3>

<form:form modelAttribute="donation" action="/donation" method="post">
    <div class="summary">
        <div class="form-section">
            <h4>Oddajesz:</h4>
            <ul>
                <li>
                    <span class="icon icon-bag"></span>
                    <span class="summary--text">${donation.quantity}</span>
                </li>

                <li>
                    <c:forEach items="${donation.categories}" var="category" varStatus="counter">
                    <span class="icon icon-bag"></span>
                    <span class="summary--text">${category.name}</span>
                    </c:forEach>
                </li>


                <li>
                    <span class="icon icon-hand"></span>
                    <span class="summary--text">${donation.institution.name}</span>
                </li>
            </ul>
        </div>

        <div class="form-section form-section--columns">
            <div class="form-section--column">
                <h4>Adres odbioru:</h4>
                <ul>
                    <li>${donation.street}</li>
                    <li>${donation.city}</li>
                    <li>${donation.zipCode}</li>
                </ul>
            </div>

            <div class="form-section--column">
                <h4>Termin odbioru:</h4>
                <ul>
                    <li>${donation.pickUpDate}</li>
                    <li>${donation.pickUpTime}</li>
                    <li><c:out value="${donation.pickUpComment}"/></li>
                </ul>
            </div>
        </div>
    </div>

    <div class="form-group form-group--buttons">
        <button type="button" class="btn prev-step">Wstecz</button>
        <button type="submit" class="btn">Potwierdzam</button>
    </div>
</div>
</form:form>

<%@include file="fragments/footer.jsp" %>

<script src="<c:url value="resources/js/app.js"/>"></script>
</body>
</html>





