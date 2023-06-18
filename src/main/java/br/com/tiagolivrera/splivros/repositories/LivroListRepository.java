package br.com.tiagolivrera.splivros.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.tiagolivrera.splivros.entities.LivroList;

public interface LivroListRepository extends JpaRepository<LivroList, Long> {

}
