package br.com.etec_placca.orcamento.services;

import br.com.etec_placca.orcamento.model.Cliente;
import br.com.etec_placca.orcamento.repositories.ClienteRepositories;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ClienteServices {

    @Autowired
    private ClienteRepositories clienteRepositories;

    public Cliente salvar(Cliente cliente) { return clienteRepositories.save(cliente);}
}
