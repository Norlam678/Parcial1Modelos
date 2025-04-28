package Usuario;

import Promocion.Promocion;
import Saldo.Saldo;
import Transaccion.Transaccion;

public class Usuario {

    int umbral;
    int monto;
    Promocion promocion;
    Saldo saldo;
    Transaccion transaccion;

    public Usuario(int umbral, int monto) {
        this.umbral = umbral;
        this.monto = monto;
    }

    public Usuario(){
        
    }

    public int getUmbral() {
        return this.umbral;
    }

    public int getMonto() {
        return  this.monto;
    }

    public Promocion getPromocion() {
        return  this.promocion;
    }
    public Saldo getSaldo() {
        return  this.saldo;
    }
    public Transaccion getTransaccion() {
        return  this.transaccion;
    }


    public void setComportamiento(Promocion promocion, Transaccion transaccion, Saldo saldo) {
        this.promocion = promocion;
        this.saldo = saldo;
        this.transaccion = transaccion;
    }
    public void setComportamiento(Promocion promocion, Transaccion transaccion) {
        this.promocion = promocion;
        this.transaccion = transaccion;
    }

}
