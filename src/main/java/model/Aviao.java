package model;

import java.util.List;

public class Aviao {

    private boolean isMotor;

    private double velocidade;

    private boolean isVoando;

    private List<Pessoa> passageiros;

    public Aviao() {
    }

    public Aviao(boolean isMotor, double velocidade, boolean isVoando, List<Pessoa> passageiros) {
        this.isMotor = isMotor;
        this.velocidade = velocidade;
        this.isVoando = isVoando;
        this.passageiros = passageiros;
    }

    public boolean isMotor() {
        return isMotor;
    }

    public void setMotor(boolean motor) {
        isMotor = motor;
    }

    public double getVelocidade() {
        return velocidade;
    }

    public void setVelocidade(double velocidade) {
        this.velocidade = velocidade;
    }

    public boolean isVoando() {
        return isVoando;
    }

    public void setVoando(boolean voando) {
        isVoando = voando;
    }

    public List<Pessoa> getPassageiros() {
        return passageiros;
    }

    public void setPassageiros(List<Pessoa> passageiros) {
        this.passageiros = passageiros;
    }
}
