package main.java.com.lucaiyu.learnjava.Class;

class Employee {
    String name;
    int age;
    double money;

    public Employee(String name){
        this.name = name;
    }

    public void Age(int Age){
        age=Age;
    }

    public void Money(double Money){
        money=Money;
    }

    public void PrintStatus(){
        System.out.println("Name:" + name);
        System.out.println("Age:" + age);
        System.out.println("Money:" + money);
    }
}
class EmployeeObject {
    public static void main(String[] args) {
        Employee emp1 = new Employee("No1");
        Employee emp2 = new Employee("No2");

        emp1.Age(42);
        emp1.Money(12000.0);

        emp2.Age(43);
        emp2.Money(36000.0);
    }
}

