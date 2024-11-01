package br.com.etec_placca.orcamento.services;

import br.com.etec_placca.orcamento.model.Lancamento;
import br.com.etec_placca.orcamento.repositories.LancamentoRepositories;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LancamentoServices {

    @Autowired
    private LancamentoRepositories lancamentoRepositories;

    public Lancamento salvar(Lancamento lancamento) { return lancamentoRepositories.save(lancamento);}
}
