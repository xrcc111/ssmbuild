<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: 徐锐
  Date: 2023/5/13
  Time: 1:02
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.6.2/dist/css/bootstrap.min.css" >
<html>
<head>
    <title>所有书籍</title>
</head>
<body>
<div >
    <form action="${pageContext.request.contextPath}/book/queryBookByName" method="post">
        <div style="display: flex;" >
        <input type="text" name="queryBookName" class="form-control" placeholder="请输入要查询的书籍名称">
        <input type="submit" value="查询" class="btn btn-primary"></input>
        </div>
    </form>
    <div>
        <a href="${pageContext.request.contextPath}/book/toAddBook">新增书籍</a>
    </div>
    <table>
    <thead>
    <tr>
        <th>书籍编号</th>
        <th>书籍名称</th>
        <th>书记数量</th>
        <th>书籍详情</th>
        <th>操作</th>
    </tr>
    </thead>
    <tbody>
    <c:forEach var="book" items="${booksList}">
        <tr>
            <td>${book.bookId}</td>
            <td>${book.bookName}</td>
            <td>${book.bookCounts}</td>
            <td>${book.detail}</td>
            <td>
                <a href="${pageContext.request.contextPath}/book/toUpdateBook?id=${book.bookId}">修改</a>
                &nbsp; | &nbsp;
                <a href="${pageContext.request.contextPath}/book/deleteBook/${book.bookId}">删除</a>
            </td>
        </tr>
    </c:forEach>
    </tbody>
    </table>
</div>
</body>
</html>
