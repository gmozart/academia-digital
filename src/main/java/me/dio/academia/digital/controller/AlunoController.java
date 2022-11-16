package me.dio.academia.digital.controller;

import me.dio.academia.digital.service.impl.AlunoServiceImpl;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/alunos")
public class AlunoController {

    private AlunoServiceImpl service;

}
