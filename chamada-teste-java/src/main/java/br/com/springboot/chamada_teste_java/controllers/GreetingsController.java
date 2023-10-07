package br.com.springboot.chamada_teste_java.controllers;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingsController {

    @GetMapping("/verificar-anagrama")
    @ResponseStatus(HttpStatus.OK)
    public boolean verificarAnagrama(@RequestParam String palavra1, @RequestParam String palavra2) {
        return saoAnagramas(palavra1, palavra2);
    }

    boolean saoAnagramas(String palavra1, String palavra2) {
        palavra1 = palavra1.replaceAll("\\s", "").toLowerCase();
        palavra2 = palavra2.replaceAll("\\s", "").toLowerCase();

        if (palavra1.length() != palavra2.length()) {
            return false;
        }

        char[] chars1 = palavra1.toCharArray();
        char[] chars2 = palavra2.toCharArray();
        java.util.Arrays.sort(chars1);
        java.util.Arrays.sort(chars2);

        return java.util.Arrays.equals(chars1, chars2);
    }
}
