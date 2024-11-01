package br.com.etec_placca.orcamento.controllers;

import br.com.etec_placca.orcamento.model.Municipio;
import br.com.etec_placca.orcamento.services.MunicipioServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/municipio")
public class MunicipioController {

    @Autowired
    private MunicipioServices municipioServices;

    public ResponseEntity<Municipio> criar(@RequestBody Municipio municipio){
        Municipio municipioSalvo = municipioServices.salvar(municipio);
        return ResponseEntity.status(HttpStatus.CREATED).body(municipioSalvo);
    }
}
