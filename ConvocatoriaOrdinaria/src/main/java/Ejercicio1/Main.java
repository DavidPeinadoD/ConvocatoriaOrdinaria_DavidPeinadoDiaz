package Ejercicio1;

public class Main {
    public static void main(String[] args) {
        GlamourFinancialImplementation financial = GlamourFinancialImplementation.getInstance();

        // Ejemplo de observador que muestra la cotización de las acciones
        FinancialObserver stockObserver = new FinancialObserver() {
            @Override
            public void update(double stockPrice) {
                System.out.println("El precio de las acciones ha sido actualizado: " + stockPrice);
            }
        };

        financial.addObserver(stockObserver);

        // Actualizar el precio de las acciones
        financial.setStockPrice(100.0);
    }
}
