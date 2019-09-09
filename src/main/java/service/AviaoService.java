package service;

import model.Aviao;

public class AviaoService {                                                     //

    public void ligarAviao(Aviao aviao) {
        if (aviao.isMotor() == true) {
            System.out.println("ERRO, Aviao ja esta ligado");
        } else {
            aviao.setMotor(true);
            System.out.println("Avião foi ligado com sucesso");
        }

    }

    public void desligarAviao(Aviao aviao) {
        if (aviao.isVoando() == false) {
            if (aviao.isMotor() == false) {
                System.out.println("ERRO, Avião ja esta desligado");
            } else {
                aviao.setMotor(false);
                aviao.setVelocidade(0);
                System.out.println("Motor acaba de ser desligado com sucesso");
            }
        } else {
            System.out.println("ERRO, Aviao em movimento, nao é possivel desligar");
        }
    }

    public void aumentarVelocidade(Aviao aviao, double novaVelocidade) {
        if (aviao.isMotor() == true) {
            System.out.println("Aumentando velocidade do Avião");
            aviao.setVelocidade(novaVelocidade);
        } else {
            System.out.println("ERRO, Aviao Desligado");
        }
    }

    public void diminuirVelocidade(Aviao aviao, double novaVelocidade) {
        if (novaVelocidade > aviao.getVelocidade()) {
            System.out.println("ERRO, nova velocidade nao pode ser menor que velocidade atual");
        } else {
            if (aviao.isMotor() == true) {
                System.out.println("Diminuindo velocidade do Avião");


                aviao.setVelocidade(aviao.getVelocidade() - novaVelocidade);
            } else {
                System.out.println("ERRO, Avião Desligado");
            }
        }
    }

    public void levantarVoo(Aviao aviao) {
        if (aviao.isMotor() == true) {
            if (aviao.isVoando() == false) {
                System.out.println("Avião levantando Vôo");
                aviao.setVoando(true);
            } else {
                System.out.println("ERRO, Não é possivel levantar Vôo");
            }
        } else {
            System.out.println("ERRO, aviao nao pode decolar, motor desligado");
        }

    }

    public void pousar(Aviao aviao) {
        if (aviao.isMotor() == true && aviao.isVoando() == true) {
            System.out.println("Pousando avião");
            aviao.setVoando(false);
        } else {
            System.out.println("ERRO, não é possivel pousar o aviao no momento");
        }
    }
}
