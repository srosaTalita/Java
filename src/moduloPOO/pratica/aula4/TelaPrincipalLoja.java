package moduloPOO.pratica.aula4;

public class TelaPrincipalLoja {

    public static void main(String[] args) {
        Produto produto = new Produto();
        produto.setCodigo("abc123");
        produto.setDesc("60 polegadas - Full HD");
        produto.setNome("Televisão");
        produto.setValor(10000.00);

        String codigo = produto.getCodigo();
        String nome = produto.getNome();
        String desc = produto.getDesc();
        Double valor = produto.getValor();

        System.out.printf("Código: %s | Produto: %s, %s, %.2f reais.", codigo, nome, desc, valor);
    }   
}
