package br.com.unialfa.ecomerce.pedido.repository;

import br.com.unialfa.ecomerce.pedido.domain.ItemPedidoId;
import br.com.unialfa.ecomerce.pedido.domain.ItensPedido;
import org.springframework.data.repository.CrudRepository;

public interface ItensPedidoRepository extends CrudRepository<ItensPedido, ItemPedidoId> {
}
