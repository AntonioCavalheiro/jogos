package br.com.jpplacca.estoque.services;

import br.com.jpplacca.estoque.repositories.CategoriaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import br.com.jpplacca.estoque.model.Categoria;

@Service
public class CategoriaService {

    @Autowired
    private CategoriaRepository categoriaRepository;
    public Categoria salvar(Categoria categoria) {
          return categoriaRepository.save(categoria);
    }
}
