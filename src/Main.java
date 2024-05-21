public class Main {


    public static void main(String[] args) {

        Pensioner pensioner = new Pensioner("Stepanych", 70, 102, 68, 1120, 789);
        pensioner.goToWork();
        Worker worker = new Worker("Stefan", 50, 102, 33, 5999, 2999);
        worker.goToWork();

        Teenager teen = new Teenager("Tomas", 16, 105, 50, 0, 0);

        PensionFund pensionFund = new PensionFund();// пенсионный фонд
        //добавление в пенсионный фонд
        pensionFund.addContributor(pensioner);
        pensionFund.addContributor(worker);


        //расчет будущей пенсии для каждого человека
        double futurePension1 = pensionFund.calculateFuturePension(pensioner);
        double futurePension2 = pensionFund.calculateFuturePension(worker);


        System.out.println("");

        System.out.println("name : " + pensioner.getName());
        System.out.println("age : " + pensioner.getAge());
        System.out.println("Min Salary: " + pensioner.getMinSalary());
        System.out.println("Max Salary: " + pensioner.getMaxSalary());
        System.out.println("future Pension:" + pensioner.calculateAverageSalary());

        System.out.println("Pensioner hash code " + pensioner.hashCode());
        System.out.println("Worker hash code" + worker.hashCode());
        System.out.println("Pensioner tostring" + pensioner.toString());
        System.out.println("Worker tostring" + worker.toString());

        System.out.println("name:" + worker.getName());
        System.out.println("age:" + worker.getAge());
        System.out.println("Min Salary:" + worker.getMinSalary());
        System.out.println("Max Salary" + worker.getMaxSalary());
        System.out.println("Average salary :" + worker.calculateAverageSalary());
        System.out.println("Teenager average salary:" + teen.calculateAverageSalary());

        }
    }





