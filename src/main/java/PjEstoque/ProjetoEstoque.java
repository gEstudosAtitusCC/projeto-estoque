package PjEstoque;

import model.TipoUsuario;
import model.Usuario;

public class ProjetoEstoque {

  
    public static void main(String[] args) {
        TipoUsuario tipo = new TipoUsuario();
        tipo.setId(1);
        tipo.setTipo("Administrador");
        
        Usuario user = new Usuario();
        user.setId(2);
        user.setNome("guilherme");
        user.setTipoUsuario(tipo);
        
        
    }
    
}
