
package Model;

public class ElementoVisual {

    private Long codElemento;
    private String nome;
    private String descricao;
    private TipoElementoVisual tipo;
    private String caminhoImagem;

    public ElementoVisual() {
    }

    public ElementoVisual(String nome, String descricao, TipoElementoVisual tipo, String caminhoImagem) {
        this.nome = nome;
        this.descricao = descricao;
        this.tipo = tipo;
        this.caminhoImagem = caminhoImagem;
    }

    // Getters e Setters
    public Long getCodElemento() {
        return codElemento;
    }

    public void setCodElemento(Long codElemento) {
        this.codElemento = codElemento;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public TipoElementoVisual getTipo() {
        return tipo;
    }

    public void setTipo(TipoElementoVisual tipo) {
        this.tipo = tipo;
    }

    public String getCaminhoImagem() {
        return caminhoImagem;
    }

    public void setCaminhoImagem(String caminhoImagem) {
        this.caminhoImagem = caminhoImagem;
    }
}