package br.com.tiagolivrera.splivros.dto;

import br.com.tiagolivrera.splivros.entities.Livro;
import br.com.tiagolivrera.splivros.projections.LivroMinProjection;

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

	public LivroMinDTO(LivroMinProjection projection) {
		super();
		this.id = projection.getId();
		this.titulo = projection.getTitulo();
		this.autor = projection.getAutor();
		this.paginas = projection.getPaginas();
		this.imgUrl = projection.getImgUrl();
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
