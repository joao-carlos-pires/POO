package questao5;

public class Livro {
    private String autor;
    private String titulo;
    private int anoPublicado = 1995;// primeira publicação do título usado como exemplo
    

    public Livro(String autor, String titulo) {
        this.autor = autor;
        this.titulo = titulo;
       
    }

    public String getAutor() {
        return autor;
    }
    public void setAutor(String autor) {
        this.autor = autor;
    }
    public String getTitulo() {
        return titulo;
    }
    public void setTiulo (String titulo) {
        this.titulo = titulo;
    }
    public int getAnoPublicado() {
        return anoPublicado;
    }
    public void setAnoPublicado(int anoPublicado) {
        if(anoPublicado<= 2024 && anoPublicado >= 1995)//ano atual e ano da primeira publicação {
        this.anoPublicado = anoPublicado;
        }
    
    
    public void exibirStatus() {
        System.out.println("O nome do livro é " + this.getTitulo());
        System.out.println("O autor do livro é "+ this.getAutor());
        System.out.println("O ano de publicação é " + this.getAnoPublicado());
    }
}
