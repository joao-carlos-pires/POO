package questao2;

public class Questao2 {
    public static void main(String[] args) {
        Carro c1 = new Carro("Uno", "Fiat", 2010);
        c1.mostrarVelocidade();
        for(int i = 1; i< 9; i++) {
            c1.acelerar();
        }
        c1.mostrarVelocidade();
    }
    
}
