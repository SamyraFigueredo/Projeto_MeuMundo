package Bo;

import Model.Historia;

public class HistoriaBo {
    public void validarHistoria(Historia historia) {
        if (historia == null) {
            throw new IllegalArgumentException(
                    "A história não pode ser nula."
            );
        }
        if (historia.getUsuario() == null) {
            throw new IllegalArgumentException(
                    "A história precisa estar associada a um usuário."
            );
        }
    }}
