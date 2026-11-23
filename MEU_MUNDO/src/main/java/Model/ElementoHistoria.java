package Model;

public class ElementoHistoria {
    private Long codElementoHistoria;
    private Historia historia;
    private ElementoVisual elementoVisual;
    private Integer ordem;

    public ElementoHistoria() {
    }

    public ElementoHistoria(Historia historia, ElementoVisual elementoVisual, Integer ordem) {
        this.historia = historia;
        this.elementoVisual = elementoVisual;
        this.ordem = ordem;
    }

    public Long getCodElementoHistoria() {
        return codElementoHistoria;
    }

    public void setCodElementoHistoria(Long codElementoHistoria) {
        this.codElementoHistoria = codElementoHistoria;
    }

    public Historia getHistoria() {
        return historia;
    }

    public void setHistoria(Historia historia) {
        this.historia = historia;
    }

    public ElementoVisual getElementoVisual() {
        return elementoVisual;
    }

    public void setElementoVisual(ElementoVisual elementoVisual) {
        this.elementoVisual = elementoVisual;
    }

    public Integer getOrdem() {
        return ordem;
    }

    public void setOrdem(Integer ordem) {
        this.ordem = ordem;
    }
}
