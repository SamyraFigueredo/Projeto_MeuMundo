package br.com.meumundo.Vo;

import br.com.meumundo.Model.PerfilUsuario;

public class UsuarioVo {
    private Long codUsuario;
    private String nome;
    private String email;
    private PerfilUsuario perfil;

    public UsuarioVo() {
    }

    public UsuarioVo(Long codUsuario, String nome, String email, PerfilUsuario perfil) {
        this.codUsuario = codUsuario;
        this.nome = nome;
        this.email = email;
        this.perfil = perfil;
    }

    public Long getCodUsuario() {
        return codUsuario;
    }

    public void setCodUsuario(Long codUsuario) {
        this.codUsuario = codUsuario;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public PerfilUsuario getPerfil() {
        return perfil;
    }

    public void setPerfil(PerfilUsuario perfil) {
        this.perfil = perfil;
    }
}