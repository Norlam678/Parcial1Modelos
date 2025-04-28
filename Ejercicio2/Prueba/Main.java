package Prueba;

import Promocion.Promocion;
import Saldo.Saldo;
import Saldo.SaldoUmbral;
import Transaccion.Transaccion;
import Transaccion.TransaccionDiaria;
import Transaccion.TransaccionSemanal;
import Usuario.Usuario;

public class Main {
    public static void main(String[] args) {
        Usuario usuario1 = new Usuario(10000,1000);
        Usuario usuario2 = new Usuario(500,1000);
        Usuario usuario3 = new Usuario();
        
        Promocion p1 = new PromocionEmail();
        Promocion p2 = new PromocionSms();

        Transaccion t1 = new TransaccionDiaria();
        Transaccion t2 = new Transaccioninmediata();
        transaccion t3 = new TransaccionSemanal();

        Saldo s1 = new SaldoUmbral();

        usuario1.setComportamiento(p2, t2, s1);
        usuario2.setComportamiento(p1, t1, s1);
        usuario3.setComportamiento(p1, t3);

        usuario1.getPromocion().enviarPromocion();
        usuario1.getSaldo().notificarPorSaldo(usuario1.getMonto(), usuario1.getUmbral());
        usuario1.getTransaccion().notificarTransaccion();

        usuario2.getPromocion().enviarPromocion();
        usuario2.getSaldo().notificarPorSaldo(usuario1.getMonto(), usuario1.getUmbral());
        usuario2.getTransaccion().notificarTransaccion();

        usuario3.getPromocion().enviarPromocion();
        usuario3.getTransaccion().notificarTransaccion();
    }
}
