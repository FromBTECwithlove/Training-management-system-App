<%-- 
    Document   : ViewTrainee
    Created on : May 30, 2020, 5:25:29 PM
    Author     : luuka
--%>

<%@include file="Header.jsp" %>
<table style="border-bottom: solid 1px #FFC312; margin-top: 100px; margin-bottom: 100px" border="1">
    <tr><td colspan="9"><h1>TRAINEE LIST</h1></td></tr>
    <tr>
        <td colspan="9">
            <s:form action="searchTrainee">
                <input class="search_input" type="search" name="searchValue" placeholder="Search trainee by name..."/>
                <button style="float: right">
                    <i class="fa fa-search"><input type="submit" value="Search" style="display: none"></i>
                </button>
            </s:form>
        </td>
    </tr>
    <tr>
        <th>No.</th>
        <th>TRAINEE ID</th>
        <th>NAME</th>
        <th>PHONE</th>
        <th>EMAIL</th>
        <th colspan="3">ACTION</th>
    </tr>
    <s:iterator var="tn" value="trainee" status="number">
        <tr>
            <td><s:property value="#number.count"/></td>
            <td><s:property value="#tn.traineeId"/></td>
            <td><s:property value="#tn.traineeName"/></td>
            <td><s:property value="#tn.traineePhone"/></td>
            <td><s:property value="#tn.traineeEmail"/></td>
            <td><a href="deleteTrainee?traineeId=<s:property value="#tn.traineeId"/>" onclick="return confirmDel()"><i class="far fa-trash-alt" id="delete"></i></a></td>
            <td><a href="updateTrainee?traineeId=<s:property value="#tn.traineeId"/>"><i class="fas fa-edit" id="edit"></i></a></td>
            <td><a href="detailTrainee?traineeId=<s:property value="#tn.traineeId"/>"><i class="far fa-eye" id="view"></i></a></td>
        </tr>  
    </s:iterator> 
    <tr>
        <th>No.</th>
        <th>TRAINEE ID</th>
        <th>NAME</th>
        <th>PHONE</th>
        <th>EMAIL</th>
        <th colspan="3">ACTION</th>
    </tr>
    <tr><td colspan="9"><a href="AddTrainee.jsp"><input type="button" id="btnAdd" value="ADD"/></a></td></tr>
</table>
<%@include file="Footer.jsp" %>
