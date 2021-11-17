package com.bankingapplicationmain.bankingapplicationmain.controllers;

import com.bankingapplicationmain.bankingapplicationmain.models.Deposits;
import com.bankingapplicationmain.bankingapplicationmain.services.DepositsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/accounts")
public class DepositsController {

    @Autowired
    private DepositsService depositsService;


    @RequestMapping("/accounts/{accountId}/deposits")
    public ResponseEntity<?> getDeposits(@PathVariable Long accountId) {
        return depositsService.getDeposits(accountId);
    }

    @PostMapping("/accounts/{accountId}/deposits")
    public void registerDeposits(@RequestBody Deposits deposits){
        depositsService.addDeposit(deposits);
    }

    @PutMapping("/deposits/{depositId}")
    public void updateDeposits(@RequestBody Deposits deposits, @PathVariable Long depositId){
        depositsService.editDeposit(depositId,deposits);
    }

    @DeleteMapping("/deposits/{depositId}")
    public void deleteDeposits(@PathVariable Long depositId){
        depositsService.deleteDeposit(depositId);
    }



}
