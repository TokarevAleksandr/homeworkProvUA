package sample;

import java.util.Scanner;

public class StudentScanner {

    public Student reader(){
        Scanner sc = new Scanner(System.in);

        Student student = new Student();

        System.out.println("������� ���");
        student.setName(sc.nextLine());

        System.out.println("������� �������");
        student.setLastName(sc.nextLine());

        System.out.println("������� ��� � �������: (MALE/FEMALE)");
        student.setGender(Gender.valueOf(sc.nextLine()));

        System.out.println("������� ����� �������");
        student.setId(sc.nextInt());

        return student;
    }

}