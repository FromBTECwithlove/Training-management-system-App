<%-- 
    Document   : ViewTrainerDetail
    Created on : May 27, 2020, 5:26:07 PM
    Author     : luuka
--%>

<%@include file="Header.jsp" %>
<table style="border-bottom: solid 1px #FFC312; margin-top: 100px; margin-bottom: 100px" border="1">
    <tr><td colspan="11" style="background-color: aqua"><h1>TRAINER DETAIL</h1></td></tr>
    <tr>
        <th>No.</th>
        <th>TRAINER ID</th>
        <th>NAME</th>
        <th>DATE OF BIRTH</th>
        <th>GENDER</th>
        <th>PHONE</th>
        <th>EMAIL</th>
        <th>ADDRESS</th>
        <th>OTHER DETAIL</th>
        <th colspan="2">ACTION</th>
    </tr>
    <s:iterator var="tn" value="trainer" status="number">
        <tr>
            <td><s:property value="#number.count"/></td>
            <td><s:property value="#tn.trainerId"/></td>
            <td><s:property value="#tn.trainerName"/></td>
            <td><s:property value="#tn.trainerDOB"/></td>
            <td><s:property value="#tn.trainerGender"/></td>
            <td><s:property value="#tn.trainerPhone"/></td>
            <td><s:property value="#tn.trainerEmail"/></td>
            <td><s:property value="#tn.trainerAddress"/></td>
            <td><s:property value="#tn.trainerDes"/></td>
            <td><a href="deleteTrainer?trainerId=<s:property value="#tn.trainerId"/>" onclick="return confirmDel()"><i class="far fa-trash-alt" id="delete"></i></a></td>
            <td><a href="updateTrainer?trainerId=<s:property value="#tn.trainerId"/>"><i class="fas fa-edit" id="edit"></i></a></td>
        </tr>  
    </s:iterator> 
        <tr><td colspan="12" style="background-color: aqua"><a href="AddTrainer.jsp"><input type="button" id="btnAdd" value="ADD"/></a></td></tr>
</table>
<%@include file="Footer.jsp" %>
