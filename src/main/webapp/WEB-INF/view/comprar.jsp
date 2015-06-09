<!DOCTYPE html>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="sec"
	uri="http://www.springframework.org/security/tags"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Listar Contatos</title>
<link
	href="<c:url value="/webjars/bootstrap/3.3.4/css/bootstrap.min.css" />"
	rel="stylesheet" />
	
<script src="<c:url value="/webjars/jquery/2.1.0/jquery.js" />"></script>
<script
	src="<c:url value="/webjars/bootstrap/3.3.4/js/bootstrap.min.js" />"></script>
</head>


<style>
a{
	color:#fffaf6 !important;
}

#myTopBar{
	background-color: #3f302d;
}

#content{
	background-color: #e1e1e3;
}
</style>
	
<body>
	<nav class="navbar navbar-default navbar-fixed-on-top" id="myTopBar">
		<div class="container">
			<div class="navbar-header">
				<a href="" class="navbar-brand">Dev[]Store</a>
			</div>

			<ul class="nav navbar-nav navbar-right">
				<li><a href="">Contato</a></li>
				<li><a href="">Atendimento</a></li>
				<li><a href="">Quem somos</a></li>
			</ul>
		</div>
	</nav>

	<label>Nomes: ${produtos.nome}</label><br>
	<label>Descrição: ${produtos.descricao}</label>
	
</body>
</html>