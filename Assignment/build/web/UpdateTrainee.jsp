<%-- 
    Document   : UpdateTrainee
    Created on : May 31, 2020, 7:23:11 AM
    Author     : luuka
--%>

<%@include file="Header.jsp" %>
<h1>UPDATE TRAINEE</h1>
<s:form action="EditTraineeForm" method="POST">
    <div>
        <table style="text-align: left" class="addCourse">
            <tr>
                <th colspan="2" style="text-align: center"><h1>ADD NEW TRAINEE</h1></th>
            </tr>
            <tr>
                <th>Trainee ID</th>
                <th>Trainee Name</th>
            </tr>
            <tr>
                <td><input type="text" name="traineeId" autofocus required value="<s:property value="%{tn.traineeId}"/>" readonly/></td>
                <td><input type="text" name="traineeName" autofocus required value="<s:property value="%{tn.traineeName}"/>"/></td>
            </tr>
            <tr>
                <th>Date Of Birth</th>
                <th>Gender</th>
            </tr>
            <tr>
                <td><input type="date" name="traineeDOB" autofocus required value="<s:property value="%{tn.traineeDOB}"/>"/></td>
                <td>
                    <select name="traineeGender">
                        <option>Male</option>
                        <option>Female</option>
                    </select>
                </td>
            </tr>
            <tr>
                <th>Phone</th>
                <th>Email</th>
            </tr>
            <tr>
                <td><input type="text" name="traineePhone" autofocus required value="<s:property value="%{tn.traineePhone}"/>"/></td>
                <td><input type="text" name="traineeEmail" autofocus required value="<s:property value="%{tn.traineeEmail}"/>"/></td>
            </tr>
            <tr>
                <th colspan="2">
                    Address
                </th>
            </tr>
            <tr>
                <td colspan="2">
                    <input type="text" value="<s:property value="%{tn.traineeAddress}"/>" name="traineeAddress" autofocus required>
                </td>
            </tr>
            <tr>
                <th colspan="2">
                    Description
                </th>
            </tr>
            <tr>
                <td colspan="2">
                    <textarea name="traineeDes" rows="10" cols="22" autofocus required></textarea>
                </td>
            </tr>
            <tr>
                <td colspan="2"><input type="submit" value="SAVE" id="btnUpdate"></td>
            </tr>
        </table>
    </div>
</s:form>
<%@include file="Footer.jsp" %>

