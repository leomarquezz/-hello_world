package com.generation.helloworld.controller;

import java.util.ArrayList;
import java.util.Arrays;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/helloworld")
public class helloworldcontroller {
	
	
	@GetMapping
	public String olamundo() {
		return "Hello world 71";
	}

@GetMapping("/bsm")
     public ArrayList<String> listaBSM(){
	
	   ArrayList<String> lista = new ArrayList<>(
               Arrays.asList("orientação ao futuro", "responsabilidade pessoal", "persistência", "mentalidade de crescimento")
       );

       return lista;
   }

@GetMapping("/objetivos")
  public ArrayList<String> listaObjetivos() {

    ArrayList<String> lista2 = new ArrayList<>(
            Arrays.asList("melhorar nos códigos", "codar sem ajuda do material", "sentir evolução"));

    return lista2;
}
		}
