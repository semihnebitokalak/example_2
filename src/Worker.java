public class Worker {
    String name;
    int socialSecurityNumber;
    double wage;
    int workingHours;

    void displayInfo(){
        System.out.println("Name: " + name + "\nSocial Security Number: " + socialSecurityNumber);
    }

    void displaySalary(){
        System.out.println("Wage: " + wage*workingHours);
    }

}
