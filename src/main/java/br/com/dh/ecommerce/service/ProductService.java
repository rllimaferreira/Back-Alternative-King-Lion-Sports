package br.com.dh.ecommerce.service;

import br.com.dh.ecommerce.repositories.CategoryRepository;
import br.com.dh.ecommerce.repositories.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductService {

    @Autowired
    private ProductRepository repository;

    @Autowired
    private CategoryRepository categoryRepository;

    // buscarTodos

    // buscarPorId

    // InserirProduto

    // AtualizarProduto

    // DeletarProduto

}
