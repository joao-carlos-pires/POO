package questao5;


public class Index5 {
    public static void main(String[] args) {
        Livro l1 = new Livro("Saramago", "Ensaio sobre a cegueira ");
        l1.setAnoPublicado(1950);//teste com ano errado
        l1.exibirStatus();
        l1.setAnoPublicado(2008);//teste com o ano correto
        l1.exibirStatus();
    }
    
    
}
