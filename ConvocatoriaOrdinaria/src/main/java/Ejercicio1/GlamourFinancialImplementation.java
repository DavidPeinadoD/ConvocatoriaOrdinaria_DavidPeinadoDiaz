package Ejercicio1;

import java.util.ArrayList;
import java.util.List;

public class GlamourFinancialImplementation implements GlamourFinancial {
    private double stockPrice;
    private List<FinancialObserver> observers;

    private static GlamourFinancialImplementation instance;

    protected GlamourFinancialImplementation() {
        observers = new ArrayList<>();
    }

    public static GlamourFinancialImplementation getInstance() {
        if (instance == null) {
            instance = new GlamourFinancialImplementation();
        }
        return instance;
    }

    @Override
    public void setStockPrice(double price) {
        this.stockPrice = price;
        notifyObservers();
    }

    @Override
    public double getStockPrice() {
        return stockPrice;
    }

    @Override
    public double calculateMarketValue() {
        // Implementar el cálculo del valor de mercado
        return 0.0;
    }

    @Override
    public double calculatePriceToBookRatio() {
        // Implementar el cálculo del precio-valor en libros
        return 0.0;
    }

    public void addObserver(FinancialObserver observer) {
        observers.add(observer);
    }

    public void removeObserver(FinancialObserver observer) {
        observers.remove(observer);
    }

    private void notifyObservers() {
        for (FinancialObserver observer : observers) {
            observer.update(stockPrice);
        }
    }
}
