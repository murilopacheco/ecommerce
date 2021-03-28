package br.com.unialfa.ecomerce.fornecedor.domain;

import br.com.unialfa.ecomerce.produto.domain.Produto;

import javax.persistence.*;
import java.util.List;

@Entity
public class Fornecedor {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private String nome;

    @ManyToMany
    private List<Produto> produtos;
}
