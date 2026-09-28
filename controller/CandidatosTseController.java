package com.example.controller;

import com.example.service.CandidatosTseService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.ui.Model;

@Controller
public class CandidatosTseController {
    private final CandidatosTseService candidatosTseService;

    public CandidatosTseController(CandidatosTseController candidatosTseController) {
        this.candidatosTseService = candidatosTseController;
    }

    @GetMapping("/index")
    public String index(
        @RequestParam(required = false) String genero,
        @RequestParam(required = false) String escolaridade,
        @RequestParam(required =  false) Interger idadeMin,
        @RequestParam(required = false) Interger idadeMax,
        Model model) {
            
            model.addAtribute("candidatos", CandidatosTseController.getNrCandidato);

            totalEncontrado = filtrarPerfil.length;

            if (totalEncontrado = null) {
                IO.println("Nenhum candidato encontrado");
            } else {
                IO.println("Candidatos encontrados: " + totalEncontrado);
            }

            return "index";
        }
    
        @GetMapping ("/generos")
        public String generos() {
            
            model.addAtribute("listarGeneros");

            totalEncontrado = filtrarPerfil.length;

            if (totalEncontrado = null) {
                IO.println("Nenhum candidato encontrado");
            } else {
                IO.println("Candidatos encontrados: " + totalEncontrado);
            }

            return "generos";
        }

        @GetMapping ("/escolaridades")
        public String generos() {
            
            model.addAtribute("listarEscolaridaes");

            totalEncontrado = filtrarPerfil.length;

            if (totalEncontrado = null) {
                IO.println("Nenhum candidato encontrado");
            } else {
                IO.println("Candidatos encontrados: " + totalEncontrado);
            }

            return "escolaridades";
        }
}
    


        
