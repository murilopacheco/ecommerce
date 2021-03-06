package br.com.unialfa.ecomerce.cliente.repository;

import br.com.unialfa.ecomerce.cliente.domain.Cliente;
import org.springframework.data.repository.CrudRepository;

public interface ClienteRepositry extends CrudRepository<Cliente, Long> {
}
