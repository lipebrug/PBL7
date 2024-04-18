//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Ebook hp = new Ebook("J.K. Rowling", "Harry Potter e a Pedra Filosofal", 260);
        Ebook got = new Ebook("George R. R. Martin", "A Guerra dos Tronos", 850);
        Ebook duna = new Ebook("Frank Herbert", "Duna", 650);
        Ebook dunm = new Ebook("Frank Herbert", "Messias de Duna", 250);
        Ebook lotr = new Ebook("J. R. R. Tolkien", "O Senhor dos Anéis", 800);
        VideoDigital v1 = new VideoDigital("Marina", "Introdução à POO", 55);
        VideoDigital v2 = new VideoDigital("Roberto", "Conectando HTML e CSS", 25);
        VideoDigital v3 = new VideoDigital("Maicris", "Como instalar Pyhon", 15);
        VideoDigital v4 = new VideoDigital("Cristina", "Implementando CRUD", 65);
        VideoDigital v5 = new VideoDigital("Aline", "Modelagem e POO", 45);

        hp.descricao();
        got.descricao();
        duna.descricao();
        dunm.descricao();
        lotr.descricao();
        v1.descricao();
        v2.descricao();
        v3.descricao();
        v4.descricao();
        v5.descricao();
        got.baixar();
        lotr.baixar();
        v1.visualizar();
        v2.visualizar();
        v2.baixar();

        // Testando com polimorfismo
        ItemBibliotecaDigital i = got;
        i.descricao();
        i = lotr;
        i.descricao();
        i = v4;
        i.descricao();
    }
}