package br.com.springboot.chamada_teste_java.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AnagramaController {

    @GetMapping("/verificar-anagrama")
    public boolean verificarAnagrama(@RequestParam String palavra1, @RequestParam String palavra2) {
        return saoAnagramas(palavra1, palavra2);
    }

    boolean saoAnagramas(String palavra1, String palavra2) {
        // Verificar se as palavras são anagramas
        // Retorna TRUE se forem anagramas, caso contrário retorna FALSE
        palavra1 = palavra1.replaceAll("\\s", "").toLowerCase();
        palavra2 = palavra2.replaceAll("\\s", "").toLowerCase();

        // Verifica se as palavras tem o mesmo comprimento.
        if (palavra1.length() != palavra2.length()) {
            return false;
        }

        // Ordenar as letras das palavras.
        char[] chars1 = palavra1.toCharArray();
        char[] chars2 = palavra2.toCharArray();
        java.util.Arrays.sort(chars1);
        java.util.Arrays.sort(chars2);

        // Comparar as letras ordenadas.
        return java.util.Arrays.equals(chars1, chars2);
    }
}
