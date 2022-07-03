package digitalinnovationpoo;
/*
Classe criada para exercício de POO
* */

public class Carro extends Veiculo {
    String cor;
    String modelo;
    double capacidadeTanque;

    //Construtor
    public Carro(String cor, String modelo, double capacidadeTanque) {
        this.cor = cor;
        this.modelo = modelo;
        this.capacidadeTanque = capacidadeTanque;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public double getCapacidadeTanque() {
        return capacidadeTanque;
    }

    public void setCapacidadeTanque(double capacidadeTanque) {
        this.capacidadeTanque = capacidadeTanque;
    }

    //método do total para encher o tanque
    double totalValorTanque(double valorCombustivel){
        return capacidadeTanque * valorCombustivel;
    }
}
