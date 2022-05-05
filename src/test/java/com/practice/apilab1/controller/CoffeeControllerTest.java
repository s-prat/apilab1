package com.practice.apilab1.controller;

import com.practice.apilab1.model.Coffee;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.ResultMatcher;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

@AutoConfigureMockMvc
@SpringBootTest
public class CoffeeControllerTest {

    @Autowired
    private MockMvc mockMvcController;

    @Test
    public void testGetCoffeeLover() throws Exception {
        String expectedContent = "I like Coffee!";

        this.mockMvcController.perform(
                        MockMvcRequestBuilders.get("/coffeelover"))
                .andExpect(MockMvcResultMatchers.status().isOk())
                .andExpect(MockMvcResultMatchers.content().string(expectedContent));
    }

    @Test
    public void testGetCoffeeWithDefaultParam() throws Exception {
        String expectedContent = "Black";

        this.mockMvcController.perform(
                        MockMvcRequestBuilders.get("/coffee/{id}", "1"))
                .andExpect(MockMvcResultMatchers.status().isOk())
                .andExpect(MockMvcResultMatchers.jsonPath("$.name").value(expectedContent));
    }

    @Test
    public void testGetCoffeeWithInputParam() throws Exception {
        String expectedContent = "white";

        this.mockMvcController.perform(
                        MockMvcRequestBuilders.get("/coffee/{id}", "1").param("name", "white"))
                .andExpect(MockMvcResultMatchers.status().isOk())
                .andExpect(MockMvcResultMatchers.jsonPath("$.name").value(expectedContent));
    }


}
