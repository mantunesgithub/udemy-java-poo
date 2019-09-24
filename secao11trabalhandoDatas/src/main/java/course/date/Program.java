package course.date;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.util.Date;
import java.util.TimeZone;

public class Program {
    public static void main(String[] args) throws ParseException {
        SimpleDateFormat sdf1 = new SimpleDateFormat("dd/MM/yyyy");
        SimpleDateFormat sdf2 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");

//      Para formatar no formato GMT utc vamos definir outro sdf3 e ignorar do BR
        SimpleDateFormat sdf3 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        sdf3.setTimeZone(TimeZone.getTimeZone("GMT"));



        Date y1 = sdf1.parse("25/06/2019");
        Date y2 = sdf2.parse("25/06/2019 15:42:07");
        Date y3 = Date.from(Instant.parse("2018-06-25T15:42:07Z"));
//        formato padrao iso8601 utc

        System.out.println("y1 = " + y1);
        System.out.println("y2 = " + y2);
        System.out.println("==Imprime formato padrao Java=====horario Brasil==");

        System.out.println("y1 = " + sdf2.format(y1));
        System.out.println("y2 = " + sdf2.format(y2));
        System.out.println("Para imprimir no formato dd/MM/yyyy HH:mm:ss");

//      Para instanciar uma data tipo agora
//
        Date x1 = new Date();
        System.out.println("x1 = " + sdf2.format(x1));
        System.out.println("Para imprimir no formato hoje dd/MM/yyyy HH:mm:ss");

//      Outra forma de criar uma data com horario de hoje
//
        Date x2 = new Date(System.currentTimeMillis());
        System.out.println("x2 = " + sdf2.format(x2));
        System.out.println("Outra forma Para imprimir no formato hoje dd/MM/yyyy HH:mm:ss");
//      Outra forma de criar uma data com horario de hoje
//
        Date x3 = new Date(0L);
        System.out.println("x3 = " + sdf2.format(x3));
        System.out.println("Para imprimir na data zero GMT(utc), BR 3 horas antes meia noite");
//      O java armazena uma data em milisegundos a partir de 1/1/70 GMT (utc), como o note
//      esta no horario Brasil, ele imprime 3 horas atrasados


        Date x4 = new Date(1000L * 60l * 60l * 5l);
//      1 segundo = 1000 milisegundo  , multioplica 1 seg por 60 = 1 minuto , * 60 = 1h , * 5 = 5 horas
        System.out.println("x3 = " + sdf2.format(x4));
        System.out.println("Para imprimir na data 5 da manha de GMT(utc), BR 3 horas antes meia noite");

//        Vamos instanciar uma data no formato ISO 8601 3 horas de atraso no BR
        System.out.println("y3 = " + sdf2.format(y3));
        System.out.println("Para imprimir na data GMT(utc), BR 3 horas antes meia noite");

//        Vamos instanciar uma data no formato ISO 8601 e imprimir como GMT (utc)
        System.out.println("y3 = " + sdf3.format(y3));
        System.out.println("Para imprimir na data GMT(utc)");

        System.out.println("x3 = " + sdf3.format(x3));
        System.out.println("Para imprimir na data zero GMT(utc)");

    }
}
