<%-- 
    Document   : ViewCate
    Created on : May 23, 2020, 5:29:00 PM
    Author     : luuka
--%>

<%@include file="Header.jsp" %>
<table border = "1" style="border-bottom: solid 1px #FFC312; margin-top: 100px; margin-bottom: 100px">
    <tr><td colspan="6" style="background-color: aqua"><h1>LIST OF CATEGORY</h1></td></tr>
        <tr>
        <td colspan="6">
            <s:form action="searchCategory">
                <input class="search_input" type="search" name="searchValue" placeholder="Search category by name..."/>
                <button style="float: right"><i class="fa fa-search"><input type="submit" value="Search" style="display: none"></i></button>
            </s:form>
        </td>
    </tr>
    <tr>
        <th>ID</th>
        <th>NAME</th>
        <th>DESCRIPTION</th>
        <th colspan="3">ACTION</th>
    </tr>
    <s:iterator var="c" value="cate">
        <tr>
            <td><s:property value="#c.cateId"/></td>
            <td><s:property value="#c.cateName"/></td>
            <td><s:property value="#c.cateDes"/> </td>
            <td><a href="deleteCategory?cateId=<s:property value="#c.cateId"/>" onclick="return confirmDel()"><i class="far fa-trash-alt" id="delete"></i></a></td>
            <td><a href="updateCategory?cateId=<s:property value="#c.cateId"/>"><i class="fas fa-edit" id="edit"></i></a></td>
            <td><a href="detailCategory?cateId=<s:property value="#c.cateId"/>"><i class="far fa-eye" id="view"></i></a></td>
        </tr>
    </s:iterator>
        <tr>
        <th>ID</th>
        <th>NAME</th>
        <th>DESCRIPTION</th>
        <th colspan="3">ACTION</th>
    </tr>
    <tr>
        <td colspan="9" style="background-color: aqua"><a href="AddCategory.jsp"><input type="button" id="btnAdd" value="ADD"></i></a></td>
    </tr>
</table>
<%@include file="Footer.jsp" %>