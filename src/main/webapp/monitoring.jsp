<%--
  Created by IntelliJ IDEA.
  User: 12195
  Date: 2020/7/23
  Time: 21:13
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<table class="table">
    <caption>任务监控</caption>
    <thead>
    <tr>
        <td id="tb-username">任务ID</td>
        <td>任务名</td>
        <td>map进度</td>
        <td>reduce进度</td>
        <td>任务状态</td>
    </tr>
    </thead>
    <tbody>
    <s:iterator id="list" value="jobInfosList">
        <tr>
            <td>
                <s:property value="#list.jobId" />
            </td>
            <td><s:property value="#list.jobName" /></td>
            <td><s:property value="#list.mapProgress" /></td>
            <td><s:property value="#list.redProgress" /></td>
            <td><s:property value="#list.runState" /></td>
        </tr>
    </s:iterator>
    </tbody>
</table>

</body>
</html>
