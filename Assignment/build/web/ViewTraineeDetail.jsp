<%-- 
    Document   : ViewTraineeDetail
    Created on : May 31, 2020, 8:20:43 AM
    Author     : luuka
--%>

<%@include file="Header.jsp" %>
<div class="Cdetails" style="margin-top: 100px; margin-bottom: 100px">
    <table style=" width: 100%" border="1" class="courDetails">
        <tr>
            <td colspan="2" style="text-align: center">
                <h1>Trainee Detail</h1
            </td>
        </tr>
        <tr> 
            <s:iterator var="tn" value="trainee">
            <tr>
                <th>Trainee ID</th>
                <td><s:property value="#tn.traineeId"/></td>
            </tr>
            <tr>
                <th>Trainee Name</th>
                <td><s:property value="#tn.traineeName"/></td>
            </tr>
            <tr>
                <th>Date Of Birth</th>
                <td><s:property value="#tn.traineeDOB"/></td>
            </tr>
            <tr>
                <th>Gender</th>
                <td><s:property value="#tn.traineeGender"/></td>
            </tr>
            <tr>
                <th>Phone</th>
                <td><s:property value="#tn.traineePhone"/></td>
            </tr>
            <tr>
                <th>Email</th>
                <td><s:property value="#tn.traineeEmail"/></td>
            </tr>
            <tr>
                <th>Address</th>
                <td><s:property value="#tn.traineeAddress"/></td>
            </tr>
            <tr>
                <th>Other Details</th>
                <td><s:property value="#tn.traineeDes"/></td>
            </tr>
        </s:iterator>     
        <tr>
            <td colspan="2">
                <a href="deleteTrainee?traineeId=<s:property value="#tn.traineeId"/>" onclick="return confirmDel()">
                    <input type="button" value="Delete" id="btnDel"></a>
                <a href="updateTrainee?traineeId=<s:property value="#tn.traineeId"/>">
                    <input type="button" value="Edit" id="btnUpdate"></a>                
                <a href="AddTrainee.jsp"><input type="button" id="btnAdd" value="ADD"/></a>
            </td>
        </tr>
    </table>    
</div>
<%@include file="Footer.jsp" %>

