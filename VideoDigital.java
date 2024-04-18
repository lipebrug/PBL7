public class VideoDigital extends ItemBibliotecaDigital implements Baixavel, Visualizavel {

    int minutagem;

    public VideoDigital(String autor, String titulo, int minutagem) {
        super(autor, titulo);
        this.minutagem = minutagem;
    }

    @Override
    public void descricao() {
        System.out.println("");
        System.out.println("Vídeo digital: ");
        System.out.println("Título: " + titulo);
        System.out.println(minutagem + " Minutos de Duração");
        System.out.println("Por: " + autor);
    }

    public void baixar() {
        System.out.println("");
        System.out.println("Video '" + titulo + "' baixado!");
    }

    @Override
    public void visualizar() {
        System.out.println("");
        System.out.println("Vídeo '" + titulo + "' visualizado!");
    }
}
