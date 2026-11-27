package br.com.meumundo.Bo;

import br.com.meumundo.Model.ElementoHistoria;

public class ElementoHistoriaBo {
    public void validarHistoriaElemento(ElementoHistoria historiaElemento) {
        if (historiaElemento == null) {
            throw new IllegalArgumentException("A associação não pode ser nula.");}

        if (historiaElemento.getHistoria() == null) {
            throw new IllegalArgumentException("A história precisa ser informada.");}

        if (historiaElemento.getElementoVisual() == null) {
            throw new IllegalArgumentException("O elemento visual precisa ser informado.");}

        if (historiaElemento.getOrdem() == null || historiaElemento.getOrdem() <= 0) {
            throw new IllegalArgumentException("A ordem deve ser maior que zero.");}
    }
}
