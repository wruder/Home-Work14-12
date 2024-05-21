public class Pensioner extends Person {
    public static final double PENSIONER_CONSTANT = 2000.0; // константа для пенсионеров

    public Pensioner
            (String name, double weight, double IQ,
             int age, double maxSalary, double minSalary) {
        super(name,   age,IQ,weight, maxSalary, minSalary);
    }

    @Override
    public double calculateAverageSalary() {
        return CalculatorUtil.calculatorAverage(getMinSalary(), getMaxSalary(), PENSIONER_CONSTANT);
    }

    @Override
    public String toString() {
        String name = getName();
        String maxSalary = setMaxSalary();
        return "Pensioner{" +
                "name='" + name + '\'' +
                ", age=" + getAge() +
                ", minSalary=" + getMinSalary() +
                ", maxSalary=" + getMaxSalary() +
                "вес=" + getWeight()+
                "уровень IQ=" + getIQ() +
                '}';
    }


}
























