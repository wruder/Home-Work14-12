import java.util.Objects;

public abstract class Person {
    private static final int DEFAULT_Age = 18;
    private String name;
    int age;
    private double weight;
    private double minSalary;
    private double maxSalary;
    private double IQ;

    public Person() {
    }

    public Person(String name, int age, double IQ, double weight, double maxSalary, double minSalary) {
        this.name = name;
        this.age = age;
        this.maxSalary = maxSalary;
        this.minSalary = minSalary;
        this.weight = weight;
        this.IQ = IQ;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getWeight() {
        return weight;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setIQ(double iq) {
        this.IQ = IQ;
    }

    public double getIQ() {
        return IQ;
    }

    public double getMinSalary() {
        return minSalary;
    }

    public void setMinSalary(double minSalary) {
        this.minSalary = minSalary;
    }

    public double getMaxSalary() {
        return maxSalary;
    }

    public String setMaxSalary() {
        this.maxSalary = maxSalary;
        return null;
    }


    public abstract double calculateAverageSalary();

    public double calculateFuturePension(double pensionerConstant) {
        return 0;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Person person)) return false;
        return getAge() == person.getAge() && Double.compare(getWeight(), person.getWeight()) == 0 && Double.compare(getMinSalary(), person.getMinSalary()) == 0 && Double.compare(getMaxSalary(), person.getMaxSalary()) == 0 && Double.compare(getIQ(), person.getIQ()) == 0 && Objects.equals(getName(), person.getName());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName(), getAge(), getWeight(), getMinSalary(), getMaxSalary(), getIQ());
    }
}

















