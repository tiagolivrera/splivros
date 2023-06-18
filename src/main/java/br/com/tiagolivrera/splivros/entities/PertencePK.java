package br.com.tiagolivrera.splivros.entities;

import java.util.Objects;

import jakarta.persistence.Embeddable;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Embeddable
public class PertencePK {

	@ManyToOne
	@JoinColumn(name = "livro_id")
	private Livro livro;

	@ManyToOne
	@JoinColumn(name = "list_id")
	private LivroList livroList;

	public PertencePK() {
		super();
	}

	public PertencePK(Livro livro, LivroList livroList) {
		super();
		this.livro = livro;
		this.livroList = livroList;
	}

	public Livro getLivro() {
		return livro;
	}

	public void setLivro(Livro livro) {
		this.livro = livro;
	}

	public LivroList getLivroList() {
		return livroList;
	}

	public void setLivroList(LivroList livroList) {
		this.livroList = livroList;
	}

	@Override
	public int hashCode() {
		return Objects.hash(livro, livroList);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		PertencePK other = (PertencePK) obj;
		return Objects.equals(livro, other.livro) && Objects.equals(livroList, other.livroList);
	}

}
