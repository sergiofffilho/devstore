<!DOCTYPE html>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Cadastro de Produto</title>
</head>
<body>
	<h2>Novo Produto</h2><br>
	
	<form id="adicionarProdutoForm"  method="POST" action="adicionar">
		<label>Nome: </label>
		<input type="text" name="nome"/><br>
		<label>Preço: </label>
		<input type="text" name="preco"/><br>
		<label>Quantidade: </label>
		<input type="text" name="quantidade"/><br>
		
		<input type="submit" value="Adicionar"/>
	</form>
</body>
</html>