package br.com.confidencecambio.javabasico.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/imc")
public class ImcController {
    @GetMapping
    public String teste()
    {return "Test";}

}
