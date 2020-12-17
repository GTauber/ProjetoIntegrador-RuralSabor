package br.com.ruralsabor.ruralsabor.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.ruralsabor.ruralsabor.model.CategoriaModel;
import br.com.ruralsabor.ruralsabor.repository.CategoriaRepository;

@RestController
@RequestMapping("/cat")
@CrossOrigin(value = "*", allowedHeaders = "*")
public class CategoriaController {

	@Autowired
	private CategoriaRepository Repository;

	@GetMapping
	public ResponseEntity<List<CategoriaModel>> getAll() {
		return ResponseEntity.ok(Repository.findAll());
	}

	@GetMapping("/{id}")
	public ResponseEntity<CategoriaModel> getById(@PathVariable long id) {
		return Repository.findById(id).map(Ans -> ResponseEntity.ok(Ans)).orElse(ResponseEntity.badRequest().build());

	}

	@GetMapping("/regiao/{regiao}")
	public ResponseEntity<List<CategoriaModel>> SearchByReg(@PathVariable String regiao) {
		return ResponseEntity.ok(Repository.SearchByReg(regiao));
	}

	@PostMapping
	public ResponseEntity<CategoriaModel> post(@RequestBody CategoriaModel post) {
		return ResponseEntity.status(HttpStatus.CREATED).body(Repository.save(post));
	}

	@PutMapping
	public ResponseEntity<CategoriaModel> put(@RequestBody CategoriaModel post) {
		return ResponseEntity.status(HttpStatus.CREATED).body(Repository.save(post));
	}

	@DeleteMapping("/{id}")
	public void delete(@PathVariable long id) {
		Repository.deleteById(id);
	}

	/*
	 * @GetMapping("/regiao/{regiao}") public ResponseEntity<List<CategoriaModel>>
	 * SearchByReg(@PathVariable String regiao) { return
	 * ResponseEntity.ok(Repository.findAllByRegContainingIgnoreCase(regiao)); }
	 */

}
