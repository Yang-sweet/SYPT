<%--
  Created by IntelliJ IDEA.
  User: 12195
  Date: 2020/7/6
  Time: 15:59
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<html>
<head>
    <title>Login</title>
    <link rel="stylesheet" type="text/css" href="/css/Login.css"/>
    <style type="text/css">

    </style>
</head>
<body>


<div id="login" >
    <font size="6px" color="#f7eeee" >Login</font>
    <hr size="2px" color="#f7eeee" width="250px">
    <div id="login_div">
        <form id="login_form" action="Login" method="get">
            <div id="uname">
                用户：<input type="text" name="uname" id=" " value="" />
            </div>
            <div id="pwd">
                密码：<input type="password" name="pwd" id="" value="" />
            </div>

            <div id="user_type">
                学生<input type="radio" name="type" value="1" checked="checked"/>
                教师<input type="radio" name="type" value="2" />
                管理员<input type="radio" name="type" value="3" />
            </div>
            <input type="submit" value="登录"/>
        </form>
    </div>
</div>

</body>


</html>
