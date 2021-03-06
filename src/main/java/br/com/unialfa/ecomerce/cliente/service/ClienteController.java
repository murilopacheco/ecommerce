package br.com.unialfa.ecomerce.cliente.service;

import br.com.unialfa.ecomerce.cliente.domain.Cliente;

import br.com.unialfa.ecomerce.cliente.repository.ClienteRepositry;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path = "/api/cliente")
public class ClienteController {


    @Autowired
    private ClienteRepositry clienteRepositry;

    @GetMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    public Iterable<Cliente> listarCliente(){
        return clienteRepositry.findAll();
    }

    @PostMapping(path = "/add")
    public void cadastrarCliente( @RequestBody Cliente cliente ){
        clienteRepositry.save(cliente);
    }

    @PutMapping(path = "/edit")
    public void editarCliente( @RequestBody Cliente cliente ){
        clienteRepositry.save(cliente);
    }

    @DeleteMapping(value = "/delete/{id}")
    public @ResponseBody void deletarCliente(@PathVariable(name = "id") long id){
        clienteRepositry.deleteById(id);
    }

    // novo commit pelo intellij

}


