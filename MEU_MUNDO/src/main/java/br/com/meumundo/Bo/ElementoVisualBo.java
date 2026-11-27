package br.com.meumundo.Bo;

import br.com.meumundo.Model.ElementoVisual;

public class ElementoVisualBo {
    public void validarElementoVisual(ElementoVisual elemento) {

        if (elemento == null) {throw new IllegalArgumentException("O elemento visual não pode ser nulo.");}

        if (elemento.getNome() == null || elemento.getNome().isBlank()) {
            throw new IllegalArgumentException("O nome do elemento visual é obrigatório.");}

        if (elemento.getTipo() == null) {
            throw new IllegalArgumentException("O tipo do elemento visual é obrigatório.");}
    }
}
