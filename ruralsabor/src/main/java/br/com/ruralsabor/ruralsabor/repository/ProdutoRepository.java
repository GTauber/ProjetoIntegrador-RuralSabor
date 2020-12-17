package br.com.ruralsabor.ruralsabor.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.ruralsabor.ruralsabor.model.ProdutoModel;

@Repository
public interface ProdutoRepository extends JpaRepository<ProdutoModel, Long> {
	
	// public List<ProdutoModel> findAllById(Long id);

	public List<ProdutoModel> findAllByNomeContainingIgnoreCase(String nome);
}
