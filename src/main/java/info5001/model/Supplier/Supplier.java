/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package info5001.model.Supplier;

import java.util.ArrayList;

import info5001.model.ProductManagement.ProductCatalog;
import info5001.model.ProductManagement.ProductSummary;
import info5001.model.ProductManagement.ProductsReport;

/**
 *
 * @author kal bugrara
 */
public class Supplier {
    String name;
    ProductCatalog productcatalog;
    ProductsReport productsreport;
    public Supplier(String n){
        name = n;
        productcatalog = new ProductCatalog("software");
        
    }
    
    public ProductsReport prepareProductsReport(){
        
        productsreport = productcatalog.generatProductPerformanceReport();
        return productsreport;
    }
    
    public ArrayList<ProductSummary> getProductsAlwaysAboveTarget(){
       
        if(productsreport==null) productsreport = prepareProductsReport();
       return productsreport.getProductsAlwaysAboveTarget();
       
    }
    
    public String getName(){
        return name;
    }
        
    
    public ProductCatalog getProductCatalog(){
        return productcatalog;
    }
    
    public void printShortInfo(){
        System.out.println("Checking supplier " + name);
        productcatalog.printShortInfo();
    }



    //add supplier product ..
    
    //update supplier product ...
    @Override
   public String toString(){
       return name;
       
   }
}
