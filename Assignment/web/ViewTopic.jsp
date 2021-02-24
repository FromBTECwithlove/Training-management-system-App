<%-- 
    Document   : ViewTopic
    Created on : May 16, 2020, 9:09:18 AM
    Author     : pc
--%>
<%@include file="Header.jsp" %>
<table style="border-bottom: solid 1px #FFC312; margin-top: 100px; margin-bottom: 100px" border = "1">
    <tr><td colspan="8"><h1>LIST OF TOPIC</h1></td></tr>
    <tr>
        <td colspan="8">
            <s:form action="searchTopic">
                <input class="search_input" type="search" name="searchValue" placeholder="Search topic by name..." />
                <button style="float: right"><i class="fa fa-search"><input type="submit" value="Search" style="display: none"></i></button>
            </s:form>
        </td>
    </tr>
    <tr>
        <th>ID</th>
        <th>NAME</th>
        <th>DESCRIPTION</th>
        <th>DATE ASSIGNED</th>
        <th>STATUS</th>
        <th colspan="2">Action</th>
    </tr>
    <s:iterator var="t" value="topic">
        <tr>
            <td><s:property value="#t.topId"/></td>
            <td><s:property value="#t.topName"/></td>
            <td><s:property value="#t.topDes"/> </td>
            <td><s:property value="#t.assigned"/> </td>
            <td><s:property value="#t.status"/> </td>
            <td><a href="deleteTopic?topId=<s:property value="#t.topId"/>" onclick="return confirmDel()"><i class="far fa-trash-alt" id="delete"></i></a></td>
            <td><a href="updateTopic?topId=<s:property value="#t.topId"/>"><i class="fas fa-edit" id="edit"></i></a></td>
        </tr>
    </s:iterator>
    <tr>
        <th>ID</th>
        <th>NAME</th>
        <th>DESCRIPTION</th>
        <th>DATE ASSIGNED</th>
        <th>STATUS</th>
        <th colspan="3">Action</th>
    </tr>
    <tr>
        <td colspan="8"><a href="AddTopic.jsp"><input type="button" id="btnAdd" value="ADD"></i></a></td>
    </tr>
</table>
<%@include  file="Footer.jsp" %>
