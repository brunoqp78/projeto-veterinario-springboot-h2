package org.iftm.gerenciadorveterinarios.repositories;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.iftm.gerenciadorveterinarios.entities.Veterinario;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

@DataJpaTest
public class VeterinarioRepositoryTest {

    @Autowired
    private VeterinarioRepository repositorio;

    @Test
    @DisplayName("Testa se o método GetById realmente retorna o veterinário correto.")
    void testaSeBuscaObjetoQuandoExisteId() {
        Integer idExistente = 1;
        String nomeEsperado = "Conceição Evaristo";
        String emailEsperado = "conceicao@gmail.com";

        Veterinario resultado = repositorio.getById(idExistente);
        assertNotNull(resultado);
        assertEquals(nomeEsperado, resultado.getNome());
        assertEquals(emailEsperado, resultado.getEmail());
    }
}
