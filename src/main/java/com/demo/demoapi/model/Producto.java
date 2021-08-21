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

    public String getId() {
        return this.id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getPname() {
        return this.pname;
    }

    public void setPname(String pname) {
        this.pname = pname;
    }

    public float getPrice() {
        return this.price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public int getStock() {
        return this.stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public Date getCreatedat() {
        return this.createdat;
    }

    public void setCreatedat(Date createdat) {
        this.createdat = createdat;
    }
}

