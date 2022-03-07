package br.com.tech4me.tech4books.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.tech4me.tech4books.model.Livro;
import br.com.tech4me.tech4books.repository.LivroRepository;

@Service
public class LivroServiceImpl implements LivroService{

    @Autowired
    private LivroRepository repositorio;

    @Override
    public List<Livro> obterTodosOsLivros() {
        return repositorio.findAll();
    }

    @Override
    public Optional<Livro> obterLivroPorId(String id) {
        return repositorio.findById(id);
    }

    @Override
    public Livro armazenaLivro(Livro livro) {

        return repositorio.save(livro);
    }

    @Override
    public void excluirLivroPorId(String id) {
        repositorio.deleteById(id);
        
    }

    @Override
    public Livro atualizarLivro(String id, Livro livro) {
        livro.setId(id);
        return repositorio.save(livro);
    }
    
}
