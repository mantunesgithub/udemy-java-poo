package course.manipulaData;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.util.Calendar;
import java.util.Date;
import java.util.TimeZone;

public class Program {
    public static void main(String[] args) throws ParseException {

        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        Date d = Date.from(Instant.parse("2018-06-25T15:42:07Z"));
        System.out.println("d = " + sdf.format(d));
        System.out.println("Criado uma data no formato utc  dd/MM/yyyy HH:mm:ss - BR 3 horas antes");

//      Agora quero acrescentar 4 horas nesta data usando o objeto Calendar.
//      Vou chamar set time passando minha data d
//      Tenho um calendario que tem uma data instanciada dentro dele. A partir dele posso acrescentar , diminuir dias
//      horas, etc
        Calendar  cal = Calendar.getInstance();
        cal.setTime(d);
        cal.add(Calendar.HOUR_OF_DAY,4);
        d = cal.getTime();
        System.out.println(d);
//
//      Para obter uma unidade de tempo , exemplo os minutos
//
        int minutos = cal.get(Calendar.MINUTE);
        System.out.println("Minutos= " + minutos);

//      No Calendar o mes comeca com zero

        int mes = 1 + cal.get(Calendar.MONTH);
        System.out.println("MES= " + mes);

    }
}
