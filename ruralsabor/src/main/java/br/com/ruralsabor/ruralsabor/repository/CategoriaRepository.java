package br.com.ruralsabor.ruralsabor.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import br.com.ruralsabor.ruralsabor.model.CategoriaModel;

@Repository
public interface CategoriaRepository extends JpaRepository<CategoriaModel, Long>{
	
	@Query (value="select * from tb_categoria where Regiao = :regiao", nativeQuery=true)
	public List<CategoriaModel> SearchByReg(@Param("regiao") String regiao);
	
		// public List<CategoriaModel> findAllByRegContainingIgnoreCase (String regiao);
	}


