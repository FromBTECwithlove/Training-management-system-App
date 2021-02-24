<%-- 
    Document   : ViewCourse
    Created on : May 12, 2020, 7:01:27 PM
    Author     : luuka
--%>

<%@include file="Header.jsp" %>
<table style="border-bottom: solid 1px #FFC312; margin-top: 100px; color: black; margin-bottom: 100px" border="1">
    <tr><td colspan="11"><h1>COURSE LIST</h1></td></tr>
    <tr>
        <td colspan="11">
            <s:form action="searchCourse">
                <input class="search_input" type="search" style="width: 30%; padding: 10px; margin: 5px" name="searchValue" placeholder="Search course by name..."/>
                <button style="float: right; margin: 5px; padding: 10px; margin-right: -5.5px;"><i class="fa fa-search"><input type="submit" value="Search" style="display: none"></i></button>
            </s:form>
        </td>
    </tr>
    <tr>
        <th>No.</th>
        <th>ID</th>
        <th>COURSE NAME</th>
        <th>START DATE</th>
        <th>END DATE</th>
        <th>LOCATION</th>
        <th>TRAINEE</th>
        <th colspan="4">ACTION</th>
    </tr>
    <s:iterator var="c" value="list" status="number">
        <tr class="btn">
            <td><s:property value="#number.count"/></td>
            <td><s:property value="#c.id"/></td>
            <td><s:property value="#c.name"/></td>
            <td><s:property value="#c.start"/></td>
            <td><s:property value="#c.end"/></td>
            <td><s:property value="#c.location"/></td>   
            <td><a href="listTraineeInCourse?courseId=<s:property value="#c.id"/>">View</a></td>
            <td><a href="assignedTrainee?courseId=<s:property value="#c.id"/>"><i class="fas fa-user-plus" id="add"></i></a></td>
            <td><a href="updateCourse?courseId=<s:property value="#c.id"/>"><i class="fas fa-edit" id="edit"></i></a></td>
            <td><a href="delCourse?courseId=<s:property value="#c.id"/>" onclick="return confirmDel()"><i class="far fa-trash-alt" id="delete"></i></a></td>
            <td><a href="detail?courseId=<s:property value="#c.id"/>"><i class="far fa-eye" id="view"></i></a></td>            
        </tr>
    </s:iterator>
   <tr>
        <th>No.</th>
        <th>ID</th>
        <th>COURSE NAME</th>
        <th>START DATE</th>
        <th>END DATE</th>
        <th>LOCATION</th>
        <th>TRAINEE</th>
        <th colspan="4">ACTION</th>
    </tr>
    <tr>
        <td colspan="11"><a href="AddCourse.jsp"><input type="button" id="btnAdd" value="ADD"></a></td>        
    </tr>
</table>   
<%@include file="Footer.jsp" %>
