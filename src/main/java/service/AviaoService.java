package service;

import model.Aviao;

public class AviaoService {

    public void ligarAviao(Aviao aviao){
        if(aviao.isMotor() == true){
            System.out.println("ERRO, Aviao ja esta ligado");
        }else{
            aviao.setMotor(true);
            System.out.println("Avião foi ligado com sucesso");
        }

    }
    public void desligarAviao(Aviao aviao){
        if(aviao.isVoando() == false){
            if(aviao.isMotor() == false) {
                System.out.println("ERRO, Avião ja esta desligado");
            }else{
                aviao.setMotor(false);
                System.out.println("Motor acaba de ser desligado com sucesso");
            }

        }

    }
}
