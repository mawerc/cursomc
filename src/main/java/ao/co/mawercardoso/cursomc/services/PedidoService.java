package ao.co.mawercardoso.cursomc.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ao.co.mawercardoso.cursomc.domain.Pedido;
import ao.co.mawercardoso.cursomc.repositories.PedidoRepository;
import ao.co.mawercardoso.cursomc.services.exceptions.ObjectNotFoundException;

@Service
public class PedidoService {
	
	@Autowired
	private PedidoRepository repo;

	public Pedido buscar(Integer id) {
		Optional<Pedido> obj = repo.findById(id);
		return obj.orElseThrow(() -> new ObjectNotFoundException(
						"Objecto não encontrado! Id: " + id + ", Tipo: " + Pedido.class.getName()));
		
	}
}
