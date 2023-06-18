package br.com.tiagolivrera.splivros.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.tiagolivrera.splivros.dto.LivroDTO;
import br.com.tiagolivrera.splivros.dto.LivroMinDTO;
import br.com.tiagolivrera.splivros.services.LivroService;

@RestController
@RequestMapping(value = "/livros")
public class LivroController {

	@Autowired
	private LivroService livroService;

	@GetMapping
	public List<LivroMinDTO> findAll() {
		List<LivroMinDTO> result = livroService.findAll();
		return result;
	}

	@GetMapping(value = "/{id}")
	public LivroDTO findById(@PathVariable Long id) {
		LivroDTO result = livroService.findById(id);
		return result;
	}

}
