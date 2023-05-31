package com.example.java;

public class Main {

    public static void main(String[] args) {
        Enemy enemy = new Enemy();
        enemy.Talk();

        Omen omen = new Omen();
        omen.Talk();

        Yuro yuro = new Yuro();
        yuro.Talk();

        Sage sage = new Sage();
        sage.Run();

        Enemy[] enemies = {omen, yuro};
        System.out.println(enemies);


        omen.setHealth(40);
        omen.gethealth();
        //       omen.health = 40;
        //       System.out.println(omen.health);

        Animal animal = new Animal();
        Cat cat = new Cat();

        animal.makeSound();
        cat.makeSound();

//        Vehicle vehicle = new Vehicle();
//        vehicle.Drive();
        Car car = new Car("fgg" , "1231700" , 12300 , "idk");
        car.Drive();


        Rectangle rectangle = new Rectangle(12, 89);
        double area = rectangle.getArea();
        System.out.println("The area of the rectangle is " + area);

        Employee employee = new Employee(5000);
        employee.getSalary();
        employee.work();

        HRManger hrmanger = new HRManger(3000);
        hrmanger.addEmployee();
        hrmanger.work();

        System.out.println("Create a Bank Account object (A/c No. BA1234) with initial balance of $500:");
        //Create a BankAccount object (A/c No. "BA1234") with initial balance of $500
        BankAccount BA1234 = new BankAccount("BA1234", 500);

        // Deposit $1000 into account BA1234
        System.out.println("Deposit $1000 into account BA1234:");
        BA1234.deposit(1000);
        System.out.println("New balance after depositing $1000: $" + BA1234.getBalance());

        // Withdraw $600 from account BA1234
        System.out.println("Withdraw $600 from account BA1234:");
        BA1234.withdraw(600);
        System.out.println("New balance after withdrawing $600: $" + BA1234.getBalance());

        // Create a SavingsAccount object (A/c No. "SA1234") with initial balance of $450
        System.out.println("\nCreate a SavingsAccount object (A/c No. SA1234) with initial balance of $450:");
        SavingsAccount SA1234 = new SavingsAccount("SA1234", 450);

        // Withdraw $300 from SA1234
        SA1234.withdraw(300);
        System.out.println("Balance after trying to withdraw $300: $" + SA1234.getBalance());


        // Create a SavingsAccount object (A/c No. "SA1000") with initial balance of $300
        System.out.println("\nCreate a SavingsAccount object (A/c No. SA1000) with initial balance of $300:");
        SavingsAccount SA1000 = new SavingsAccount("SA1000", 300);

        // Withdraw $250 from SA1000 (balance falls below $100)
        System.out.println("Try to withdraw $250 from SA1000!");
        SA1000.withdraw(250);
        System.out.println("Balance after trying to withdraw $250: $" + SA1000.getBalance());

        animal.move();
        Cheetah cheetah = new Cheetah();
        cheetah.Move();

        Circle circle = new Circle(4);
        System.out.println("Area = " + circle.getArea());
        System.out.println("Perimeter = " +
                circle.getPerimeter());

    }

}


