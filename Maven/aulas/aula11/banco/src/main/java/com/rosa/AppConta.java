package main.java.com.rosa;

import com.rosa.dao.ContaCorrenteDao;
import com.rosa.model.ContaCorrente;

public class AppConta 
{
    public static void main( String[] args )
    {
        ContaCorrenteDao dao = new ContaCorrenteDao();
        ContaCorrente model = new ContaCorrente();
        model.setNome("Conta do Joaozin");
        model.setDescricao("Conta zero tarifa");


        dao.create(model);
    }
}