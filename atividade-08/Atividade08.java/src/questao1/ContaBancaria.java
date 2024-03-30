package questao1;

public class ContaBancaria {
    private String nome;
    private String numConta;
    private double saldo = 0.0;
    public ContaBancaria(String nome, String numConta) {
        this.nome = nome;
        this.numConta = numConta;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getNumConta() {
        return numConta;
    }
    public void setNumConta(String numConta) {
        this.numConta = numConta;
    }
    public double getSaldo() {
        return saldo;
    }
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public void statusInicial() {
        System.out.println("O cliente " + this.getNome());
        System.out.println("O número da conta do cliente " + this.getNome() + " é: " + this.getNumConta());
        System.out.println("Primeiro saldo do deste cliente é R$" + this.getSaldo());
    }
    public void statusAtual() {
        System.out.println("O cliente " + this.getNome());
        System.out.println("O número da conta do cliente " + this.getNome() + " é: " + this.getNumConta());
        System.out.println("O saldo atual do cliente é R$" + this.getSaldo());

    }
    
    
}
