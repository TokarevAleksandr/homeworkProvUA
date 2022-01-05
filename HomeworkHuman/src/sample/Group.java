package sample;

import java.util.Arrays;

import java.util.Comparator;

public class Group {
	
	private	String groupName;
	private Student[] students = new Student[10];
	
	
public Group() {
	super();
	// TODO Auto-generated constructor stub
}

public Group(String groupName) {
	super();
	this.groupName = groupName;
}
	
		
public Group(String groupName, Student[]  students) {
	super();
	this.groupName = groupName;
	this.students = students;
}


public void addStudent (Student student) throws GroupOverflowException {
	 for (int i = 0; i < students.length; i++) {
         if (students[i] != null && i == students.length - 1) {
             throw new GroupOverflowException("Группа заполнена");
         } else if (students[i] == null) {
             student.setGroupName(groupName);
             students[i] = student;
             System.out.println("Студент добавлен");
             break;
         }
     }
 }
			
public Student searchStudentByLastName(String lastName) throws StudentNotFoundException {
    Student found = null;
    for (int i = 0; i < students.length; i++) {
        if (students[i] != null && students[i].getLastName().equals(lastName)) {
            found = students[i];
        }
    }
    if (found == null) {
        throw new StudentNotFoundException("Студента с такой фамилией нет");
    }

    return found;
}

public boolean removeStudentByID(int id) {
    for (int i = 0; i < students.length; i++) {
        if (students[i] != null && students[i].getId() == id) {
            students[i] = null;
            System.out.println("Студент удален");
            return true;
        }
    }

    return false;
}

public void sortStudentsByLastName(){
    Arrays.sort(this.getStudents(), Comparator.nullsLast(new StudentLastNameComparator()));
}

public String getGroupName() {
	return groupName;
}

public void setGroupName(String groupName) {
	this.groupName = groupName;
}

public Student[] getStudents() {
	return students;
}

public void setStudents(Student[] students) {
	this.students = students;
}

@Override
public String toString() {
	return "Group [groupName=" + groupName + ", students=" + Arrays.toString(students) + "]";
}



}
