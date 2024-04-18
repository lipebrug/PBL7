public abstract class ItemBibliotecaDigital {

    String autor;

    String titulo;

    public ItemBibliotecaDigital() {
        this.autor = "";
        this.titulo = "";
    }

    public ItemBibliotecaDigital(String autor, String titulo) {
        this.autor = autor;
        this.titulo = titulo;
    }

    public abstract void descricao();

}
