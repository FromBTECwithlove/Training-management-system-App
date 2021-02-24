<%-- 
    Document   : ViewTrainer
    Created on : May 27, 2020, 12:04:20 PM
    Author     : luuka
--%>

<%@include file="Header.jsp" %>
<table style="border-bottom: solid 1px #FFC312; margin-top: 100px; margin-bottom: 100px" border="1">
    <tr><td colspan="8" style="background-color: aqua"><h1>TRAINER LIST</h1></td></tr>
    <tr>
        <td colspan="8">
            <s:form action="searchTrainer">
                <input class="search_input" type="search" name="searchValue" placeholder="Search trainer by name..."/>
                <button style="float: right"><i class="fa fa-search"><input type="submit" value="Search" style="display: none"></i></button>
                    </s:form>
        </td>
    </tr>
    <tr>
        <th>No.</th>
        <th>TRAINER ID</th>
        <th>NAME</th>
        <th>GENDER</th>
        <th>EMAIL</th>
        <th colspan="3">ACTION</th>
    </tr>
    <s:iterator var="tn" value="trainer" status="number">
        <tr>
            <td><s:property value="#number.count"/></td>
            <td><s:property value="#tn.trainerId"/></td>
            <td><s:property value="#tn.trainerName"/></td>
            <td><s:property value="#tn.trainerGender"/></td>
            <td><s:property value="#tn.trainerEmail"/></td>
            <td><a href="deleteTrainer?trainerId=<s:property value="#tn.trainerId"/>" onclick="return confirmDel()"><i class="far fa-trash-alt" id="delete"></i></a></td>
            <td><a href="updateTrainer?trainerId=<s:property value="#tn.trainerId"/>"><i class="fas fa-edit" id="edit"></i></a></td>
            <td><a href="detailTrainer?trainerId=<s:property value="#tn.trainerId"/>"><i class="far fa-eye" id="view"></i></a></td>
        </tr>  
    </s:iterator> 
    <tr>
        <th>No.</th>
        <th>TRAINER ID</th>
        <th>NAME</th>
        <th>GENDER</th>
        <th>EMAIL</th>
        <th colspan="3">ACTION</th>
    </tr>
    <tr><td colspan="8" style="background-color: aqua"><a href="AddTrainer.jsp"><input type="button" id="btnAdd" value="ADD"/></a></td></tr>
</table>
<%@include file="Footer.jsp" %>