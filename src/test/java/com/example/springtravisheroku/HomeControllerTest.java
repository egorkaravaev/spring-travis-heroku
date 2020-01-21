package com.example.springtravisheroku;

import org.junit.jupiter.api.Test;

import static org.hamcrest.Matchers.containsString;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;


public class HomeControllerTest extends SpringTravisHerokuApplicationTests {

    @Test
    public void check_saving_person() throws Exception {
        mockMvc.perform(post("/save?name=Egor")).andExpect(status().isOk());
    }

    @Test
    public void check_getting_all_persons() throws Exception {
        mockMvc.perform(get("/getAll")).andExpect(content().string(containsString("Egor")));
    }
}
