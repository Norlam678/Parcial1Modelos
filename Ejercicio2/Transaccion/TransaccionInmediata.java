package Transaccion;

public class TransaccionInmediata implements Transaccion{
    public void notificarTransaccion(){
        System.out.println("Esta es una notificacion de transaccion inmediata");
    }
}