<%--
  Created by IntelliJ IDEA.
  User: 12195
  Date: 2020/11/10
  Time: 10:29
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<!DOCTYPE html>
<html>

<head>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
    <title>原生JS实现加载进度条</title>
    <style>
        #progressBox {
            width: 300px;
            height: 40px;
            border: 1px solid #C8C8C8;
            background: white;
            position: relative;
            margin: 0 auto;
            margin-top: 100px;
        }

        #progressBar {
            position: absolute;
            left: 0;
            top: 0;
            z-index: 2;
            height: 40px;
            width: 100%;
            line-height: 40px;
            color: white;
            text-align: center;
            font-size: 20px;
            font-weight: bold;
            font-family: Georgia;
            clip: rect(0px, 0, 40px, 0px);
            background: #00A1F5;
        }

        #progressText {
            position: absolute;
            left: 0;
            top: 0;
            z-index: 1;
            width: 100%;
            height: 40px;
            line-height: 40px;
            color: black;
            text-align: center;
            font-size: 20px;
            font-weight: bold;
            font-family: Georgia;
        }
    </style>
    <script>
        window.onload = function () {
            // 设定当前起始状态值,
            // 真实情况中用html5的onprogress和onload来完成
            // 还可以跟后台配合，通过ajax实时的返回数据
            var iNow = 0;
            // 设定定时器
            var timer = setInterval(function () {
                // 如果当前的值为100
                if (iNow == 100) {
                    // 清除定时器
                    clearInterval(timer);
                }else {
                    // 将当前状态值累加1
                    iNow += 1;
                    // 调用执行状态的函数,传入状态值
                    progressFn(iNow);
                }

            }, 30);


            function progressFn(cent) {
                // 获取最外层的div
                var oDiv1 = document.getElementById('progressBox');
                // 获取内层进度条的div
                var oDiv2 = document.getElementById('progressBar');
                // 获取内层文字发生变化时的div
                var oDiv3 = document.getElementById('progressText');

                // 获取总进度条的宽度
                var allWidth = parseInt(getStyle(oDiv1, 'width'));

                // 设定内层两个div的文字内容一样
                oDiv2.innerHTML = cent + '%';
                oDiv3.innerHTML = cent + '%';

                // 修改clip的的宽度值
                oDiv2.style.clip = 'rect(0px, ' + cent / 100 * allWidth + 'px, 40px, 0px)';

                // 获取当前元素的属性值
                function getStyle(obj, attr) {
                    // 兼容IE
                    if (obj.currentStyle) {
                        return obj.currentStyle[attr];
                    }else {
                        // 第二个参数为false是通用的写法，目的是为了兼容老版本
                        return getComputedStyle(obj, false)[attr];
                    }
                }
            }
        };
    </script>
</head>

<body>
<div id="progressBox">
    <div id="progressBar">0%</div>
    <!-- 设定第二个层以便当进度超过文字的时候，修改文字的颜色 -->
    <div id="progressText">0%</div>
</div>
</body>

</html>