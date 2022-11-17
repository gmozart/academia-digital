package me.dio.academia.digital.service;

import me.dio.academia.digital.entity.Aluno;
import me.dio.academia.digital.entity.AvaliacaoFisica;
import me.dio.academia.digital.entity.form.AlunoForm;
import me.dio.academia.digital.entity.form.AlunoUpdateForm;

import java.util.List;

public interface IAlunoService {

   Aluno create(AlunoForm form);

   Long get(Long id);

   List<Aluno> getAll(String dataDeNascimento);

   Aluno update(Long id, AlunoUpdateForm formUpdate);

   void delete(Long id);

    List<AvaliacaoFisica> getAllAvaliacaoFisicaId(Long id);

}
