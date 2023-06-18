package br.com.tiagolivrera.splivros.entities;

import java.util.Objects;

import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "TB_PERTENCE")
public class Pertence {

	@EmbeddedId
	private PertencePK id = new PertencePK();
	private Integer posicao;

	public Pertence() {
	}

	public Pertence(Livro livro, LivroList livroList, Integer posicao) {
		this.id.setLivro(livro);
		this.id.setLivroList(livroList);
		this.posicao = posicao;
	}

	public PertencePK getId() {
		return id;
	}

	public void setId(PertencePK id) {
		this.id = id;
	}

	public Integer getPosicao() {
		return posicao;
	}

	public void setPosicao(Integer posicao) {
		this.posicao = posicao;
	}

	@Override
	public int hashCode() {
		return Objects.hash(id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Pertence other = (Pertence) obj;
		return Objects.equals(id, other.id);
	}

}
