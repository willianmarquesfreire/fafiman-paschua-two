package br.com.wmfsystem.financeiro;

import java.util.Currency;

/**
 * Created by wmfsystem on 3/8/17.
 */
public abstract class Contas {

   private Boolean pago;
   private Currency valor;

   public Boolean getPago() {
      return pago;
   }

   public void setPago(Boolean pago) {
      this.pago = pago;
   }
}
