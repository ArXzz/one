public class RetiroBancario {
        public static void main(String[] args) {
            // Inicialización de variables
            double saldoInicial = 1000;  // Dinero inicial en la cuenta
            double retiroPorSemana = 200;  // Cantidad de dinero a retirar cada semana
            int semanasEnUnMes = 4;  // Número de semanas en un mes
            
          
            for (int i = 1; i <= semanasEnUnMes; i++) {
                saldoInicial -= retiroPorSemana;  // Restamos el retiro de la cuenta
                System.out.println("Semana " + i + ": Retiro de $200. Saldo restante: $" + saldoInicial);
            }
            
           
            System.out.println("\nSaldo final al final del mes: $" + saldoInicial);
        }
    }
    

