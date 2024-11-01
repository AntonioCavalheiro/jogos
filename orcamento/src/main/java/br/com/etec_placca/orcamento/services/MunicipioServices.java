package br.com.etec_placca.orcamento.services;

import br.com.etec_placca.orcamento.model.Municipio;
import br.com.etec_placca.orcamento.repositories.MunicipioRepositories;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MunicipioServices {

    @Autowired
    private MunicipioRepositories municipioRepositories;

    public Municipio salvar(Municipio municipio){ return municipioRepositories.save(municipio);}
}
