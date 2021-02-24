<%-- 
    Document   : TraineeInCourse
    Created on : Jun 1, 2020, 12:42:13 AM
    Author     : luuka
--%>

<%@include file="Header.jsp" %>
<div class="Cdetails" style="margin-top: 50px; margin-bottom: 100px">
    <h1 style="text-align: center">Assign Trainee</h1>
    <s:form action="AssignTraineeToCourse" method="POST">           
        <p>Course</p> 
        <jsp:useBean id="mrCourse" scope="session" class="Model.UpdateProcess"/>
        <select class="put" name="courseId">
            <c:forEach var="t" items="${mrCourse.courseList}">
                <option value="${t.id}">${t.name}</option>
            </c:forEach>
        </select>
        <p>Trainee</p> 
        <select class="put" name="traineeId">
            <c:forEach var="t" items="${mrCourse.trainee}">
                <option value="${t.traineeId}">${t.traineeName}</option>
            </c:forEach>
        </select>
        <input value="Assign" type="submit" id="btnAdd"/>
    </s:form>
</div>
<%@include file="Footer.jsp" %>

