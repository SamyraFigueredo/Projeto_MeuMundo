package br.com.meumundo.Model;

import java.time.LocalDateTime;

public class Desenho {
    private Long codDesenho;
    private String titulo;
    private String conteudo;
    private LocalDateTime dataCriacao;
    private Usuario usuario;

    public Desenho() {
    }

    public Desenho(String titulo, String conteudo, Usuario usuario) {
        this.titulo = titulo;
        this.conteudo = conteudo;
        this.usuario = usuario;
        this.dataCriacao = LocalDateTime.now();
    }

    public Long getCodDesenho() {
        return codDesenho;
    }

    public void setCodDesenho(Long codDesenho) {
        this.codDesenho = codDesenho;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getConteudo() {
        return conteudo;
    }

    public void setConteudo(String conteudo) {
        this.conteudo = conteudo;
    }

    public LocalDateTime getDataCriacao() {
        return dataCriacao;
    }

    public void setDataCriacao(LocalDateTime dataCriacao) {
        this.dataCriacao = dataCriacao;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }
}