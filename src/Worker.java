public class Worker extends Person  implements Employable {
    public Worker() {
        super();
    }

    public Worker(String name, double weight,double IQ, int age, double maxSalary, double minSalary) {
        super(name, age, IQ, weight,  maxSalary, minSalary);
    }

    @Override
    public double calculateAverageSalary() {
        return CalculatorUtil.calculatorAverage(getMinSalary(), getMaxSalary())/2;
    }

    @Override
    public String toString() {
        return "Worker{" +
                "name='" + getName() + '\'' +
                ", age=" + getAge() +
                ", minSalary=" + getMinSalary() +
                ", maxSalary=" + getMaxSalary() +
                ",вес=" + getWeight() +
                ", уровень IQ=" + getIQ()+
                '}';

    }

    @Override
    public void goToWork() {
        System.out.println("я счастливо шагаю на работу");
    }
}



