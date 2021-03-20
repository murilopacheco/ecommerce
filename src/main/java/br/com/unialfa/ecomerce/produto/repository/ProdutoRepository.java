package br.com.unialfa.ecomerce.produto.repository;

import br.com.unialfa.ecomerce.produto.domain.Produto;
import org.springframework.data.repository.CrudRepository;

public interface ProdutoRepository extends CrudRepository<Produto, Long> {
}
