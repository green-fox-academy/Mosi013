package com.gfa.bankofsimba.service;

import com.gfa.bankofsimba.model.BankAccount;
import java.util.Arrays;
import java.util.List;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.ModelAttribute;

@Service
public class BankAccountService {

  private List<BankAccount> bankAccountList;

  public BankAccountService() {
    this.bankAccountList = addBankAccount();
  }

  public List<BankAccount> addBankAccount() {
    return Arrays.asList(
        new BankAccount("Zordon", 500, "lion", false, false),
        new BankAccount("Pumba", 1000, "warthog", false, true),
        new BankAccount("Banzai", 200, "hyena", false, false),
        new BankAccount("Mufasa", 2200, "lion", true, true),
        new BankAccount("Timon", 1200, "suricate", false, true)
        );
  }

  public List<BankAccount> getBankAccountList(){
    return bankAccountList;
  }

  public void raiseBalance(String accountName){
    for (BankAccount account : bankAccountList) {
      if (account.getName().equals(accountName)) {
        int variable = account.getBalance();
        if (account.getIsKing()) {
          variable += 100;
        } else {
          variable += 10;
        }
        account.setBalance(variable);
      }
    }
  }

  public void addNewAccount(BankAccount newAccount) {
  }
}
