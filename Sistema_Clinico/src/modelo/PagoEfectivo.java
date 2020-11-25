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
public class PagoEfectivo implements Pago{

    protected float monto;
    
    @Override
    public boolean realizarPago(float monto) {
        if(this.monto>=monto){
            this.monto -= monto;
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
}
