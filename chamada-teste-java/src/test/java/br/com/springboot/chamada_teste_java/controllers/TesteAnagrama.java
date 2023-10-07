package br.com.springboot.chamada_teste_java.controllers;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest
@AutoConfigureMockMvc
public class TesteAnagrama {

    @Autowired
    private AnagramaController controller;

    @Test
    public void testeAnagramaSucesso1() {
        // Teste sucesso 1 (anagramas)
        Assert.assertTrue(controller.saoAnagramas("Amor", "Roma"));
    }

    

	@Test
	public void testeAnagramaSucesso2() {
		// Teste sucesso 2 (anagramas)
		Assert.assertTrue(controller.saoAnagramas("Pedra", "Padre"));
	}

	@Test
	public void testeAnagramaFalha1() {
		// Teste falha 1 (não anagramas)
		Assert.assertFalse(controller.saoAnagramas("34111112325", "56235"));
	}

	@Test
	public void testeAnagramaFalha2() {
		// Teste falha 2 (não anagramas)
		Assert.assertFalse(controller.saoAnagramas("72111167184", "34525"));
	}
}

