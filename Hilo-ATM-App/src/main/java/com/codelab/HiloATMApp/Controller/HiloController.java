package com.codelab.HiloATMApp.Controller;

import com.codelab.HiloATMApp.services.HiloServiceImpl;
import com.codelab.HiloATMApp.services.HiloUserServiceImpl;
import lombok.extern.slf4j.Slf4j;
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
}
