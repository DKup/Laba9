<%@ tag pageEncoding="UTF-8" %>



<c:if test="${sessionScope.authUser !=null && sessionScope.authUser.isColor() == false}">
    <div style="padding: 15px; clear: both;">
            <%-- Тело тега подставляется в этом месте --%>
        <jsp:doBody/>
    </div>
</c:if>

