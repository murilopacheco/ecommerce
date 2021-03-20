package br.com.unialfa.ecomerce.pedido.service;


import br.com.unialfa.ecomerce.cliente.domain.Cliente;
import br.com.unialfa.ecomerce.pedido.domain.Pedido;
import br.com.unialfa.ecomerce.pedido.repository.PedidoRepostory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path = "/api/pedido")
public class PedidoController {

    @Autowired
    private PedidoRepostory pedidoRepostory;

    @GetMapping(path = "/{idCliente}",produces = MediaType.APPLICATION_JSON_VALUE)
    public Iterable<Pedido> listarPedido(@PathVariable Long idCliente){
        Cliente cliente = new Cliente();
        cliente.setId(idCliente);
        return pedidoRepostory.findByCliente(cliente);
    }

    @PostMapping(path = "/add")
    public void cadastrarPedido( @RequestBody Pedido pedido ){

        pedidoRepostory.save(pedido);
    }

    @PutMapping(path = "/edit")
    public void editarPdido( @RequestBody Pedido pedido ){

        pedidoRepostory.save(pedido);
    }

    @DeleteMapping(value = "/delete/{id}")
    public @ResponseBody void deletarPedido(@PathVariable(name = "id") long id){

        pedidoRepostory.deleteById(id);
    }



}
