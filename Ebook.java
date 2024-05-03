// Criando classe ebook que extende (no caso é filha de) ItemBiblioteca... e implementa a interface Baixavel
public class Ebook extends ItemBibliotecaDigital implements Baixavel {

    int numPag;

    public Ebook(String autor, String titulo, int numPag) {
        super(autor, titulo);
        this.numPag = numPag;
    }

    // Definindo metodo e sobrescevendo ele (todos os metodos da classe-pai abstrata devem ser implementados nas filhas)
    @Override
    public void descricao() {
        System.out.println("");
        System.out.println("Ebook");
        System.out.println("Título: " + titulo);
        System.out.println(numPag + " Páginas");
        System.out.println("De: " + autor);
    }

    // Definindo metodo da interface (todos os metodos da interface devem ser implementados)
    public void baixar() {
        System.out.println("");
        System.out.println("Livro '" + titulo + "' baixado!");
    }
}
