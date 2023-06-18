package br.com.tiagolivrera.splivros.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import br.com.tiagolivrera.splivros.entities.Livro;
import br.com.tiagolivrera.splivros.projections.LivroMinProjection;

public interface LivroRepository extends JpaRepository<Livro, Long> {

	@Query(nativeQuery = true, value = """
			SELECT TB_LIVRO.id, TB_LIVRO.titulo, TB_LIVRO.autor, TB_LIVRO.paginas, TB_LIVRO.img_url AS imgUrl, TB_PERTENCE.posicao
			FROM TB_LIVRO
			INNER JOIN TB_PERTENCE ON TB_LIVRO.id = TB_PERTENCE.livro_id
			WHERE TB_PERTENCE.list_id = :listId
			ORDER BY TB_PERTENCE.posicao
			""")
	List<LivroMinProjection> searchByList(Long listId);

}
