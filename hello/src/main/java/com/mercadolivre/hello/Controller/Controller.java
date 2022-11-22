package com.mercadolivre.hello.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")

public class Controller {
    @GetMapping("/")
    public String hello() {
        return "ola mundo";
    }
    @GetMapping("/02")
    public String menssagem2() {
        return "<h1>     ORIENTAÇÃO AO FUTURO\n" +
                "RESPONSABILIDADE PESSOAL\n" +
                "MENTALIDADE DE CRESCIMENTO\n" +
                "PERSISTENCIA\n" +
                "TRABALHO EM EQUIPE\n" +
                "ATENÇÃO AOS DETALHES\n" +
                "PROATIVIDADE\n" +
                "COMUNICACAO ,  <h1><p> ";
    }
    @GetMapping("/02")
    public String menssagem03() {
        return "<h3> aprender mais do Spring , familiarizar mais com a linguagem ,<h3>";
    }
}
