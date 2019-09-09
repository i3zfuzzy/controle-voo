package service;

import model.Aviao;
import model.Pessoa;

import java.util.List;

public class PessoaService {

    public void cadastro(Pessoa pessoa, Aviao aviao){
        List<Pessoa> passageiros = aviao.getPassageiros();
        passageiros.add(pessoa);
        aviao.setPassageiros(passageiros);

    }

}
