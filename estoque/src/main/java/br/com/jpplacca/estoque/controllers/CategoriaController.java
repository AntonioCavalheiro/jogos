package br.com.jpplacca.estoque.controllers;

import br.com.jpplacca.estoque.model.Categoria;
import br.com.jpplacca.estoque.services.CategoriaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
//para buscar
@RequestMapping("/categorias")
public class CategoriaController {

    @Autowired
    private CategoriaService categoriaService;
    public ResponseEntity<Categoria> criar(@RequestBody Categoria categoria){
            Categoria categoriaSalva = categoriaService.salvar(categoria);
            return ResponseEntity.status(HttpStatus.CREATED).body(categoriaSalva);
    }

}
