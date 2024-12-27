/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.gymequippments.model;

/**
 *
 * @author ACER
 */
public class gymequippmentsmodel {
    private String ID;
    private String name; 
    private String weight;
    private String brand;
    private String category;
    private String model;
    private String use;

        public gymequippmentsmodel(String ID, String name, String weight, String brand, String category, String model, String use) {
            this.ID = ID;
            this.name = name;
            this.weight = weight;
            this.brand = brand;
            this.category = category;
            this.model = model;
            this.use = use;
        }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getWeight() {
        return weight;
    }

    public void setWeight(String weight) {
        this.weight = weight;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getUse() {
        return use;
    }

    public void setUse(String use) {
        this.use = use;
    }

   
        

    
    
    
}
