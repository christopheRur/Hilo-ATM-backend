package com.codelab.HiloATMApp.Controller;

import com.codelab.HiloATMApp.services.HiloServiceImpl;
import com.codelab.HiloATMApp.services.HiloUserServiceImpl;
import com.google.gson.JsonObject;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
public class HiloController {
    private final HiloUserServiceImpl hiloUserService;
    private final HiloServiceImpl hiloService;

    public HiloController(HiloUserServiceImpl hiloUserServ, HiloServiceImpl hiloServ) {

        this.hiloUserService = hiloUserServ;
        this.hiloService = hiloServ;
    }

    @PostMapping("/deposit")
    public ResponseEntity<?> depositFunds(@RequestBody JsonObject bodyRequest){

        try{

            if (bodyRequest.toString().isEmpty()) {

                return ResponseEntity.badRequest().body("Unable to deposit, add deposit.");

            } else {

                return new ResponseEntity<>(hiloService.computeDeposited(bodyRequest), HttpStatus.OK);
            }


        }catch(Exception e){

            log.error("==>" + e.getLocalizedMessage());

            return ResponseEntity.badRequest().body("Error occurred, unable to deposit funds...");
        }
    }

    @PostMapping("/withdraw")
    public ResponseEntity<?> withdrawFunds(@RequestBody JsonObject bodyRequest){

        try{

            if (bodyRequest.toString().isEmpty()) {

                return ResponseEntity.badRequest().body("Unable to deposit, add deposit.");

            } else {

                return new ResponseEntity<>(hiloService.computeDeposited(bodyRequest), HttpStatus.OK);
            }


        }catch(Exception e){

            log.error("==>" + e.getLocalizedMessage());

            return ResponseEntity.badRequest().body("Error occurred, unable to deposit funds...");
        }

    }
    @GetMapping("/checkBalance")
    public ResponseEntity<?> getCredits(@RequestBody JsonObject bodyRequest) {
        try {
            if (hiloService == null) {

                return ResponseEntity.badRequest().body("No balance found!");

            } else {


                return new ResponseEntity<>(hiloService.getTotalSavings(bodyRequest), HttpStatus.OK);
            }

        } catch (Exception e) {

            log.info("==>" + e.getLocalizedMessage());

            return ResponseEntity.badRequest().body("Error occurred, unable to FETCH data.");
        }
    }



}
