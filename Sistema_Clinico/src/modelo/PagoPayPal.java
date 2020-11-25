/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author le
 */
public class PagoPayPal implements Pago {

    protected float monto;
    protected String email;
    
    @Override
    public boolean realizarPago(float monto) {
        if(this.monto>=monto){
            this.monto -= (monto+(monto*0.054)+0.30);
            return true;
        }
        return false;
    }

    public float getMonto() {
        return monto;
    }

    public void setMonto(float monto) {
        this.monto = monto;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    
}
