//Create a Worker class includes
//Attributes
//name (string)
//socialSecurityNumber (int)
//wage (float)
//workingHours (int)
//Behaviours
//displayInfo()
//Print name + socialSecurityNumber;
//displaySalary()
//Print salary (salary= wage * workingHours)
//Create a worker object and initialize attributes.
// Call displayInfo() and displaySalary() methods for worker object.
//Create another worker, and this time get attributes from the keyboard

public class Main{
    public static void main(String[] args) {

        Worker worker = new Worker();
        worker.name = "Hamza";
        worker.socialSecurityNumber = 6068;
        worker.wage = 30.002;
        worker.workingHours = 8;
        worker.displayInfo();
        worker.displaySalary();
    }
}