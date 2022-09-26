import java.util.ArrayList;
import org.joda.time.DateTime;

public class Main {
  public static void main(String[] args) 
  {
    // Create mock students.
    Student s1 = new Student("Carlos Boswink", DateTime.parse("2002-05-21"), 19356781);
    Student s2 = new Student("Emauel Reguter", DateTime.parse("2001-03-15"), 19356785);
    Student s3 = new Student("Jazlyn Hutchin", DateTime.parse("1993-08-23"), 19358274);

    // Create student list.
    ArrayList<Student> students = new ArrayList<>();
    students.add(s1);
    students.add(s2);
    students.add(s3);

    // Create mock lecturers.
    Lecturer l1 = new Lecturer("Jaydon Groeber", DateTime.parse("1969-08-04"), 1135632);
    Lecturer l2 = new Lecturer("Cadena Heinalz", DateTime.parse("1991-06-11"), 1135680);
    Lecturer l3 = new Lecturer("Summer Slukawa", DateTime.parse("1980-01-29"), 1156089);

    // Create mock modules.
    Module m1 = new Module("Cryptography", "CS402", l1);
    Module m2 = new Module("Graphics & Image Process", "CT404", l2);
    Module m3 = new Module("Real Time Systems", "CT420", l3);
    Module m4 = new Module("Ireland in the Global Economy", "EC423", l1);
    Module m5 = new Module("Business Strategy", "MG3103", l2);
    Module m6 = new Module("Company Law II", "LW231", l3);
    Module m7 = new Module("SmartGrid", "CT474", l1);
    Module m8 = new Module("Power Systems", "EE450", l2);
    Module m9 = new Module("Object-Oriented Programming", "CT2106", l3);

    // Create mock courses.
    CourseProgramme c1 = new CourseProgramme("Bachelor and Master of Engineering (Energy Systems)", DateTime.parse("2022-09-01"), DateTime.parse("2023-05-01"));
    CourseProgramme c2 = new CourseProgramme("BComm in International Hotel Management", DateTime.parse("2022-10-01"), DateTime.parse("2023-04-01"));
    CourseProgramme c3 = new CourseProgramme("Computer Science and Information Technology", DateTime.parse("2022-09-10"), DateTime.parse("2023-04-20"));
    
    // Create course programme list.
    ArrayList<CourseProgramme> courseProgrammes = new ArrayList<>();
    courseProgrammes.add(c1);
    courseProgrammes.add(c2);
    courseProgrammes.add(c3);

    // Add students to modules and courses.
    s1.addCourse(c1);
    s1.addModule(m7);
    s1.addModule(m8);
    s1.addModule(m9);

    s2.addCourse(c2);
    s2.addModule(m4);
    s2.addModule(m5);
    s2.addModule(m6);

    s3.addCourse(c3);
    s3.addModule(m1);
    s3.addModule(m2);
    s3.addModule(m3);

    // Add modules to courses.
    c1.addModule(m7);
    c1.addModule(m8);
    c1.addModule(m9);
    c2.addModule(m4);
    c2.addModule(m5);
    c2.addModule(m6);
    c3.addModule(m1);
    c3.addModule(m2);
    c3.addModule(m3);

    // Print students.
    System.out.println("\n======================= Students =======================\n");
    for (Student s : students) {
      System.out.println(s.toString());
    }

    // Print courses.
    System.out.println("\n======================= Courses =======================\n");
    for (CourseProgramme c : courseProgrammes) {
      System.out.println(c.toString());
    }
  }
}
