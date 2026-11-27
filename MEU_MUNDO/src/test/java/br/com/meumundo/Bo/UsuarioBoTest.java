package br.com.meumundo.Bo;

import br.com.meumundo.Model.PerfilUsuario;
import br.com.meumundo.Model.Usuario;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;

public class UsuarioBoTest {
    private final UsuarioBo usuarioBo = new UsuarioBo();

    @Test
    void deveValidarUsuarioCorretamente() {
        Usuario usuario = new Usuario("Ana", "ana@gmail.com", "12345", PerfilUsuario.CRIANCA);
        assertDoesNotThrow(() -> usuarioBo.validarUsuario(usuario));
    }
}