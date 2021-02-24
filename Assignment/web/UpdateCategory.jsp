<%-- 
    Document   : UpdateCategory
    Created on : May 23, 2020, 6:02:30 PM
    Author     : luuka
--%>

<%@include file="Header.jsp" %>
<h1>Update Category!</h1>
<s:form action="EditCategory" method="POST">
    <table border="1">
        <tr><td>ID:</td><td><input type="text" name="cateId" required value="<s:property value="%{c.cateId}"/>" readonly/></td></tr>
        <tr><td>NAME:</td><td><input type="text" name="cateName" required value="<s:property value="%{c.cateName}"/>"/></td></tr>
        <tr><td>DESCRIPTION:</td><td><textarea name="cateDes" cols="22" rows="5" placeholder="Describe about topic"></textarea></td></tr>
        <tr><td colspan="2"> <s:submit value="SAVE" align="center"/></td></tr>             
    </table>
</s:form>
<%@include file="Footer.jsp" %>