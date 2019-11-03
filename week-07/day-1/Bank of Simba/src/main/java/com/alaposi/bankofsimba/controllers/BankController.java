package com.alaposi.bankofsimba.controllers;

import com.alaposi.bankofsimba.models.BankAccount;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.jws.WebParam;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Controller
public class BankController {

  private List<BankAccount> bankOfSimba;

  public BankController() {
    bankOfSimba = new ArrayList<>();
    bankOfSimba.add(new BankAccount("Simba", 2000, "lion", true, true));
    bankOfSimba.add(new BankAccount("Nala", 1500, "lion"));
    bankOfSimba.add(new BankAccount("Pumbaa", 1000, "warthog"));
    bankOfSimba.add(new BankAccount("Timon", 800, "meerkat"));
    bankOfSimba.add(new BankAccount("Scar", 1500, "lion", false, false));
  }

  @GetMapping(value = "/show")
  public String indexPage(Model model) {
    model.addAttribute("accountList", bankOfSimba);
    return "account";
  }

  @GetMapping(value = "/show2")
  public String display(Model model) {
    model.addAttribute("text", "This is an <em>HTML</em> text. <b>Enjoy yourself!</b>");
    return "text";
  }

  @PostMapping(value = "/raise")
  public String raiseBalance(@RequestParam String nameOfOwner) {
    BankAccount accountToRaise = bankOfSimba.stream()
        .filter(o -> o.getName().equals(nameOfOwner))
        .collect(Collectors.toList()).get(0);
    if (accountToRaise.getisKing()) {
      accountToRaise.setBalance(accountToRaise.getBalance() + 100);
    } else {
      accountToRaise.setBalance(accountToRaise.getBalance() + 10);
    }
    return "redirect:/show";
  }

  @PostMapping(value = "/add")
  public String addAccount(@RequestParam String name, @RequestParam boolean status, @RequestParam double balance, @RequestParam String animaltype, @RequestParam boolean goodOrBad, Model model) {
    //bankOfSimba.add(bankOfSimba.size()+1, )
    bankOfSimba.add(new BankAccount(name, balance, animaltype, status, goodOrBad));
    return "redirect:/show";
  }

}
