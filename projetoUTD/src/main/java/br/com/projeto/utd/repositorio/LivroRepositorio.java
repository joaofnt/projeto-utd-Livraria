package br.com.projeto.utd.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.projeto.utd.entidades.Livro;

public interface LivroRepositorio extends JpaRepository<Livro, Long>{

}
