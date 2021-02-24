<%-- 
    Document   : UpdateAccount
    Created on : May 25, 2020, 8:09:11 PM
    Author     : luuka
--%>
<%@include file="Header.jsp" %>
<h1>UPDATE ACCOUNT!</h1>
<s:form action="UpdateAcc" method="POST" >
    <table border="1">
        <tr><td>USERNAME:</td><td><input type="text" name="user" value="<s:property value="%{ac.user}"/>" readonly=""/></td></tr>
        <tr><td>PASSWORD:</td><td><input type="text" name="pass" value="<s:property value="%{ac.pass}"/>"/></td></tr>
        <tr><td>FULL NAME:</td><td><input type="text" name="fullName" value="<s:property value="%{ac.fullName}"/>"/></td></tr>
        <tr><td colspan="2"><s:submit value="SAVE" method="execute" align="center"/></td></tr>
    </table>
</s:form>
<%@include file="Footer.jsp" %>