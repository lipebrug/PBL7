public class Ebook extends ItemBibliotecaDigital implements Baixavel {

    int numPag;

    public Ebook(String autor, String titulo, int numPag) {
        super(autor, titulo);
        this.numPag = numPag;
    }
    @Override
    public void descricao() {
        System.out.println("");
        System.out.println("Ebook");
        System.out.println("Título: " + titulo);
        System.out.println(numPag + " Páginas");
        System.out.println("De: " + autor);
    }

    public void baixar() {
        System.out.println("");
        System.out.println("Livro '" + titulo + "' baixado!");
    }
}
