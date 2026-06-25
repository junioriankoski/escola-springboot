package com.example.escola.livro;

import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface LivroRepository extends JpaRepository<Livro, Long>{
    List<Livro> findAllByOrderByIdAsc();
}
