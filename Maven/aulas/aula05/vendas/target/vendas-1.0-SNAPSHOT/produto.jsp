<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Produto - Cadastro</title>
</head>
<body>
    <h1>Cadastro de Produto</h1>
    <form action="/vendas-1/produto">
        Id: <input type="number" name="id" id="id" min="0">
        Nome: <input type="text" name="nome" id="nome">
        Valor: <input type="number" name="valor" id="valor"  min="0.00" max="10000.00">
        <input type="submit" value="Salvar">
    </form>
</body>
</html>