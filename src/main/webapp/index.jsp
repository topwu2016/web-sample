<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2017/4/13
  Time: 17:43
  To change this template use File | Settings | File Templates.
  这里放首页
--%>
<%--<%@ page contentType="text/html;charset=UTF-8" language="java" %>--%>
<!doctype html>
<html>
  <head>
      <title>hello word!</title>
      <meta charset="UTF-8">
      <meta http-equiv="X-UA-Compatible" content="IE=edge">
      <%@ page contentType="text/html;charset=UTF-8" %>
      <%@ page language="java" pageEncoding="UTF-8" %>
      <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
      <c:set var="ctx" value="${pageContext.request.contextPath}"/>
      <script type="text/javascript" src="${ctx}/static/layout/js/jquery-1.11.3.min.js"></script>

      <script type="text/javascript">

          function test() {
              var id = 1;
              /* 品牌下拉框 */
              $.get('${ctx}/brand/getEntity?id='+ id, function(data) {
                  if(data) {
                      alert(data);
                  } else {
                      alert(2);
                  }
              });
          }

          function test2() {
              var id = 1;
              /* 品牌下拉框 */
              $.get('${ctx}/brand/getString?id='+ id, function(data) {
                  if(data) {
                      alert(data);
                  } else {
                      alert(2);
                  }
              });
          }
      </script>
  </head>
  <body>
    <h1>Hello word!2</h1>
    <input type="button" value="test1" onclick="test()" />
    <input type="button" value="test2" onclick="test2()" />
  </body>
</html>
