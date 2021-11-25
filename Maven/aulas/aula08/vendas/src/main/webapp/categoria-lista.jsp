<%@ page import="java.util.ArrayList, com.rosa.vendas.models.Categoria"%>      
<% ArrayList<Categoria> categorias = (ArrayList<Categoria>)request.getAttribute("categorias");%>   

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Categoria - Lista</title>
    <%-- <link rel="stylesheet" href="../css/style.css"> --%>
</head>
<body>
    <h1>Lista de Categoria</h1>
    <form action="/vendas-1/categoria/listar">
        <input type="text" name="filtro" id="filtro" placeholder="Filtrar por nome...">
        <input type="submit" value="Buscar" style="margin-bottom: 5px;">
    </form>
    <table>
        <thead>
            <tr>
                <th>Id</th>
                <th>Nome</th>
                <th>Descrição</th>
                <th></th>
            </tr>
        </thead>
        <tbody>
            <%for (Categoria model : categorias) {%>
            <tr>
                <td><%= model.getId() %></td>
                <td><%= model.getNome() %></td>
                <td><%= model.getDescricao() %></td>
                <td>
                    <a href="/vendas-1/categoria/buscarId?id=<%= model.getId() %>">Alterar</a>
                    <a href="/vendas-1/categoria/deletar?id=<%= model.getId() %>">Deletar</a>
                </td>
            </tr>
            <%}%>
        </tbody>
    </table>
</body>
</html>      
        