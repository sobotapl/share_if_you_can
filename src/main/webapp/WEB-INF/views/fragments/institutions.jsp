<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix = "fmt" uri = "http://java.sun.com/jsp/jstl/fmt" %>
<jsp:include page="head.jsp"/>

<section class="help">
    <h2>Komu pomagamy?</h2>

    <!-- SLIDE 1 -->
    <div class="help--slides active" data-id="1">
        <p>W naszej bazie znajdziesz listę zweryfikowanych Fundacji, z którymi współpracujemy.
            Możesz sprawdzić czym się zajmują.</p>

        <ul class="help--slides-items">
            <c:forEach items="${institutions}" var="institution" varStatus="counter">

                <%--                counter.count --> starts counting at 1--%>
                <c:if test="${counter.count%2 ==1 }">
                    <li>
                </c:if>

                <div class="col">
                    <div class="title"><c:out value="${institution.name}"/></div>
                    <div class="subtitle"><c:out value="${institution.description}"/></div>
                </div>

                <c:if test="${counter.count%2 ==0 }">
                    </li>
                </c:if>
                <c:if test="${counter.last}">
                    <%--                    //text-decoration--%>
                    <div class="col" style="visibility: hidden">
                    </div>
                    </li>
                </c:if>
            </c:forEach>
        </ul>
    </div>

</section>


