package com.demo.demoapi.controller;

import java.util.Map;
import com.demo.demoapi.model.Producto;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.http.ResponseEntity;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;

@RestController
@RequestMapping(value = "demoapi/product", produces = "application/json")

public class ProductoController {
    private Map<String, Producto> products;

    public ProductoController() {
        /*
        private String id;
        private String pname;
        private float price;
        private int stock;
        private Date createdat;
        */

        products = new HashMap<String, Producto>();
        Producto p = new Producto();
        
        p.setEmail("email@email.com");
        p.setName("name");
        p.setPhoneNumber("999999999");
        p.setBirthDate(new Date());
        String id = UUID.randomUUID().toString();
        p.setId(id);
        participantes.put(id, p);

    }

    @GetMapping(value = "/", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Map<String, Producto>> list() {
        return new ResponseEntity<Map<String, Producto>>(products, HttpStatus.OK);
    }
}
