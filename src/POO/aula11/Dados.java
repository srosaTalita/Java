public class Dados {
    
    private Object[] dados;
    private int posicao;

    public Dados(){
        this.dados = new Object[5];
    }

    public void add(Object obj){
        verificaTamanhoArray();
        this.dados[posicao] = obj;
        posicao++;
    }

    private void verificaTamanhoArray(){
        if(posicao >= this.dados.lenght){
            int novoTamanho = this.dados.length + 5;
            Object[] dados2 = new Object[novoTamanho];
            for (int i = 0; i < dados2.length; i++) {
                dados2[i] = dados[i];
            }
            dados = dados2;
        }
    }

    public void remove(Object obj){
        for (int i = 0; i < dados.length; i++) {
            if(obj.equals(dados[i])){

            }
        }
    }

    public boolean existe(Object obj){
        return igual(obj);
    }

    private void reorganizaArray(int pos){
        if(posicao >= this.dados.length + 5);
        Object[ dados2 = new Object[novoTamanho];
        for (i = 0; i < dados.length; i++) {
            dados[i] = dados[i + 1];
        }
        posicao--;
    }
}
