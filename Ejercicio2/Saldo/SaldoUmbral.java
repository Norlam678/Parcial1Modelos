package Saldo;

public class SaldoUmbral implements Saldo{
    public void notificarPorSaldo(int saldo, int umbral){
        if(saldo<umbral){
            System.out.println("Su saldo esta por debajo del umbral deseado");
        }
    }
}
