package sages.bootcamp.mocitobasic;


import java.util.ArrayList;
import java.util.List;

public class Storage {

   private List<String> products = new ArrayList<String>();

    List<String> retrive(){
        return products;
    }

    void store(List<String> newProducts){
        this.products = newProducts;
    }
}
