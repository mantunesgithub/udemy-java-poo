package services;

public interface InterestService {
    public double getInterestRate();

    public double payment(double amount, int months);
}
