<%-- 
    Document   : ViewCourseDetail
    Created on : May 12, 2020, 7:01:27 PM
    Author     : luuka
--%>

<%@include file="Header.jsp" %> 
<div class="Cdetails" style="margin-top: 50px; margin-bottom: 100px">
    <table style="text-align: left;" class="addCourse">
        <tr>
            <th colspan="2">
        <h2 style="color: black; text-align: center">Course Detail</h2>
        </th>
        </tr>
        <s:iterator var="c" value="courseList">
            <tr>
                <th>Course ID</th>
                <th>Name</th>
            </tr>
            <tr>
                <td><input type="text" value="<s:property value="#c.id"/>" readonly="true"></td>
                <td><input type="text" value="<s:property value="#c.name"/>" readonly="true"></td>
            </tr>
            <tr>
                <th>Start Date</th>
                <th>End Date</th>
            </tr>
            <tr>
                <td><input type="date" value="<s:property value="#c.start"/>" readonly="true"></td>
                <td><input type="date" value="<s:property value="#c.end"/>" readonly="true"></td>
            </tr>
            <tr><th colspan="2">Fee</th></tr>
            <tr><td colspan="2"><input type="text" value="<s:property value="#c.fee"/>" readonly="true"></td></tr>
            <tr>
                <th>Location</th>
                <th>Topic</th>
            </tr>
            <tr>
                <td>
                    <input type="text" value="<s:property value="#c.location"/>" readonly="true">
                </td>
                <td>
                    <input type="text" value="<s:property value="#c.topic"/>" readonly="true">
                </td>
            </tr>
            <tr>
                <th colspan="2">Trainer</th>
            </tr>
            <tr>
                <td colspan="2">
                    <input type="text" value="<s:property value="#c.trainer"/>" readonly="true">
                </td>
            </tr>
            <tr>
                <th colspan="2">Content</th>
            </tr>
            <tr>
                <td colspan="2" style="padding: 10px">
                    <s:property value="#c.cont"/>
                </td>
            </tr>
            <tr>
                <th colspan="2">Description</th>
            </tr>
            <tr>
                <td colspan="2" style="padding: 10px">
                    <s:property value="#c.des"/>
                </td>
            </tr>
            <tr>
                <td colspan="2">
                    <a href="assignedTrainee?courseId=<s:property value="#c.id"/>"><input type="button" value="Assign"  id="btnAssign"/></a>
                    <a href="AddCourse.jsp"><input type="button" value="Add" id="btnAdd"/></a>
                    <a href="updateCourse?courseId=<s:property value="#c.id"/>"><input type="button" value="Edit" id="btnUpdate"/></a>
                    <a href="delCourse?courseId=<s:property value="#c.id"/>" onclick="return confirmDel()"><input type="button" id="btnDel" value="Delete"/></a>
                </td>
            </tr>
        </s:iterator>
    </table>    
</div>
<%@include file="Footer.jsp" %>