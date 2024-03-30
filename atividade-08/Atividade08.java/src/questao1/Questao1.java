package questao1;
public class Questao1 {
    public static void main(String[] args) {
        //Instanciando 
        ContaBancaria cliente1 = new ContaBancaria("Roberval", "1234567891011");
        
        //exibição
        cliente1.statusInicial();
        cliente1.setSaldo(5256.45);
        System.out.println("-----------------------");
        cliente1.statusAtual();
        
    }
}
