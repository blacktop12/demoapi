package com.demo.demoapi.controller;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;
import com.demo.demoapi.model.Producto;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
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

        products = new HashMap<String, Producto>();
        Producto p = new Producto();
        
        p.setPname("Producto 1");
        p.setPrice(10);
        p.setStock(100);
        p.setCreatedat(new Date());

        String id=UUID.randomUUID().toString();
        p.setId(id);
        products.put(id, p);
                
    }
    @GetMapping(value = "/", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Map<String, Producto>> list() {
        return new ResponseEntity<Map<String, Producto>>(products, HttpStatus.OK);
    }
    @PostMapping(value = "/", produces = "application/json")
    public ResponseEntity<String> add(@RequestBody Producto p) {
        String id = UUID.randomUUID().toString();
        p.setId(id);
        products.put(id, p);
        return new ResponseEntity<String>(id, HttpStatus.CREATED);
    }
}
