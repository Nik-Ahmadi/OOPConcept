import HR.Analyst;
import HR.Employee;
import HR.HumanResource;
import HR.Marketing;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

       /* Employee employee = new Employee();
        employee.setFullName("Nik Ahmadi");
        employee.setWorkingHours(40);
        employee.setHourlyRate(45);


        */

        Employee employee = new Employee("Nik Ahmadi", 40, 45);
        double calculatedSalary = employee.calculateSalary();
        System.out.println("your salary before tax is " + calculatedSalary);

        Marketing marketing = new Marketing("Mostafa Fata" ,40, 50);
        marketing.setSales(15);
        marketing.setBonusRate(5);
        double bounsSalary = marketing.calculateSalary();
        System.out.println("your salary after Bouns is " +bounsSalary);



        //Polymorphism
        Employee officer = new Marketing("Walid", 40,25);
        officer =new Analyst("Ahmad",40 ,20);
        System.out.println(officer.calculateSalary());

        }
    }
