<%-- 
    Document   : ListTraineeAssigned
    Created on : Jun 14, 2020, 2:43:27 AM
    Author     : luuka
--%>

<%@include file="Header.jsp" %>
<table style="width: 40%;border-bottom: solid 1px #FFC312; margin-top: 100px; margin-bottom: 100px" border = "1">
    <tr><td colspan="8" style="background-color: aqua"><h1>LIST TRAINEE ASSIGNED</h1></td></tr>
    <tr>
        <td colspan="8">
            <s:form action="searchTopic">
                <input class="search_input" type="search" name="searchValue" placeholder="Type to search..."/>
                <button style="float: right"><i class="fa fa-search"><input type="submit" value="Search" style="display: none"></i></button>
            </s:form>
        </td>
    </tr>
    <tr>
        <th>No.</th>
        <th>NAME</th>
        <th>Action</th>
    </tr>
    <s:iterator var="i" value="traineeCourse" status="number">
        <tr>
            <td><s:property value="#number.count"/></td>
            <td><s:property value="#i.traineeId"/></td>
            <td><a href="deleteTraineeAssigned?traineeId=<s:property value="#t.traineeId"/>" onclick="return confirmDel()"><i class="far fa-trash-alt" id="delete"></i></a></td>
        </tr>
    </s:iterator>
</table>
<%@include  file="Footer.jsp" %>
