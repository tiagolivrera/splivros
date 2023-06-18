package br.com.tiagolivrera.splivros.projections;

public interface LivroMinProjection {

	Long getId();

	String getTitulo();

	String getAutor();

	Integer getPaginas();

	String getImgUrl();
}
