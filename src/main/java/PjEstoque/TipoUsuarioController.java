package PjEstoque;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import model.TipoUsuario;
import repositories.TipoUsuarioRepository;

@RestController
@RequestMapping("/tipousuario")
public class TipoUsuarioController {
	@Autowired
	private TipoUsuarioRepository tipoUsuarioRepository;
	@GetMapping("/")
	public List<TipoUsuario> findAll(){
		return tipoUsuarioRepository.findAll();
	}

}
