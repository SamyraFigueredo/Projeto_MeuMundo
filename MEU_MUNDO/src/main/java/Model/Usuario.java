package Model;

import java.time.LocalDateTime;

public class Usuario {
    private Long codUsuario;
    private String nome;
    private String email;
    private String senhaHash;
    private PerfilUsuario perfil;
    private LocalDateTime dataCadastro;

    public Usuario() {
    }

    // dados principais para o construtor
    public Usuario(String nome, String email,String senhaHash, PerfilUsuario perfil){
        this.nome = nome;
        this.email = email;
        this.senhaHash = senhaHash;
        this.perfil = perfil;
        this.dataCadastro = LocalDateTime.now();
    }

    // metodos auxiliares para identificar usuario
    public boolean isCrianca() {
        return perfil == PerfilUsuario.CRIANCA;
    }

    public boolean isResponsavel() {
        return perfil == PerfilUsuario.RESPONSAVEL;
    }

    public boolean isMediador() {
        return perfil == PerfilUsuario.MEDIADOR;
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

    public String getSenhaHash() {
        return senhaHash;
    }

    public void setSenhaHash(String senhaHash) {
        this.senhaHash = senhaHash;
    }

    public PerfilUsuario getPerfil() {
        return perfil;
    }

    public void setPerfil(PerfilUsuario perfil) {
        this.perfil = perfil;
    }

    public LocalDateTime getDataCadastro() {
        return dataCadastro;
    }

    public void setDataCadastro(LocalDateTime dataCadastro) {
        this.dataCadastro = dataCadastro;
    }
}