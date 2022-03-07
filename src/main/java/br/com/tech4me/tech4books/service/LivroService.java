package br.com.tech4me.tech4books.service;

import java.util.List;
import java.util.Optional;

import br.com.tech4me.tech4books.model.Livro;

public interface LivroService {
    List<Livro> obterTodosOsLivros();

    Optional<Livro> obterLivroPorId(String id);

    Livro armazenaLivro(Livro livro);

    void excluirLivroPorId(String id);

    Livro atualizarLivro(String id, Livro livro);

}
