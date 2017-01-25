package com.projects.creative.starbuzz;

/**
 * Created by SHASHIKANT on 20-01-2017.
 */

public class Drink {
    private String name;
    String age;
    private String description;
    private int resourceId;

    public static Drink[] drinks={new Drink("Latte","A couple of espresso shots with steamed milk",R.drawable.latte),
                                    new Drink("Cappuccino", "Espresso, hot milk, and a steamed milk foam",R.drawable.cappuccino),
                                    new Drink("Filter","Highest quality beans roasted and brewed fresh",R.drawable.filter)};


    private Drink(String name,String  description,int resourceId){
        this.name=name;
        this.description=description;
        this.resourceId=resourceId;
    }

    public String getName(){
        return name;
    }
    public String getDescription(){
        return  description;
    }
    public int getResourceId(){
        return resourceId;
    }
    public String toString(){
        return  this.name;
    }
}
