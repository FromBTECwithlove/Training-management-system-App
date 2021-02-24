<%-- 
    Document   : AddCategory
    Created on : May 23, 2020, 4:34:24 PM
    Author     : luuka
--%>

<%@include file="Header.jsp" %>
<div style="width: 100%; height: 800px">
    <h1>ADD NEW CATEGORY</h1>
    <s:form action="addCate" method="POST">
        <table border="1">
            <tr><td>ID:</td><td><input type="text" name="cateId" required/></td></tr>
            <tr><td>NAME:</td><td><input type="text" name="cateName" required/></td></tr>
            <tr><td>DESCRIPTION:</td><td><textarea name="cateDes" cols="22" rows="5" placeholder="Description about category"></textarea></td></tr>
            <tr><td colspan="2"><s:submit value="ADD" align="center"/></td></tr>
        </table>
    </s:form>
</div>
<%@include file="Footer.jsp" %>
