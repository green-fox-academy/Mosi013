package com.greenfoxacademy.springstart.controllers;
import java.util.Random;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HelloAllOverTheWordController {

  String[] hellos = {"Mirëdita", "Ahalan", "Parev", "Zdravei", "Nei Ho", "Dobrý den", "Ahoj", "Goddag",
      "Goede dag, Hallo", "Hello", "Saluton", "Hei", "Bonjour", "Guten Tag", "Gia'sou", "Aloha",
      "Shalom", "Namaste", "Namaste", "Jó napot", "Halló", "Helló", "Góðan daginn", "Halo", "Aksunai",
      "Qanuipit", "Dia dhuit", "Salve", "Ciao", "Kon-nichiwa", "An-nyong Ha-se-yo", "Salvëte", "Ni hao",
      "Dzien' dobry", "Olá", "Bunã ziua", "Zdravstvuyte", "Hola", "Jambo", "Hujambo", "Hej", "Sa-wat-dee",
      "Merhaba", "Selam", "Vitayu", "Xin chào", "Hylo", "Sut Mae", "Sholem Aleychem", "Sawubona"};

  @RequestMapping(value = "/web/greet")
  public String greetInRandomLanguage(Model model,
                                      @RequestParam(defaultValue = "Márk", required = false) String name,
                                      @RequestParam(defaultValue = "100,100,200", required = false) String rgb) {

    Random random = new Random();
    int randomHello = random.nextInt(hellos.length);
    int randomNumber = random.nextInt(200);

    model.addAttribute("hello", hellos[randomHello]);
    model.addAttribute("name", name);
    model.addAttribute("rgb", rgb);
    model.addAttribute("fontSize", randomNumber);
    return "greetAll";
  }
}