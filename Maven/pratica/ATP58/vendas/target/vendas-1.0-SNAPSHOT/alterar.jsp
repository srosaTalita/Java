<%@ page import="com.rosa.vendas.models.Categoria" %>

<%
    Categoria model = (Categoria)request.getAttribute("model");
%>

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Categoria - Alterar</title>
    <link rel="stylesheet" href="../css/style.css">
</head>
<body>
    <h1>Alterar Categoria</h1>
    <form action="/vendas-1/categoria/alterar" method="post">
        Id: <input type="number" name="id" id="id" value="<%= model.getId() %>" readonly>
        Nome: <input type="text" name="nome" id="nome" value="<%= model.getNome() %>">
        Descrição: <input type="text" name="descricao" id="descricao" value="<%= model.getDescricao() %>">
        <input type="submit" value="Salvar">
    </form>
</body>
</html>