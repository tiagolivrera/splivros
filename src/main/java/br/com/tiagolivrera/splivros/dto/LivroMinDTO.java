package br.com.tiagolivrera.splivros.dto;

import br.com.tiagolivrera.splivros.entities.Livro;

public class LivroMinDTO {

	private Long id;
	private String titulo;
	private String autor;
	private Integer paginas;
	private String imgUrl;

	public LivroMinDTO() {
		super();
	}

	public LivroMinDTO(Livro entity) {
		super();
		this.id = entity.getId();
		this.titulo = entity.getTitulo();
		this.autor = entity.getAutor();
		this.paginas = entity.getPaginas();
		this.imgUrl = entity.getImgUrl();
	}

	public Long getId() {
		return id;
	}

	public String getTitulo() {
		return titulo;
	}

	public String getAutor() {
		return autor;
	}

	public Integer getPaginas() {
		return paginas;
	}

	public String getImgUrl() {
		return imgUrl;
	}

}
