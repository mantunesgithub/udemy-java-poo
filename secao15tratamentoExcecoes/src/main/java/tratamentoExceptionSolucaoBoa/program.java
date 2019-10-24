package tratamentoExceptionSolucaoBoa;

import tratamentoExceptionSolucaoBoa.entities.DomainException;
import tratamentoExceptionSolucaoBoa.entities.Reservation;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class program {
    public static void main(String[] args)  {
        Scanner sc = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        try {
            System.out.print("Room number: ");
            int number = sc.nextInt();
            System.out.print("Check-in date (dd/MM/yyyy): ");
            Date checkIn = sdf.parse(sc.next());
            System.out.print("Check-out date (dd/MM/yyyy): ");
            Date checkOut = sdf.parse(sc.next());

            Reservation reservation = new Reservation(number, checkIn, checkOut);
            System.out.println("Reservation: " + reservation);

            System.out.println();
            System.out.println("Enter data to update the reservation:");
            System.out.print("Check-in date (dd/MM/yyyy): ");
            checkIn = sdf.parse(sc.next());
            System.out.print("Check-out date (dd/MM/yyyy): ");
            checkOut = sdf.parse(sc.next());

            reservation.updateDates(checkIn, checkOut);
            System.out.println("Reservation: " + reservation);
        }
        catch (ParseException e) {
            System.out.println("Invalid date format");
        }
//        catch (IllegalArgumentException e) {
        catch (DomainException e) {
            System.out.println("Error in reservation" + e.getMessage());
//
//          e.getMessage é a mensagem que ele vai pegar qdo chamei reservation.updateDates
//
        }
        catch (RuntimeException e ) {
            System.out.println("Unexpected error");
//          capta qq outro erro inesperado. Tipo ao inves de dig numero digita letra no do nr apto
        }
        sc.close();
    }
}
