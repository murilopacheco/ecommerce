package br.com.unialfa.ecomerce.cliente;

import br.com.unialfa.ecomerce.cliente.domain.Cliente;
import br.com.unialfa.ecomerce.cliente.service.ClienteController;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;

import java.util.ArrayList;
import java.util.List;

@SpringBootTest
@AutoConfigureMockMvc
public class ClienteTest {

    @Autowired
    private MockMvc mockMvc;

    @Autowired
    private ObjectMapper objectMapper;

    @Autowired
    private ClienteController clienteController;

    @Test
    void getClientes() throws Exception{

        List<Cliente> clienteList = new ArrayList();

        mockMvc.perform(get ("/api/cliente")
                .contentType("application/json")
                .content(objectMapper.writeValueAsString(cliente)))
                .andExpect(status().isOk());

        clienteList = (List<Cliente>) clienteController.listarCliente();

    }
}
