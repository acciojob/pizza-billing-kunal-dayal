
package com.driver;

public class Pizza {

    private int price;
    private Boolean isVeg;
    private String bill;

    private int Cheese;
    private int Toppings;

    boolean istoppingadd;
    boolean billadd;
    boolean cheeseadd;
    boolean parcel;
    public void setPrice(int price) {
        this.price = price;
    }

    public Boolean getVeg() {
        return isVeg;
    }

    public void setVeg(Boolean veg) {
        isVeg = veg;
    }

    public void setBill(String bill) {
        this.bill = bill;
    }

    public int getCheese() {
        return Cheese;
    }

    public void setCheese(int cheese) {
        Cheese = cheese;
    }

    public int getToppings() {
        return Toppings;
    }

    public void setToppings(int toppings) {
        Toppings = toppings;
    }

    public Pizza(Boolean isVeg){
        this.isVeg = isVeg;
        // your code goes here
        if(isVeg){
            this.price = 300;
            this.Toppings = 70;
        }else{
            this.price = 400;
            this.Toppings = 120;
        }
        this.Cheese = 80;
        this.bill = "";
        this.bill += "Base Price Of The Pizza: "+ this.price +"\n";
    }

    public int getPrice(){
        return this.price;
    }

    public void addExtraCheese(){
        // your code goes here
        if(!cheeseadd){
            this.price = this.price+Cheese;
            cheeseadd = true;
        }
    }

    public void addExtraToppings(){
        // your code goes here
        if(!istoppingadd){
            this.price = this.price+Toppings;
            istoppingadd = true;
        }
    }

    public void addTakeaway(){
        // your code goes here
        if(!parcel){
            this.price = this.price+20;
            parcel = true;
        }
    }

    public String getBill(){
        // your code goes here

        if(!billadd) {
            if (cheeseadd)
                this.bill += "Extra Cheese Added: " + this.Cheese + "\n";
            if (istoppingadd)
                this.bill += "Extra Toppings Added: " + this.Toppings + "\n";
            if (parcel)
                this.bill += "Paperbag Added: " + "20" + "\n";

            this.bill += "Total Price: " + this.price + "\n";
            billadd = true;
        }
        return this.bill;
    }
}