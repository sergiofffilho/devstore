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
	href="<c:url value="/webjars/bootstrap/3.3.4/css/bootstrap.min.css" />
	rel=" stylesheet" />
<script src="<c:url value="/webjars/jquery/2.1.0/jquery.js" />"></script>
<script
	src="<c:url value="/webjars/bootstrap/3.3.4/js/bootstrap.min.js" />"></script>
<link href="<c:url value="/resources/css/style.css" />" rel="stylesheet" />
</head>
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

	<div class="container">
		<div class="jumbotron" id="content"></div>
	</div>
	<h2>Contatos</h2>
	<c:forEach items="${contatos}" var="contato">
		<label>Nome: ${contato.nome }</label> | 
		<label>Email: ${contato.email }</label> | 
		<label>Telefone: ${contato.telefone }</label>
		<a href="/contatos/remover/${contato.id }">remover</a>
		<br>
	</c:forEach>
	<a href="/contatos/adicionar">Adicionar</a>
</body>
</html>