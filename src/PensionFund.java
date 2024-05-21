public class  PensionFund {

    public static final double PENSIONER_CONSTANT = 2000;
    public PensionFund() {
    }
    public double calculateFuturePension(Person person) {
        double averageSalary = person.calculateAverageSalary();
        return 0.7 * averageSalary;
    }
    public void addContributor(Person person) {
    }

}





