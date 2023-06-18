package br.com.tiagolivrera.splivros.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.tiagolivrera.splivros.dto.LivroListDTO;
import br.com.tiagolivrera.splivros.dto.LivroMinDTO;
import br.com.tiagolivrera.splivros.services.LivroListService;
import br.com.tiagolivrera.splivros.services.LivroService;

@RestController
@RequestMapping(value = "/lists")
public class LivroListController {

	@Autowired
	private LivroListService livroListService;

	@Autowired
	private LivroService livroService;

	@GetMapping
	public List<LivroListDTO> findAll() {
		List<LivroListDTO> result = livroListService.findAll();
		return result;
	}

	@GetMapping(value = "/{listId}/livros")
	public List<LivroMinDTO> findByList(@PathVariable Long listId) {
		List<LivroMinDTO> result = livroService.findByList(listId);
		return result;
	}
}
