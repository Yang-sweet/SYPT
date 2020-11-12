<%--
  Created by IntelliJ IDEA.
  User: 12195
  Date: 2020/7/7
  Time: 11:09
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form action="UploadServlet" method="post" enctype="multipart/form-data">
    <p>
        文件：<input type="file" name="file">
    </p>
    <p>
        <input type="submit" value="上传">
    </p>
</form>


</body>
</html>
