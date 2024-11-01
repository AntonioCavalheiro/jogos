package br.com.etec_placca.orcamento.controllers;

import br.com.etec_placca.orcamento.model.Cliente;
import br.com.etec_placca.orcamento.services.ClienteServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/cliente")
public class ClienteController {

    @Autowired
    private ClienteServices clienteServices;

    public ResponseEntity<Cliente> criar(@RequestBody Cliente cliente){
        Cliente clientesalvo = clienteServices.salvar(cliente);
        return ResponseEntity.status(HttpStatus.CREATED).body(clientesalvo);
    }
}
