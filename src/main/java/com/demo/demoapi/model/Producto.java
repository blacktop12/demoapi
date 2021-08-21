package com.demo.demoapi.model;
import lombok.*;
import java.util.Date;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Producto 
{
    private String id;
    private String pname;
    private float price;
    private int stock;
    private Date createdat;
}

