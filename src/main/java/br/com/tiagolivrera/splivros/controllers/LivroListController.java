package br.com.tiagolivrera.splivros.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.tiagolivrera.splivros.dto.LivroListDTO;
import br.com.tiagolivrera.splivros.services.LivroListService;

@RestController
@RequestMapping(value = "/lists")
public class LivroListController {

	@Autowired
	private LivroListService livroListService;

	@GetMapping
	public List<LivroListDTO> findAll() {
		List<LivroListDTO> result = livroListService.findAll();
		return result;
	}
}
