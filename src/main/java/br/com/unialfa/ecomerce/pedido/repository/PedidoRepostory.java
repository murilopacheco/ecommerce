package br.com.unialfa.ecomerce.pedido.repository;

import br.com.unialfa.ecomerce.pedido.domain.Pedido;
import org.springframework.data.repository.CrudRepository;

public interface PedidoRepostory extends CrudRepository<Pedido, Long> {
}
