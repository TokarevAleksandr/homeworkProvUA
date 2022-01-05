package sample;

import java.util.Scanner;

public class StudentScanner {

    public Student reader(){
        Scanner sc = new Scanner(System.in);

        Student student = new Student();

        System.out.println("¬ведите им€");
        student.setName(sc.nextLine());

        System.out.println("¬ведите фамилию");
        student.setLastName(sc.nextLine());

        System.out.println("¬ведите пол в формате: (MALE/FEMALE)");
        student.setGender(Gender.valueOf(sc.nextLine()));

        System.out.println("¬ведите номер зачетки");
        student.setId(sc.nextInt());

        return student;
    }

}