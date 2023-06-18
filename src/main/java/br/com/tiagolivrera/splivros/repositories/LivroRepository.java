package br.com.tiagolivrera.splivros.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.tiagolivrera.splivros.entities.Livro;

public interface LivroRepository extends JpaRepository<Livro, Long>{

}
