package com.gfa.bankofsimba.controllers;

import com.gfa.bankofsimba.model.BankAccount;
import com.gfa.bankofsimba.service.BankAccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class BankAccountController {

  private BankAccountService bankAccountService;

  @Autowired
  public void setBankAccountService(BankAccountService bankAccountService) {
    this.bankAccountService = bankAccountService;
  }

  @GetMapping("/show")
  public String showSimbasBankAccount(Model model) {
    BankAccount simba = new BankAccount("Simba", 2000, "lion", false, true);
    model.addAttribute("simba", simba);
    return "simbasaccount";
  }

  @GetMapping("/text-utext")
  public String displayString(Model model) {
    String message = "This is an <em>HTML</em> text. <b>Enjoy yourself!</b>";
    model.addAttribute("message", message);
    return "simbasaccount";
  }

  @GetMapping("/accounts")
  public String showaccounts(Model model) {
    model.addAttribute("accounts", bankAccountService.getBankAccountList());
    return "bankaccounts";
  }

  @PostMapping("/raise")
  public String raiseBalance(String accountName, Model model) {
      bankAccountService.raiseBalance(accountName);
    return "redirect:/accounts";
  }

  @GetMapping("/add-bank-account")
  public String addNewAccount(){
    return "addnewbankaccount";
  }


  @PostMapping(value = ("/add"))
  public String addNewAccount(@ModelAttribute BankAccount newAccount, Model model) {
    bankAccountService.addNewAccount(newAccount);
    model.addAttribute("accounts", bankAccountService);
    return "redirect:/accounts";
  }
}
