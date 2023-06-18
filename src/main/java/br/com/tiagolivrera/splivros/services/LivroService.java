package br.com.tiagolivrera.splivros.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.tiagolivrera.splivros.dto.LivroMinDTO;
import br.com.tiagolivrera.splivros.entities.Livro;
import br.com.tiagolivrera.splivros.repositories.LivroRepository;

@Service
public class LivroService {

	@Autowired
	private LivroRepository livroRepository;

	public List<LivroMinDTO> findAll() {
		List<Livro> result = livroRepository.findAll();
		return result.stream().map(x -> new LivroMinDTO(x)).toList();
	}

}
