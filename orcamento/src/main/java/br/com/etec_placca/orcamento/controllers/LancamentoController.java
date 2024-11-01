package br.com.etec_placca.orcamento.controllers;

import br.com.etec_placca.orcamento.model.Lancamento;
import br.com.etec_placca.orcamento.services.LancamentoServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/lancamento")
public class LancamentoController {

    @Autowired
    private LancamentoServices lancamentoServices;

    public ResponseEntity<Lancamento> criar(@RequestBody Lancamento lancamento){
        Lancamento lancamentosalvo = lancamentoServices.salvar(lancamento);
        return ResponseEntity.status(HttpStatus.CREATED).body(lancamentosalvo);
    }
}
