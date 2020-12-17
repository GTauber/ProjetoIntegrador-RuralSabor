package br.com.ruralsabor.ruralsabor.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name = "tb_categoria")
public class CategoriaModel {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;

	@NotBlank
	@Size(min = 3, max = 30)
	private String regiao;

	@NotBlank
	@Size(min = 5, max = 20)
	private String categoria;

	@NotBlank
	@Size(min = 5, max = 30)
	private String tipo_produtor;

	@OneToMany(mappedBy = "categoria", cascade = CascadeType.ALL)
	@JsonIgnoreProperties("categoria")
	private List<ProdutoModel> produto;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getregiao() {
		return regiao;
	}

	public void setregiao(String regiao) {
		this.regiao = regiao;
	}

	public String getcategoria() {
		return categoria;
	}

	public void setcategoria(String categoria) {
		this.categoria = categoria;
	}

	public String gettipo_produtor() {
		return tipo_produtor;
	}

	public void settipo_produtor(String tipo_produtor) {
		this.tipo_produtor = tipo_produtor;
	}

}
