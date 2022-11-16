package me.dio.academia.digital.service.impl;

import me.dio.academia.digital.entity.Aluno;
import me.dio.academia.digital.entity.AvaliacaoFisica;
import me.dio.academia.digital.repository.AlunoRepository;
import me.dio.academia.digital.service.IAlunoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AlunoServiceImpl implements IAlunoService {

    @Autowired
    private AlunoRepository repository;

    @Override
    public Aluno create(Aluno aluno) {
        repository.save(aluno);
        return aluno;
    }

    @Override
    public Long get(Long id) {
        repository.getById(id);

        return id;
    }

    @Override
    public List<Aluno> getAll() {
        return null;
    }

    @Override
    public Aluno update(Long id, Aluno aluno) {
        return null;
    }

    @Override
    public void delete(Long id) {

    }

    @Override
    public List<AvaliacaoFisica> getAllAvaliacaoFisicaId(Long id) {
        return null;
    }
}
