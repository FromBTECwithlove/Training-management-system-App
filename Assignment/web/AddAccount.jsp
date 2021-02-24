<%-- 
    Document   : AddAccount
    Created on : May 25, 2020, 6:05:07 PM
    Author     : luuka
--%>

<%@include file="Header.jsp" %>
<h1>ADD ACCOUNT!</h1>
<s:form action="addAccount" method="POST" >
    <table border="1">
        <tr><td>USERNAME:</td><td><input type="text" name="user"/></td></tr>
        <tr><td>PASSWORD:</td><td><input type="password" name="pass"/></td></tr>
        <tr><td>FULL NAME:</td><td><input type="text" name="fullName"/></td></tr>
        <tr><td colspan="2"><s:submit value="ADD" method="execute" align="center" cssClass="submit"/></td></tr>
    </table>
</s:form>
<%@include file="Footer.jsp" %>
