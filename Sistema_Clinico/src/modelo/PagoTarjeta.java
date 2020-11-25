/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.util.Date;

/**
 *
 * @author le
 */
public class PagoTarjeta implements Pago {

    protected float monto;
    protected String numero;
    protected Date expira;
    protected String propietario;
    protected String banco;
    
    @Override
    public boolean realizarPago(float monto) {
        if(this.monto>=monto){
            this.monto -= (monto+(monto*0.006));
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

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public Date getExpira() {
        return expira;
    }

    public void setExpira(Date expira) {
        this.expira = expira;
    }

    public String getPropietario() {
        return propietario;
    }

    public void setPropietario(String propietario) {
        this.propietario = propietario;
    }

    public String getBanco() {
        return banco;
    }

    public void setBanco(String banco) {
        this.banco = banco;
    }
    
}
