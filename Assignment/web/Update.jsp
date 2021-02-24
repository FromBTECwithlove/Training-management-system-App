<%-- 
    Document   : Update
    Created on : May 13, 2020, 1:50:12 AM
    Author     : luuka
--%>

<%@include file="Header.jsp" %>
<jsp:useBean id="beans" scope="session" class="Model.UpdateProcess"></jsp:useBean>
    <div class="Cdetails" style="margin-top: 50px; margin-bottom: 100px">
    <s:form action="updateForm" method="POST">
        <div>
            <table style="text-align: left" class="addCourse">
                <tr>
                    <th colspan="2">
                <h2 style="color: black; text-align: center">
                    UPDATE COURSE INFORMATION
                </h2>
                </th>
                </tr>
                <tr>
                    <th>Course ID</th>
                    <th>Name</th>
                </tr>
                <tr>
                    <td><input type="text" name="id" autofocus readonly="true" required value="<s:property value="%{c.id}"/>"/></td>
                    <td><input type="text" name="name" autofocus required value="<s:property value="%{c.name}"/>"/></td>
                </tr>
                <tr>
                    <th>Start Date</th>
                    <th>End Date</th>
                </tr>
                <tr>
                    <td><input type="date" name="start" required value="<s:property value="%{c.start}"/>"/></td>
                    <td><input type="date" name="end" required value="<s:property value="%{c.end}"/>"/></td>
                </tr>
                <tr><th colspan="2">Fee</th></tr>
                <tr><td colspan="2"><input type="text" name="fee" autofocus required value="<s:property value="%{c.fee}"/>"/></td></tr>
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
                <tr>
                    <td colspan="2"><input type="submit" value="SAVE" id="btnUpdate"><a href="IndexCourse.jsp"><input type="button" value="Assign"  id="btnAssign"/></a></td>
                </tr>
            </table>
        </div>
    </s:form>
</div>
<%@include file="Footer.jsp" %>
