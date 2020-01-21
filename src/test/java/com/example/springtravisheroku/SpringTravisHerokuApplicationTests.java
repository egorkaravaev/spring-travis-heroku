package com.example.springtravisheroku;

import com.example.springtravisheroku.controller.HomeController;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;

import static org.assertj.core.api.Assertions.assertThat;

@AutoConfigureMockMvc
@SpringBootTest
class SpringTravisHerokuApplicationTests {

    @Autowired
    public HomeController homeController;

    @Autowired
    public MockMvc mockMvc;

    @Test
    void contextLoads() {
        assertThat(homeController).isNotNull();
    }

}
