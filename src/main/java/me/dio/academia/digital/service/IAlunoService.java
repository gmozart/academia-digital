package me.dio.academia.digital.service;


import me.dio.academia.digital.entity.Aluno;
import me.dio.academia.digital.entity.AvaliacaoFisica;

import java.util.List;

public interface IAlunoService {

   Aluno create(Aluno aluno);

   Aluno get(Long id);

   List<Aluno> getAll(String dataDeNascimento);

   Aluno update(Long id, Aluno aluno);

   void delete(Long id);

    List<AvaliacaoFisica> getAllAvaliacaoFisicaId(Long id);

}
