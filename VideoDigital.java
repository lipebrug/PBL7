// Criando classe ebook que extende (no caso é filha de) ItemBiblioteca... e implementa as interfaces Baixavel e Visualizavel
public class VideoDigital extends ItemBibliotecaDigital implements Baixavel, Visualizavel {

    // Criando atributo
    int minutagem;

    // Construtor
    public VideoDigital(String autor, String titulo, int minutagem) {
        super(autor, titulo);
        this.minutagem = minutagem;
    }

    // Implementand o metodo descricao
    @Override
    public void descricao() {
        System.out.println("");
        System.out.println("Vídeo digital: ");
        System.out.println("Título: " + titulo);
        System.out.println(minutagem + " Minutos de Duração");
        System.out.println("Por: " + autor);
    }

    // Implementando metodo baixar
    public void baixar() {
        System.out.println("");
        System.out.println("Video '" + titulo + "' baixado!");
    }

    // Implementando metodo visualizar
    @Override
    public void visualizar() {
        System.out.println("");
        System.out.println("Vídeo '" + titulo + "' visualizado!");
    }
}
