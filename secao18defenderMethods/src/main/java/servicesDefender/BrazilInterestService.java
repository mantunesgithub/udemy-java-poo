package servicesDefender;

public class BrazilInterestService implements InterestService {
    public double interestRate;

    public BrazilInterestService(double interestRate) {
        this.interestRate = interestRate;
    }
    @Override
    public double getInterestRate() {
        return interestRate;
    }
}
