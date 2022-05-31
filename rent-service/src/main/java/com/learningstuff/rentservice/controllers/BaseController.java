package com.learningstuff.rentservice.controllers;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by IntelliJ IDEA.
 * User: Md. Shamim Molla
 * Email: shamim.molla@vivasoftltd.com
 */

@RestController
@RequestMapping(value = "/")
public class BaseController {

    @GetMapping(value = "")
    public ResponseEntity<?> baseUrl() {
        return ResponseEntity.status(HttpStatus.OK).body("Rent base url");
    }

}
