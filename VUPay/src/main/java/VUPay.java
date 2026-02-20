import java.util.Scanner;
public class VUPay {

    public static void main(String[] args) {

        // (b) Declaring variables
        String enteredCode;
        boolean found = false;

        // Initializing VUCourses objects
        VUCourses course1 = new VUCourses("BSc. Software Engineering",   "BSF", 900000);
        VUCourses course2 = new VUCourses("BSc. Information Technology", "BIT", 750000);
        VUCourses course3 = new VUCourses("BSc. Computer Science",       "BCS", 800000);
        VUCourses course4 = new VUCourses("BSc. Computer Engineering",   "BCE", 950000);

        // Store in array
        VUCourses[] courses = {course1, course2, course3, course4};

        try ( // (c) Prompt user to enter Module Code
        java.util.Scanner scanner = new Scanner(System.in)) {
            System.out.println("==========================================");
            System.out.println("  Welcome to VUPay - Victoria University  ");
            System.out.println("==========================================");
            System.out.print("Please enter the Module Code: ");
            enteredCode = scanner.nextLine().trim();
            
            // Search for matching course
            for (VUCourses course : courses) {
                if (course.getModuleCode().equalsIgnoreCase(enteredCode)) {
                    System.out.println("\n--- Course Details ---");
                    System.out.println(course.toString());
                    found = true;
                    break;
                }
            }
            
            // If no match found
            if (!found) {
                System.out.println("Wrong Module Code details");
            }
        }
    }
}
