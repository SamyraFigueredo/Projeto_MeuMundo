package br.com.meumundo.Bo;

import Bo.UsuarioBo;
import Model.PerfilUsuario;
import Model.Usuario;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class UsuarioBoTest {
    private final UsuarioBo usuarioBo = new UsuarioBo();

    @Test
    void deveValidarUsuarioCorretamente() {
        Usuario usuario = new Usuario("Ana", "ana@gmail.com", "12345", PerfilUsuario.CRIANCA);
        assertDoesNotThrow(() -> usuarioBo.validarUsuario(usuario));
    }

    @Test
    void naoDeveAceitarUsuarioNulo() {
        assertThrows(IllegalArgumentException.class, () -> usuarioBo.validarUsuario(null));
    }

    @Test
    void naoDeveAceitarEmailInvalido() {
        Usuario usuario = new Usuario(
                "Ana",
                "email-invalido",
                "senhaHash",
                PerfilUsuario.CRIANCA
        );
        assertThrows(IllegalArgumentException.class, () -> usuarioBo.validarUsuario(usuario));
    }

    @Test
    void naoDeveAceitarSenhaVazia() {
        Usuario usuario = new Usuario("Ana", "ana@gmail.com", "", PerfilUsuario.CRIANCA);
        assertThrows(IllegalArgumentException.class, () -> usuarioBo.validarUsuario(usuario)
        );
    }
}