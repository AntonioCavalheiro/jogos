package br.com.jpplacca.estoque.services;

import br.com.jpplacca.estoque.model.Produto;
import br.com.jpplacca.estoque.repositories.ProdutoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProdutoService {

    @Autowired
    private ProdutoRepository produtoRepository;
    public Produto salvar(Produto produto) {
        return produtoRepository.save(produto);
    }
}
