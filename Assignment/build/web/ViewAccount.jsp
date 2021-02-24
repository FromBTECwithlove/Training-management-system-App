<%-- 
    Document   : ViewAccount
    Created on : May 25, 2020, 6:25:38 PM
    Author     : luuka
--%>

<%@include file="Header.jsp" %>

<table style="border-bottom: solid 1px #FFC312; margin-top: 100px; margin-bottom: 100px"  border="1">
    <tr><td colspan="6" style="background-color: aqua"><h1>LIST ACCOUNT!</h1></td></tr>
    <tr>
        <td colspan="6">
            <s:form action="searchAccount">
                <input class="search_input" type="search" name="searchValue" placeholder="Search account by name..."/>
                <button style="float: right"><i class="fa fa-search"><input type="submit" value="Search" style="display: none"></i></button>
            </s:form>
        </td>
    </tr>
    <tr>
        <th>No.</th>
        <th>USERNAME</th>
        <th>PASSWORD</th>    
        <th>FULL_NAME</th>
        <th colspan="2">ACTION</th>
    </tr>
    <s:iterator var="ac" value="accounts" status="number">
        <tr>
            <td><s:property value="#number.count"/></td>
            <td><s:property value="#ac.user"/></td>
            <td><s:property value="#ac.pass"/></td>
            <td><s:property value="#ac.fullName"/></td>
            <td><a href="deleteAccount?user=<s:property value="#ac.user"/>" onclick="return confirmDel()"><i class="far fa-trash-alt" id="delete"></i></a></td>
            <td><a href="updateAccount?user=<s:property value="#ac.user"/>"><i class="fas fa-edit" id="edit"></i></a></td>
        </tr>
    </s:iterator>
        <tr>
        <th>No.</th>
        <th>USERNAME</th>
        <th>PASSWORD</th>    
        <th>FULL_NAME</th>
        <th colspan="2">ACTION</th>
    </tr>
<tr>
        <td colspan="9" style="background-color: aqua"><a href="AddAccount.jsp"><input type="button" id="btnAdd" value="ADD"></i></a></td>
    </tr>
</table>
<%@include file="Footer.jsp" %>
