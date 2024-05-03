// Criando classe abstrata
public abstract class ItemBibliotecaDigital {

    // Criando atributos
    String autor;

    String titulo;

    //Construtores
    public ItemBibliotecaDigital() {
        this.autor = "";
        this.titulo = "";
    }

    public ItemBibliotecaDigital(String autor, String titulo) {
        this.autor = autor;
        this.titulo = titulo;
    }

    //Criando método descricao
    public abstract void descricao();

}
