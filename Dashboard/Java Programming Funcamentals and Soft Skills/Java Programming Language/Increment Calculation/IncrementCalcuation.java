import java.util.Scanner;

class IncrementCalculation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int salary;
        double rating;

        System.out.println("Enter the salary");
        salary = scanner.nextInt();
        System.out.println("Enter the Performance appraisal rating");
        rating = scanner.nextDouble();
        
        if (salary <= 0 || rating < 1 || rating > 5) {
            System.out.println("Invalid Input");
        } else {
            double increment = 0.0;
            
            if (rating <= 3) {
                increment = salary * 10.0 / 100.0;    
            } else if (rating <= 4) {
                increment = salary * 25.0 / 100.0;
            } else if (rating <= 5) {
                increment = salary * 30.0 / 100.0;
            }
            
            salary += increment;
            System.out.println(salary);
        }
    }
}
