package br.com.ruralsabor.ruralsabor.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.ruralsabor.ruralsabor.model.Produto;

@Repository
public interface ProdutoRepository extends JpaRepository<Produto, Long> {
	
	// public List<Produto> findAllById(Long id);

	public List<Produto> findAllByNomeContainingIgnoreCase(String nome);
}
