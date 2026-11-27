package Bo;

import Model.Desenho;

public class DesenhoBo {
    public void validarDesenho(Desenho desenho) {
        if (desenho == null) {
            throw new IllegalArgumentException(
                    "O desenho não pode ser nulo."
            );
        }

        if (desenho.getUsuario() == null) {
            throw new IllegalArgumentException(
                    "O desenho precisa estar associado a um usuário."
            );
        }
    }
}
