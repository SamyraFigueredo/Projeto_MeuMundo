package Bo;

import Model.Usuario;

public class UsuarioBo {

    public void validarUsuario(Usuario usuario) {
        if (usuario == null) {throw new IllegalArgumentException("O usuário não pode ser nulo.");}

        if (usuario.getNome() == null || usuario.getNome().isBlank()) {
            throw new IllegalArgumentException("O nome do usuário é obrigatório.");
        }
        if (usuario.getEmail() == null || !usuario.getEmail().matches("^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+$")) {
            throw new IllegalArgumentException("Informe um e-mail válido.");
        }
        if (usuario.getSenhaHash() == null || usuario.getSenhaHash().isBlank()) {
            throw new IllegalArgumentException("A senha é obrigatória.");
        }
        if (usuario.getPerfil() == null) {
            throw new IllegalArgumentException("O perfil do usuário é obrigatório.");
        }
    }
    //metodo que recebe um usuario e verifica se os dados necessários estão corretos. Caso alguma regra não seja atendida, uma exceçao será lançada
}