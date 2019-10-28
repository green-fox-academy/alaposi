package com.alaposi.bankofsimba.controllers;

import com.alaposi.bankofsimba.models.BankAccount;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
public class BankController {

  private List<BankAccount> bankOfSimba;

  public BankController() {
    bankOfSimba = new ArrayList<>();
    bankOfSimba.add(new BankAccount("Simba", 2000, "lion", true, true));
    bankOfSimba.add(new BankAccount("Nala", 1500, "lion"));
    bankOfSimba.add(new BankAccount( "Pumbaa", 1000, "warthog" ));
    bankOfSimba.add(new BankAccount("Timon", 800, "meerkat"));
    bankOfSimba.add(new BankAccount("Scar", 1500, "lion", false, false));
  }

  @GetMapping(value = "/show")
  public String indexPage(Model model) {
    model.addAttribute("accountList", bankOfSimba);
    return "account";
  }

  @GetMapping(value = "/show2")
  public String display(){
    return "text";
  }

}
