package studentmarksa2;

public class MarksHelper {

    int totalMarks, markAverage;
    char grade;


    public int getTotalMarks(int m1,int m2, int m3, int m4, int m5, String name) {


            totalMarks = m1+m2+m3+m4+m5;

        System.out.println("The total mark of the student " + name + " is " + totalMarks);
        return totalMarks;
    }

    public void getGrade(String name) {
        markAverage = totalMarks / 5;
        System.out.println("Students average mark is " + markAverage);
        if (markAverage > 90) {
            grade = 'A';
            System.out.println("The grade of the student " + name + " is " + grade);
        } else if (markAverage > 80 && markAverage <= 90) {
            grade = 'B';
            System.out.println("The grade of the student " + name + " is " + grade);
        } else if (markAverage >= 65 && markAverage <= 80) {
            grade = 'C';
            System.out.println("The grade of the student " + name + " is " + grade);
        } else if (markAverage < 65) {
            System.out.println("The student " + name + " is failed the exam");
        }

    }
}
