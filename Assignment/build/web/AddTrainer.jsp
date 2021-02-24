<%-- 
    Document   : AddTrainer
    Created on : May 27, 2020, 11:34:05 AM
    Author     : luuka
--%>

<%@include file="Header.jsp" %>
<s:form action="addTn" method="POST">
    <h1>ADD NEW TRAINER INFORMATION</h1>
    <div class="addTrainer">
        Trainer ID:
        <input type="text" name="trainerId"/>
        Trainer Name:
        <input type="text" name="trainerName"/>
        Date Of Birth:
        <input type="date" name="trainerDOB"/>
        EMAIL:
        <input type="text" name="trainerEmail"/>
        PHONE:
        <input type="text" name="trainerPhone"/>
        ADDRESS:
        <input type="text" name="trainerAddress"/>
        GENDER:
        <select name="trainerGender">
            <option>Male</option>
            <option>Female</option>
        </select>
        DESCRIPTION:
        <textarea name="trainerDes" rows="10" cols="25"></textarea>
        <s:submit value="ADD" method="execute"/>
        <s:reset value="Cancel"/>
    </div>
</s:form>
<%@include file="Footer.jsp" %>
