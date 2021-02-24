<%-- 
    Document   : ViewCateDetail
    Created on : May 24, 2020, 9:19:30 PM
    Author     : luuka
--%>
<%@include file="Header.jsp" %>
<hr><h1>LIST OF CATEGORY</h1>
<table border = "1">
    <tr>
        <th>ID</th>
        <th>NAME</th>
        <th>DESCRIPTION</th>
        <th colspan="4">ACTION</th>
            <s:iterator var="c" value="cate2">
        <tr>
            <td><s:property value="#c.cateId"/></td>
            <td><s:property value="#c.cateName"/></td>
            <td><s:property value="#c.cateDes"/> </td>
            <td><a href="AddCategory.jsp"><input type="button" value="Insert"/></a></td>
            <td><a href="deleteCategory?cateId=<s:property value="#c.cateId"/>"><input type="button" value="Delete"/></a></td>
            <td><a href="updateCategory?cateId=<s:property value="#c.cateId"/>"><input type="button" value="Update"/></a></td>
            <td><a href="detailCategory?cateId=<s:property value="#c.cateId"/>"><input type="button" value="View"/></a></td>
        </tr>
    </s:iterator>
</table>
<%@include file="Footer.jsp" %>