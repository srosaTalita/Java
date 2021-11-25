<%
    int id = (Integer)request.getAttribute("id");
%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
    <link rel="stylesheet" href="css/style.css">
</head>
<body>
    <h1>Sucesso</h1>
    <h3>Categoria de id <%= id%>cadastrado com sucesso!</h3>
    <a href="/vendas-1/categoria/listar">Lista de Categorias</a>
</body>
</html>