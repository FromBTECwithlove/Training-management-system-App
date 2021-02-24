<%-- 
    Document   : AddTrainee
    Created on : May 30, 2020, 4:46:34 PM
    Author     : luuka
--%>

<%@include file="Header.jsp" %>
<s:form action="addTrainee" method="POST">
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
                <td><input type="text" name="traineeId" autofocus required/></td>
                <td><input type="text" name="traineeName" autofocus required/></td>
            </tr>
            <tr>
                <th>Date Of Birth</th>
                <th>Gender</th>
            </tr>
            <tr>
                <td><input type="date" name="traineeDOB" autofocus required/></td>
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
                <td><input type="text" name="traineePhone" autofocus required/></td>
                <td><input type="text" name="traineeEmail" autofocus required/></td>
            </tr>
            <tr>
                <th colspan="2">
                    Address
                </th>
            </tr>
            <tr>
                <td colspan="2">
                    <input type="text" name="traineeAddress" autofocus required>
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
                <td colspan="2"><input type="submit" value="ADD" id="btnAdd"></td>
            </tr>
        </table>
    </div>
</s:form>
<%@include file="Footer.jsp" %>

