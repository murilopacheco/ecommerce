package br.com.unialfa.ecomerce;

import br.com.unialfa.ecomerce.cliente.domain.Cliente;
import br.com.unialfa.ecomerce.cliente.repository.ClienteRepositry;
import br.com.unialfa.ecomerce.pedido.domain.ItensPedido;
import br.com.unialfa.ecomerce.pedido.domain.Pedido;
import br.com.unialfa.ecomerce.pedido.repository.ItensPedidoRepository;
import br.com.unialfa.ecomerce.pedido.repository.PedidoRepostory;
import br.com.unialfa.ecomerce.produto.domain.Produto;
import br.com.unialfa.ecomerce.produto.repository.ProdutoRepository;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
public class EcomerceApplication {

	@Autowired
	private ClienteRepositry clienteRepositry;

	@Autowired
	private PedidoRepostory pedidoRepostory;

	@Autowired
	private ProdutoRepository produtoRepository;

	@Autowired
	private ItensPedidoRepository itensPedidoRepository;

	public static void main(String[] args) {
		SpringApplication.run(EcomerceApplication.class, args);


	}

	@Bean
	InitializingBean sendDatabase() {
		Cliente cliente = new Cliente();
		cliente.setNome("ClienteTeste");
		cliente.setCpf("111.111.111-11");
		cliente.setDataNascimento(LocalDate.now());
		cliente.setVersao(1);
		cliente.setPrimeiroNome("Teste");
		clienteRepositry.save(cliente);


		Pedido pedido = new Pedido();
		pedido.setCliente(cliente);
		pedido.setDataCriacaoPedido(LocalDate.now());
		pedido.setDataUltimaAtualizacao(LocalDate.now());
		pedido.setDataConclusao(LocalDate.now());
		pedido.setSubtotal(BigDecimal.ZERO);
		pedido.setTotal(BigDecimal.ZERO);
		pedido.setValorFrete(BigDecimal.ZERO);

		pedidoRepostory.save(pedido);

		List<Produto> produtos = new ArrayList<>();

		Produto produto = new Produto();
		produto.setAtivo(true);
		produto.setNome("produto1");
		produto.setDescricao("Produto teste 1");
		produto.setPreco(BigDecimal.valueOf(10.00));
		produtos.add(produto);

		Produto produto2 = new Produto();
		produto.setAtivo(true);
		produto.setNome("produto2");
		produto.setDescricao("Produto teste 2");
		produto.setPreco(BigDecimal.valueOf(100.00));
		produtos.add(produto2);

		produtoRepository.saveAll(produtos);

		List<ItensPedido> itensPedidos = new ArrayList<>();
		ItensPedido itensPedido = new ItensPedido(pedido, produto, 1);

		ItensPedido itensPedido2 = new ItensPedido(pedido, produto2, 2);
		itensPedidos.add(itensPedido);
		itensPedidos.add(itensPedido2);

		itensPedidoRepository.saveAll(itensPedidos);




		return null;



	}

}
