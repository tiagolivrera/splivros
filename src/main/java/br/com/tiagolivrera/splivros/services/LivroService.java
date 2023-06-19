package br.com.tiagolivrera.splivros.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.PathVariable;

import br.com.tiagolivrera.splivros.dto.LivroDTO;
import br.com.tiagolivrera.splivros.dto.LivroMinDTO;
import br.com.tiagolivrera.splivros.entities.Livro;
import br.com.tiagolivrera.splivros.projections.LivroMinProjection;
import br.com.tiagolivrera.splivros.repositories.LivroRepository;
import br.com.tiagolivrera.splivros.services.exceptions.ObjectNotFoundException;

@Service
public class LivroService {

	@Autowired
	private LivroRepository livroRepository;

	@Transactional(readOnly = true)
	public List<LivroMinDTO> findAll() {
		List<Livro> result = livroRepository.findAll();
		return result.stream().map(LivroMinDTO::new).toList();
	}

	@Transactional(readOnly = true)
	public LivroDTO findById(@PathVariable Long listId) {
		Livro result = livroRepository.findById(listId).get();
		return new LivroDTO(result);
	}

	@Transactional(readOnly = true)
	public List<LivroMinDTO> findByList(@PathVariable Long listId) {
		List<LivroMinProjection> result = livroRepository.searchByList(listId);
		if (result.isEmpty()) {
			throw new ObjectNotFoundException(
					"Objeto não encontrado! Id: " + listId + ", Tipo: " + Livro.class.getName());
		} else {
			return result.stream().map(x -> new LivroMinDTO(x)).toList();
		}
	}

}
