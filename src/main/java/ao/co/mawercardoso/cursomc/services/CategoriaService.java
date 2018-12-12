package ao.co.mawercardoso.cursomc.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ao.co.mawercardoso.cursomc.domain.Categoria;
import ao.co.mawercardoso.cursomc.repositories.CategoriaRepository;
import ao.co.mawercardoso.cursomc.services.exceptions.ObjectNotFoundException;

@Service
public class CategoriaService {
	
	@Autowired
	private CategoriaRepository repo;

	public Categoria buscar(Integer id) {
		Optional<Categoria> obj = repo.findById(id);
		return obj.orElseThrow(() -> new ObjectNotFoundException(
						"Objecto não encontrado! Id: " + id + ", Tipo: " + Categoria.class.getName()));
		
	}
}
