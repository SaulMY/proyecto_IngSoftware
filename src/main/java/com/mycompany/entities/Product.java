/*En esta clase se adjuntan todos los atributos y metodos necesarios
  para que se desarrolle el programa adecuadamente*/
package com.mycompany.entities;

import java.time.LocalDate;

public class Product {
    
    private String code;
    private String name;
    private String description;
    private int price;
    private int promoPrice;
    private String[] benefits;//falta por agregar en el control e intefaz
    private String imgUrl;
    private LocalDate discStar;
    private LocalDate discEnd;
    private boolean promo;
    
    //Constructores
    public Product(){//Default const
    }

    public Product(String code, String name, String description, int price, int promoPrice, String[] benefits, String imgUrl, LocalDate discStar, LocalDate discEnd) {
        this.code = code;
        this.name = name;
        this.description = description;
        this.price = price;
        this.promoPrice = promoPrice;
        this.benefits = benefits;
        this.imgUrl = imgUrl;
        this.discStar = discStar;
        this.discEnd = discEnd;
    }
    
    //setters
    public void setCode(String code) {
        this.code = code;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void setPromoPrice(int promoPrice) {
        this.promoPrice = promoPrice;
    }

    public void setBenefits(String[] benefits) {
        this.benefits = benefits;
    }

    public void setImgUrl(String imgUrl) {
        this.imgUrl = imgUrl;
    }

    public void setDiscStar(LocalDate discStar) {
        this.discStar = discStar;
    }

    public void setDiscFin(LocalDate discEnd) {
        this.discEnd = discEnd;
    }
    
    //getters

    public String getCode() {
        return code;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public int getPrice() {
        return price;
    }

    public int getPromoPrice() {
        return promoPrice;
    }

    public String[] getBenefits() {
        return benefits;
    }

    public String getImgUrl() {
        return imgUrl;
    }

    public LocalDate getDiscStar() {
        return discStar;
    }

    public LocalDate getDiscFin() {
        return discEnd;
    }

    public boolean isPromo() {
        return promo;
    }

    public void setPromo(boolean promo) {
        this.promo = promo;
    }
    
}
