<%-- 
    Document   : AddTopic
    Created on : May 16, 2020, 8:33:32 AM
    Author     : pc
--%>
<%@include file="Header.jsp" %>
<s:form action="addTopic" method="POST" >
        <table class="addCourse">
            <tr>
                <th colspan="2" style="text-align: center"><h2>ADD NEW TOPIC</h2></th>
            </tr>
            <tr>
                <th>Topic ID</th>
                <th>Topic Name</th>            
            </tr>
            <tr>
                <td>
                    <input type="text" name="topId"/>
                </td>
                <td>
                    <input type="text" name="topName"/>
                </td>
            </tr>
            <tr>
                <th>Date Assigned</th>
                <th>Status</th>
            </tr>
            <tr>
                <td><input type="date" name="assigned"></td>
                <td>
                    <select name="status">
                        <option>On</option>
                        <option>Over</option>
                    </select>
                </td>
            </tr>
            <tr>
                <th colspan="2">
                    Description:
                </th>            
            </tr>
            <tr>
                <td colspan="2">
                    <textarea name="topDes" cols="22" rows="5" placeholder="Describe about topic"></textarea>
                </td>
            <tr>           
            <tr>
                <td colspan="2">
                    <input value="ADD" id="btnAdd" type="submit"/>
                </td>
            </tr>
        </table>
</s:form>
<%@include file="Footer.jsp" %>
