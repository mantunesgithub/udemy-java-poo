package servicesDefender;

import java.security.InvalidParameterException;
//  A interface não pode armazenar estado e nem ter construtor, então o metodo do construtor e o metodo
//  getInterestRate tem que ficar implementdo nas classes
//
public interface InterestService {

    double getInterestRate();

    default double payment(double amount, int months) {
        if (months < 1 ) {
            throw new InvalidParameterException( "Months must be breater than zero");
        }
        return amount * Math.pow(1.0 + getInterestRate() / 100.0, months);
    }
}
