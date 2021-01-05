package br.com.ruralsabor.ruralsabor.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import br.com.ruralsabor.ruralsabor.model.Categoria;

@Repository
public interface CategoriaRepository extends JpaRepository<Categoria, Long>{
	
	@Query (value="select * from tb_categoria where Regiao = :regiao", nativeQuery=true)
	public List<Categoria> SearchByReg(@Param("regiao") String regiao);
	
		// public List<Categoria> findAllByRegContainingIgnoreCase (String regiao);
	}


