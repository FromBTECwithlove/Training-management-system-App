<%-- 
    Document   : Insert
    Created on : May 12, 2020, 11:22:32 PM
    Author     : luuka
--%>

<%@include file="Header.jsp" %>
<jsp:useBean id="beans" scope="session" class="Model.UpdateProcess"/>
<div class="Cdetails" style="margin-top: 50px; margin-bottom: 100px">
    <s:form action="addForm" method="POST">
        <table style="text-align: left" class="addCourse">
            <tr>
                <th colspan="2">
            <h2 style="color: black; text-align: center">ADD NEW COURSE INFORMATION</h2>
            </th>
            </tr>
            <tr>
                <th>Course ID</th>
                <th>Name</th>
            </tr>
            <tr>
                <td><input type="text" name="id" autofocus required/></td>
                <td><input type="text" name="name" autofocus required/></td>
            </tr>
            <tr>
                <th>Start Date</th>
                <th>End Date</th>
            </tr>
            <tr>
                <td><input type="date" name="start" required/></td>
                <td><input type="date" name="end" required/></td>
            </tr>
            <tr><th colspan="2">Fee</th></tr>
            <tr><td colspan="2"><input type="text" name="fee" autofocus required/></td></tr>
            <tr>
                <th>Location</th>
                <th>Topic</th>
            </tr>
            <tr>
                <td>
                    <select name="location">
                        <option>DA NANG</option>
                        <option>HA HOI</option>
                        <option>TP.HCM</option>
                    </select>
                </td>
                <td>
                    <select name="topic">
                        <c:forEach var="t" items="${beans.topic}">
                            <option value="${t.topId}">
                                ${t.topName}
                            </option>
                        </c:forEach>
                    </select>
                </td>
            </tr>
            <tr>
                <th colspan="2">Trainer</th>
            </tr>
            <tr>
                <td colspan="2">
                    <select name="trainer">
                        <c:forEach var="tn" items="${beans.trainer}">
                            <option value="${tn.trainerId}">${tn.trainerName}</option>
                        </c:forEach>
                    </select>
                </td>
            </tr>
            <tr>
                <th colspan="2">Content</th>
            </tr>
            <tr>
                <td colspan="2">
                    <textarea name="cont" rows="10" cols="22" placeholder="Content"autofocus></textarea>
                </td>
            </tr>
            <tr>
                <th colspan="2">Description</th>
            </tr>
            <tr>
                <td colspan="2">
                    <textarea name="des" rows="10" cols="22" placeholder="Descibe about Course" autofocus id="des"></textarea>
                </td>
            </tr>
            <tr style="text-align: center">
                <td colspan="2"><input type="submit" value="ADD" id="btnAdd"><a href="IndexCourse.jsp"><input type="button" value="Assign"  id="btnAssign"/></a></td>
            </tr>
        </table>
    </s:form>
</div>
<%@include file="Footer.jsp" %>