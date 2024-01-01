

// Task3 - Student Garde Calculator 


import java.util.Scanner;
/**
 * StudentGradeCal
 */
public class StudentGradeCal {

    public void Garde() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Student Grade Calculator");
                    System.out.println("***************************************************");

                    System.out.println("Enter Student Name::");
                    String name = scanner.next();

                    System.out.println("Enter the number of Subjects::");
                    int sub = scanner.nextInt();

                    String Subjects[] = new String[sub];
                    int marks[] = new int[sub];

                    int i;
                    for (i = 0; i < sub; i++) {
                        System.out.println("Enter "+(i+1)+" Subject name::");
                        String subnm = scanner.next();
                        Subjects[i]=subnm;

                        System.out.println("Enter "+(i+1)+" Subject Mark::");
                        int submk = scanner.nextInt();
                        marks[i]=submk;
                    }

                    System.out.println("********************************************************");
        
                    System.out.println("Subject"+" --->"+"Mark");
                    System.out.println("_ _ _ _ _ _ _ _ _ _ _ _");
                    for (i = 0; i < sub; i++) {
                        System.out.println();
                        System.out.println(Subjects[i]+" --->"+marks[i]);
                        System.out.println("_ _ _ _ _ _ _ _ _ _ _ _");
                    }


                    System.out.println("********************************************************");
                    System.out.println("Student Name::"+name);

                    float total=0;
                    for (i = 0; i < sub; i++) {

                       total = total + marks[i];
                    }
                    System.out.println("Total marks::"+total);

                    float per = (total/sub);
                    System.out.println("Percentage::"+per+"%");

                    if (per<=100 && per>=95) {
                        System.out.println("Granted Grade :: A+");
                    } else if(per<=94 && per>=90) {
                        System.out.println("Granted Grade :: A");
                    } else if(per<=89 && per>=80) {
                        System.out.println("Granted Grade :: B");
                    } else if(per<=79 && per>=35) {
                        System.out.println("Granted Grade :: C");
                    } else {
                        System.out.println("Granted Grade :: F");
                    }
    }

    public static void main(String[] args) {
        StudentGradeCal object = new StudentGradeCal();
        Scanner scanner = new Scanner(System.in);
        char ch;
        do {
            System.out.println("1. Calculate");
            System.out.println("2. Exit");

            System.out.println("Enter your choice::");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    object.Garde();
                    break;
                
                case 2:
                    System.out.println("Exiting...");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid Choice!!");
                    break;
            }

            System.out.println("Do you want to continue?(y/n)");
            ch = scanner.next().charAt(0);
        } while (ch == 'y' || ch == 'Y');
        System.out.println("Exiting...");
    }
}