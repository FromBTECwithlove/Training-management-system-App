<%-- 
    Document   : UpdateTopic
    Created on : May 16, 2020, 3:23:30 PM
    Author     : pc
--%>
<%@include file="Header.jsp" %>
<s:form action="EditTop" method="POST">    
      <table class="addCourse">
            <tr>
                <th colspan="2" style="text-align: center"><h2>UPDATE TOPIC</h2></th>
            </tr>
            <tr>
                <th>Topic ID</th>
                <th>Topic Name</th>            
            </tr>
            <tr>
                <td>
                    <input type="text" name="topId" readonly="true" value="<s:property value="%{t.topId}"/>"/>
                </td>
                <td>
                    <input type="text" name="topName" required value="<s:property value="%{t.topName}"/>"/>
                </td>
            </tr>
            <tr>
                <th>Date Assigned</th>
                <th>Status</th>
            </tr>
            <tr>
                <td><input type="date" name="assigned" required value="<s:property value="%{t.assigned}"/>"></td>
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
                    <input value="SAVE" id="btnUpdate" type="submit"/>
                </td>
            </tr>
        </table>
</s:form>
<%@include file="Footer.jsp" %>
