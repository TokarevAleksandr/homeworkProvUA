package sample ;

public class Main {
    public static void main(String[] args) {
    	

		Student st1 = new Student ("Lee", "Aaker", Gender.MALE, 1);
		Student st2 = new Student("Frank", "Aard", Gender.MALE, 2);
		Student st3 = new Student("Ann", "Wilson",Gender.FEMALE, 3);
		Student st4 = new Student("Anthony", "Palermo", Gender.MALE, 4);
		Student st5 = new Student("Richard", "Penniman", Gender.MALE, 51);
		Student st6 = new Student("Tina", "Turner", Gender.FEMALE, 6);
		Student st7 = new Student("Amy", "Hartzle", Gender.FEMALE, 70);
		Student st8 = new Student("Fred", "Durst", Gender.MALE, 34);
		Student st9 = new Student("Pat", "Benatar", Gender.FEMALE, 12);
		Student st10 = new Student("Charles", "Berry", Gender.MALE, 13);
		Student st11 = new Student("Robert", "Zimmerman", Gender.MALE, 77);
		
		

		Group group1= new Group ("java");
		try{ 
			group1.addStudent(st1);
			group1.addStudent(st2);
			group1.addStudent(st3);
			group1.addStudent(st4);
			group1.addStudent(st5);
			group1.addStudent(st6);
			group1.addStudent(st7);
			group1.addStudent(st8);
			group1.addStudent(st9);
//			group1.addStudent(st10);
//			group1.addStudent(st11);
		} catch (GroupOverflowException e) {
			System.out.println(e.getMessage());
	}
		
		
		group1.removeStudentByID(12);
		try {
			group1.addStudent(st11);
		} catch (GroupOverflowException e) {
			System.out.println(e.getMessage());
		}
		
		try {
			System.out.println(group1.searchStudentByLastName("Aard"));
		} catch (StudentNotFoundException e) {
			System.out.println(e.getMessage());
		} 
		System.out.println(group1.toString());

		StudentScanner sr = new StudentScanner();

        try {
        	group1.addStudent(sr.reader());
        } catch (GroupOverflowException e) {
            System.out.println(e.getMessage());
        }

        group1.sortStudentsByLastName();
        System.out.println(group1.toString());


    }
}