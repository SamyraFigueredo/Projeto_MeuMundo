package Model;

import java.time.LocalDateTime;

public class Historia {
    private Long codHistoria;
    private String titulo;
    private String descricao;
    private LocalDateTime dataCriacao;
    private Usuario usuario; //representa o usuário responsável pela criação da história

    public Historia() {
    }

    public Historia(String titulo, String descricao, Usuario usuario) {
        this.titulo = titulo;
        this.descricao = descricao;
        this.usuario = usuario;
        this.dataCriacao = LocalDateTime.now();
    }

    public Long getCodHistoria() {
        return codHistoria;
    }

    public void setCodHistoria(Long codHistoria) {
        this.codHistoria = codHistoria;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
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
