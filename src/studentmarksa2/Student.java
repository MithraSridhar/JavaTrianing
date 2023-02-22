package studentmarksa2;

public class Student {


   public Student(int m1,int m2, int m3, int m4, int m5,String name) {
       Marks marks = new Marks();
       marks.setM1(m1);
       marks.setM2(m2);
       marks.setM3(m3);
       marks.setM4(m4);
       marks.setM5(m5);
       marks.setName(name);

        System.out.println("Student name is " + marks.getName());
        System.out.println("Student mark1 is " + marks.getM1());
        System.out.println("Student mark2 is " + marks.getM2());
        System.out.println("Student mark3 is " + marks.getM3());
        System.out.println("Student mark4 is " + marks.getM4());
        System.out.println("Student mark5 is " + marks.getM5());

        MarksHelper MH = new MarksHelper();
        MH.getTotalMarks(m1,m2,m3,m4,m5, name);
        MH.getGrade(name);
    }

}
