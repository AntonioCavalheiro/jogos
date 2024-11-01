package br.com.etec_placca.orcamento.repositories;

import br.com.etec_placca.orcamento.model.Lancamento;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LancamentoRepositories extends JpaRepository<Lancamento, Integer> {
}
