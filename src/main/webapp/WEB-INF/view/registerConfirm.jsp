<%@ page pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html lang="ja">
<head>
<meta charset="UTF-8">
<title>会員登録内容確認</title>
</head>
<body>
<h1>会員登録内容確認</h1>
<p>お名前:<c:out value="${name}" /></p>
<p>メールアドレス:<c:out value="${email}" /></p>
<p>パスワード:<c:out value="${password}" /></p>
<form action="" method="post">
<input type="submit" value="登録する" name="register">
</form>
<p><a href="form">戻る</a>
</body>
</html>