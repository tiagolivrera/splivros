package br.com.tiagolivrera.splivros.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import br.com.tiagolivrera.splivros.dto.LivroListDTO;
import br.com.tiagolivrera.splivros.entities.LivroList;
import br.com.tiagolivrera.splivros.repositories.LivroListRepository;

@Service
public class LivroListService {

	@Autowired
	private LivroListRepository livroListRepository;

	@Transactional(readOnly = true)
	public List<LivroListDTO> findAll() {
		List<LivroList> result = livroListRepository.findAll();
		return result.stream().map(x -> new LivroListDTO(x)).toList();
	}

}
