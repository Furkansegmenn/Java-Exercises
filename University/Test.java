package furkan.University;

import java.net.SocketOption;
import java.util.Date;

public class Test {
    public static void main(String[] args) {
        Department departmentOne = new Department();
        departmentOne.name = "Computer Engineering";
        Department departmentTwo = new Department();
        departmentTwo.name = "Software Engineering";

        Professor professorOne = new Professor();
        professorOne.name = "Ahmet Segmen";
        Professor professorTwo = new Professor();
        professorTwo.name = "Eray Yıldırım";

        Student studentOne = new Student();
        studentOne.name = "Furkan Segmen";
        Student studentTwo = new Student();
        studentTwo.name = "Hakan Yıldız";

        Courses courseOne = new Courses();
        courseOne.name = "İntroduction To Computer Engineering";
        Courses courseTwo = new Courses();
        courseTwo.name = "Object Oriented Programming";


        departmentOne.head = professorOne;
        professorOne.department = departmentOne;

        departmentTwo.head = professorTwo;
        professorTwo.department = departmentTwo;

        departmentOne.courses = new Courses[50];
        courseOne.department = departmentOne;
        departmentOne.courses[10] = courseOne;

        departmentTwo.courses = new Courses[30];
        courseTwo.department = departmentTwo;
        departmentTwo.courses[5] = courseTwo;

        professorOne.coursesGiven = new Courses[5];
        courseOne.professor = professorOne;
        professorOne.coursesGiven[1] = courseOne;

        professorTwo.coursesGiven = new Courses[3];
        courseTwo.professor = professorTwo;
        professorTwo.coursesGiven[2] = courseTwo;

        professorOne.advisee = new Student[10];
        professorOne.advisee[6] = studentOne;
        studentOne.advisor = professorOne;

        professorTwo.advisee = new Student[30];
        professorTwo.advisee[15] = studentTwo;
        studentTwo.advisor = professorTwo;

        studentOne.coursesTaken = new Courses[8];
        studentOne.coursesTaken[3] = courseOne;
        studentTwo.coursesTaken = new Courses[8];
        studentTwo.coursesTaken[2] = courseTwo;

        courseOne.students = new Student[160];
        courseOne.students[45] = studentOne;
        courseTwo.students = new Student[100];
        courseTwo.students[95] = studentTwo;

        System.out.println("Name of " + studentOne.name + "'s first course is " + studentOne.coursesTaken[3].name);
        System.out.println("Name of " + studentTwo.name + "'s first course is " + studentTwo.coursesTaken[2].name);
        System.out.println("Name of " + studentOne.name + "'s first courses professor's name is " + studentOne.coursesTaken[3].professor.name);
        System.out.println("Name of " + studentTwo.name + "'s first courses professor's name is " + studentTwo.coursesTaken[2].professor.name);
        System.out.println("Name of " + studentOne.name + "'s first courses professor's department is " + studentOne.coursesTaken[3].professor.department.name);
        System.out.println("Name of " + studentTwo.name + "'s first courses professor's department is " + studentTwo.coursesTaken[2].professor.department.name);
    }
}
