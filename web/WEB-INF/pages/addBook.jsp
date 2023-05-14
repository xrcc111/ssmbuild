<%--
  Created by IntelliJ IDEA.
  User: 徐锐
  Date: 2023/5/13
  Time: 18:04
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.6.2/dist/css/bootstrap.min.css" >
<html>
<head>
    <title>新增书籍</title>
</head>
<body>
<div class="container">
    <form action="${pageContext.request.contextPath}/book/addBook" method="post">
            <div class="form-group">
                <label>书籍名称：</label>
                <input type="text" class="form-control" name="bookName" required>
            </div>
            <div class="form-group">
                <label>书籍数量</label>
                <input type="text" class="form-control" name="bookCounts" required>
            </div>
        <div class="form-group">
            <label>书籍描述</label>
            <input type="text" class="form-control" name="detail" required>
        </div>
            <button type="submit" class="btn btn-primary">添加书籍</button>
    </form>
</div>
</body>
</html>
