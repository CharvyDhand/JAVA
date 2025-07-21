import java.util.Scanner;
public class Mai13 {
    public static void main(String[] args) {
        Scanner ob1=new Scanner(System.in);
        func course1 = new func("Java Basics"); 
        func course2 = new func("Data Structures"); 
        boolean exit = false; 
        while (!exit) { 
            System.out.println("Course Progress Manager\n"); 
            System.out.println("1. View Course 1 Details"); 
            System.out.println("2. View Course 2 Details"); 
            System.out.println("3. Update Course 1 Progress"); 
            System.out.println("4. Update Course 2 Progress"); 
            System.out.println("5. Exit"); 
            System.out.print("Enter your choice: "); 
            int choice = ob1.nextInt(); 
            switch (choice) { 
                case 1: 
                    course1.display(); 
                    break; 
                case 2: 
                    course2.display(); 
                    break; 
                case 3: 
                    System.out.print("Enter new progress for Course 1(0-100): "); 
                    int progress1 = ob1.nextInt(); 
                    course1.changeprog(progress1); 
                    break; 
                case 4: 
                    System.out.print("Enter new progress for Course 2 (0-100): "); 
                    int progress2 = ob1.nextInt(); 
                    course2.changeprog(progress2); 
                    break; 
                case 5: 
                    exit = true; 
                    break; 
                default: 
                    System.out.println("Invalid choice. Please try again."); 
            } 
        } 
 
        ob1.close(); 
        System.out.println("Thank you"); 
    } 
    }   
abstract class details{
    private String title;
    private int progress;
    public details(String x){
        this.title=x;
        this.progress=0;
    }
    public String gettitle(){
        return title;
    }
    public int getProgress() {
        return progress;
    }
    public void changeprog(int y){
        if(y>=0 && y<=100){
            this.progress=y;
            System.out.println("Progress updated.");
        }
        else{
            System.out.println("Invalid value.");
        }
    }
    public abstract void display();
}
class func extends details{
    public func(String title){
        super(title);
    }
    @Override
    public void display(){
        System.out.println("Course Name: " + gettitle());
        System.out.println("Progress: " + getProgress() + "%");
    }
}