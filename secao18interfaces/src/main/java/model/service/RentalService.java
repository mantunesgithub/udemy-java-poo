package model.service;

import model.entities.CarRental;
import model.entities.Invoice;

public class RentalService {
    private Double  pricePerDay;
    private Double  pricePerHour;
    private BrazilTaxService taxService;        //    associacao

    public RentalService() {
    }

    public RentalService(Double pricePerDay, Double pricePerHour, BrazilTaxService taxService) {
        this.pricePerDay = pricePerDay;
        this.pricePerHour = pricePerHour;
        this.taxService = taxService;
    }



    public void processInvoice(CarRental carRental) {
        long    t1 = carRental.getStart().getTime();
        long    t2 = carRental.getFinish().getTime();
        double  hours = (double) (t2 - t1) / 1000 / 60 / 60;
//                        t2-t1 = diferença em milisegundo, para converter em segundos / 1000 . Para
//                        converter de segundos para minutos / 60 e par converter para horas / 60
        double basicPayment;
        if  (hours <= 12.0) {
            basicPayment = Math.ceil(hours) * pricePerHour;
        } else {
            basicPayment = Math.ceil(hours / 24 ) * pricePerDay;
        }
        double  tax = taxService.tax(basicPayment);

        carRental.setInvoice(new Invoice(basicPayment, tax));

    }

}
