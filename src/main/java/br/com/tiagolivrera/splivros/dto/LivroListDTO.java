package br.com.tiagolivrera.splivros.dto;

import br.com.tiagolivrera.splivros.entities.LivroList;

public class LivroListDTO {

	private Long id;
	private String nome;

	public LivroListDTO() {
		super();
	}

	public LivroListDTO(LivroList entity) {
		this.id = entity.getId();
		this.nome = entity.getNome();
	}

	public Long getId() {
		return id;
	}

	public String getNome() {
		return nome;
	}

}
