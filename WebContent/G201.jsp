<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ include file="/WEB-INF/jsp/common.jsp"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>ログイン</title>
</head>
<body>
<h1>ログイン</h1>
<h2><c:out value="${errorMessage}" /></h2>
<form action="<%=request.getContextPath()%>/Login" method="post">
<table>
	<tr>
		<td><input type="text" name="userid" size="40" placeholder="学生ID"></td>
	</tr>
	<tr>
		<td><input type="password" name="pass" size="40" placeholder="パスワード"></td>
	</tr>
</table>

<input type="submit" class="button" value="ログイン">
</form>
</body>
</html>