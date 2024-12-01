package br.edi.unisep.biblioteca.model;

public class LivroDigital extends Livro {
    private String url;

    public LivroDigital(String titulo, String autor, String genero, String url, int anoPublicacao, String editora, String s) {
        super(titulo, autor, genero);
        this.url = url;
    }

    public String getUrl() {
        return url;
    }
}