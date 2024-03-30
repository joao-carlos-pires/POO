package questao2;

public class Carro {
    private String modelo;
    private String marca;
    private int anoFabricacao;
    private int velocidadeAtual;
    
    public Carro (String modelo, String marca, int anoFabricacao ) {
        this.modelo = modelo;
        this.marca = marca;
        this.anoFabricacao = anoFabricacao;
        this.velocidadeAtual = 0;

    }

    public String getModelo() {
        return modelo;
    }
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    public String getMarca() {
        return marca;
    }
    public void setMarca(String marca) {
        this.marca = marca;
    }
    public int getAnoFabricacao() {
        return anoFabricacao;
    }
    public void setAnoFabricacao (int anoFabricacao) {
        this.anoFabricacao = anoFabricacao;
    }
    private int getVelocidadeAtual(){
        return velocidadeAtual;
    }
    private void setVelocidadeAtual(int velocidadeAtual){
        this.velocidadeAtual = velocidadeAtual;
    }
    public void acelerar() {
        if(this.getVelocidadeAtual() < 220) {
        this.setVelocidadeAtual(this.getVelocidadeAtual() + 10);}
    }
    public void desacelerar() {
        if(this.getVelocidadeAtual()>= 5) {
            this.setVelocidadeAtual(this.getVelocidadeAtual() - 5);
        }
    }
    public void parar() {
        if(this.getVelocidadeAtual() > 0) {
            this.setVelocidadeAtual(0);
        }
    }
    public void mostrarVelocidade() {
        System.out.println(this.getVelocidadeAtual() + "KM/h");
    }

    
}
