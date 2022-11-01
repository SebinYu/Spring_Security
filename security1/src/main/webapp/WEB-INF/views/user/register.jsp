<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<c:url var="R" value="/" />
<!DOCTYPE html>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8">
    <link rel="stylesheet" href="${R}common.css">
    <style>
        label { display: block; margin-top:10px; }
        .error { color: red; display: block; }
        button { margin-top: 20px; }
    </style>
</head>
<body>
<div class="container">
    <h1>회원 가입</h1>
<%--    <form:form method="post" modelAttribute="UserRegistration">--%>
        <div>
            <label>이메일:</label>
            <form:input path="email" />
            <form:errors path="email" class="error" />
        </div>
        <div>
            <label>비밀번호:</label>
            <form:password path="passwd" />
            <form:errors path="passwd" class="error" />
        </div>
        <div>
            <label>이름:</label>
            <form:input path="name" />
            <form:errors path="name" class="error" />
        </div>
        <div>
            <label>도로명 주소:</label>
            <form:password path="address" />
            <form:errors path="address" class="error" />
        </div>
        <div>
            <label>도로명 주소:</label>
            <form:password path="address_detail" />
            <form:errors path="address_detail" class="error" />
        </div>
        <button type="submit" class="btn">회원가입</button>
<%--    </form:form>--%>
</div>
</body>
</html>