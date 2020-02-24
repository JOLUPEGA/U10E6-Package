/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package InsuredPackage;

/**
 *
 * @author Jose Luis Perez
 */
public class InsuredPackage extends Package{
    public InsuredPackage(int peso, char metodoEnvio){
           super(peso, metodoEnvio);
           setPesoEnvio(peso, metodoEnvio);
           this.CalculateCost(peso, metodoEnvio);
    }
    private void CalculateCost(int peso, char metodoEnvio){
        double costo = 0;
        if(getCostoEnvio() <= 1.00){
            costo = getCostoEnvio() + 1.00;
        }
        else if(getCostoEnvio() > 1.00 && getCostoEnvio() <= 3.00){
            costo = getCostoEnvio() + 3.95;
            
        }
        else{
            costo = getCostoEnvio() + 5.55;

        }
        setCostoEnvio(costo);
    }

    private void setPesoEnvio(int peso, char metodoEnvio) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private double getCostoEnvio() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void setCostoEnvio(double costo) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
