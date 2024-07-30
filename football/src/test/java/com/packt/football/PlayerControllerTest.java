package com.packt.football;


import com.packt.football.services.FootballService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.web.servlet.MockMvc;

@WebMvcTest(value = PlayerController.class)
public class PlayerControllerTest {
    @Autowired
    private MockMvc mvc;

    @MockBean
    private FootballService footballService;

    @Test
    public void testListPlayers() throws Exception {
    }
}
