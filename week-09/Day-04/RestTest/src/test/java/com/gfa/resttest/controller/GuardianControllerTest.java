package com.gfa.resttest.controller;

import static org.hamcrest.CoreMatchers.is;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;

@SpringBootTest
@AutoConfigureMockMvc
class GuardianControllerTest {

  @Autowired
  private MockMvc mockMvc;

  @Test
  public void givenInputParameter_whenTranslateToGroot_ReturnsCorrectFieldsAndValues() throws Exception {
    mockMvc.perform(get("/groot?message=input"))
        .andExpect(status().isOk())
        .andExpect(content().contentType(MediaType.APPLICATION_JSON))
        .andExpect(jsonPath("$.received", is("input")))
        .andExpect(jsonPath("$.translated", is("I am Groot!")));
  }

  @Test
  public void givenNullInputMessage_WhentranslateToGroot_ReturnsError() throws Exception {
    mockMvc.perform(get("/groot"))
        .andExpect(status().isBadRequest())
        .andExpect(content().contentType(MediaType.APPLICATION_JSON))
        .andExpect(jsonPath("$.error", is("I am Groooot!")));
  }

  @Test
  public void givenTimeAndDistance_WhenCalculateYondusArrowsSpeed_ReturnsCorrectSpeed() throws Exception {
    mockMvc.perform(get("/yondu?distance=100.0&time=10"))
        .andExpect(status().isOk())
        .andExpect(content().contentType(MediaType.APPLICATION_JSON))
        .andExpect(jsonPath("$.distance", is(100.0)))
        .andExpect(jsonPath("$.time", is(10.0)))
        .andExpect(jsonPath("$.speed", is(10.0)));
  }

  @Test
  public void givenParameterIsNotCorrect_WhenCalculateYondusArrowsSpeed_ReturnsError() throws Exception {
    mockMvc.perform(get("/yondu?time=100.0"))
        .andExpect(status().isNotFound());
  }

  @Test
  public void givenParameterIsCorrectButTimeisZero_WhenCalculateYondusArrowsSpeed_ReturnsError() throws Exception {
    mockMvc.perform(get("/yondu?distance=100.0&time=0"))
        .andExpect(status().isBadRequest())
        .andExpect(content().contentType(MediaType.APPLICATION_JSON))
        .andExpect(jsonPath("$.error", is("cant divide with zero")));
  }
}
