<%-- 
    Document   : UpdateTrainer
    Created on : May 27, 2020, 3:58:07 PM
    Author     : luuka
--%>

<%@include file="Header.jsp" %>
<h1>UPDATE TRAINER</h1>
<s:form action="EditTrainerForm" method="POST">
    <div class="update-Trainer">
        Trainer ID:
        <input type="text" name="trainerId" value="<s:property value="%{tn.trainerId}"/>" readonly/><hr>
        Trainer Name:
        <input type="text" name="trainerName" value="<s:property value="%{tn.trainerName}"/>"/><hr>
        Date Of Birth:
        <input type="date" name="trainerDOB" value="<s:property value="%{tn.trainerDOB}"/>"/><hr>
        GENDER:
        <select name="trainerGender">
            <option>Male</option>
            <option>Female</option>
        </select><hr>
        PHONE:
        <input type="text" name="trainerPhone" value="<s:property value="%{tn.trainerPhone}"/>"/><hr>
        EMAIL:
        <input type="text" name="trainerEmail"/><hr>
        ADDRESS:
        <input type="text" name="trainerAddress"> <hr>
        DESCRIPTION:
        <textarea name="trainerDes" rows="10" cols="25"></textarea>
        <s:submit value="Save" method="execute"/>
    </div>
</s:form>
<%@include file="Footer.jsp" %>

