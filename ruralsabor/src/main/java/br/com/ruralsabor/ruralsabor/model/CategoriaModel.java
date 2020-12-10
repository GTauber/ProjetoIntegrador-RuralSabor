package br.com.ruralsabor.ruralsabor.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

@Entity
@Table(name = "tb_Categoria")
public class CategoriaModel {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	@NotBlank
	@Size(min = 3, max = 30)
	private String Regiao;
	
	@NotBlank
	@Size(min = 5, max = 20)
	private String Categoria;
	
	@NotBlank
	@Size(min = 5, max = 30)
	private String Tipo_Produtor;
	

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getRegiao() {
		return Regiao;
	}

	public void setRegiao(String regiao) {
		Regiao = regiao;
	}

	public String getCategoria() {
		return Categoria;
	}

	public void setCategoria(String categoria) {
		Categoria = categoria;
	}

	public String getTipo_Produtor() {
		return Tipo_Produtor;
	}

	public void setTipo_Produtor(String tipo_Produtor) {
		Tipo_Produtor = tipo_Produtor;
	}
	
	
}
