package br.com.tiagolivrera.splivros.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import br.com.tiagolivrera.splivros.dto.LivroDTO;
import br.com.tiagolivrera.splivros.dto.LivroMinDTO;
import br.com.tiagolivrera.splivros.entities.Livro;
import br.com.tiagolivrera.splivros.repositories.LivroRepository;
import br.com.tiagolivrera.splivros.services.exceptions.ObjectNotFoundException;

@Service
public class LivroService {

	@Autowired
	private LivroRepository livroRepository;

	@Transactional(readOnly = true)
	public List<LivroMinDTO> findAll() {
		List<Livro> result = livroRepository.findAll();
		return result.stream().map(x -> new LivroMinDTO(x)).toList();
	}

	@Transactional(readOnly = true)
	public LivroDTO findById(Long id) {
		Optional<Livro> result = livroRepository.findById(id);
		if (result.isEmpty()) {
			throw new ObjectNotFoundException("Objeto não encontrado! Id: " + id + ", Tipo: " + Livro.class.getName());
		} else {
			return new LivroDTO(result.get());
		}
	}

}
