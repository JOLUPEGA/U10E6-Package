/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Package;

/**
 *
 * @author Jose Luis Perez
 */
public class Package {

    private int peso;
    private char metodoEnvio;
    private double costoEnvio;
    
    public Package(int peso, char metodoEnvio){
        setPesoEnvio(peso, metodoEnvio);
        CalculateCost(this.peso, this.metodoEnvio);
    }
    
    protected void setPesoEnvio(int peso, char metodoEnvio){
        this.peso = peso;
        this.metodoEnvio = metodoEnvio;
    }
    
    protected void setCostoEnvio(double costoEnvio){
        this.costoEnvio = costoEnvio;
    }
    
    protected int getPeso(){
        return this.peso;
    }
    
    protected char getMetodoEnvio(){
        return this.metodoEnvio;
    }
    
    protected double getCostoEnvio(){
        return this.costoEnvio;
    }
    
    private void CalculateCost(int peso, char metodoEnvio){
        double costo = 0;
        switch(metodoEnvio){
            case 'A':
                     if(peso <= 8){
                        costo = 2;
                     }else if(peso > 8 && peso <= 16){
                        costo = 3;
                     }else{
                        costo = 4.50;
                     }
                     break;
            case 'T':
                     if(peso <= 8){
                        costo = 1.50;
                     }else if(peso > 8 && peso <= 16){
                        costo = 2.35;
                     }else{
                        costo = 3.25;
                     }
                     break;
            case 'M':
                     if(peso <= 8){
                        costo = .50;
                     }else if(peso > 8 && peso <= 16){
                        costo = 1.50;
                     }else{
                        costo = 2.15;
                     }
                     break;
                     }
            this.costoEnvio = costo;
    } 
    
    public String display(){
        return "peso: " + this.peso + " metodo de envio: " + this.metodoEnvio + " Costo: " + this.costoEnvio;
    }
}