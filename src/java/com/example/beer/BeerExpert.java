/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.beer;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author abdoabou
 */
public class BeerExpert {
    public List getBrands (String color){
        List brands = new ArrayList();
        if(color.equals("brown")){
            brands.add("Pepsi");
            brands.add("CocaCola");
            
        }else {
            brands.add("Cappy");
            brands.add("SevenUp");
        }
        return brands ;  
    }
    
}
