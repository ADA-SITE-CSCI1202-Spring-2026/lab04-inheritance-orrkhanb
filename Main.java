public class Main {
    public static void main(String[] args) {

        // --- Person ---
        Person p1 = new Person("Alice", "Smith", "Female");
        Person p2 = new Person("Alice", "Smith", "Female");
        Person p3 = new Person("Bob", "Jones", "Male");

        System.out.println(p1);
        System.out.println("p1 equals p2: " + p1.equals(p2));
        System.out.println("p1 equals p3: " + p1.equals(p3));

        System.out.println();

        // --- Teacher ---
        String[] t1Courses = {"Math", "Physics"};
        String[] t2Courses = {"Math", "Physics"};
        Teacher t1 = new Teacher("John", "Doe", "Male", "Science", t1Courses);
        Teacher t2 = new Teacher("John", "Doe", "Male", "Science", t2Courses);
        Teacher t3 = new Teacher("Jane", "Doe", "Female", "Arts", new String[]{"History"});

        System.out.println(t1);
        System.out.println("t1 equals t2: " + t1.equals(t2));
        System.out.println("t1 equals t3: " + t1.equals(t3));

        System.out.println();

        // --- Student ---
        Student s1 = new Student("Emma", "Brown", "Female", 1001);
        Student s2 = new Student("Emma", "Brown", "Female", 1001);
        Student s3 = new Student("Liam", "White", "Male", 1002);

        System.out.println(s1);
        System.out.println("s1 equals s2: " + s1.equals(s2));
        System.out.println("s1 equals s3: " + s1.equals(s3));

        System.out.println();

        // --- PhdStudent ---
        String[] phd1Courses = {"Research Methods", "Advanced Algorithms"};
        String[] phd2Courses = {"Research Methods", "Advanced Algorithms"};
        PhdStudent phd1 = new PhdStudent("Olivia", "Green", "Female", 2001, "Computer Science", phd1Courses);
        PhdStudent phd2 = new PhdStudent("Olivia", "Green", "Female", 2001, "Computer Science", phd2Courses);
        PhdStudent phd3 = new PhdStudent("Noah", "Black", "Male", 2002, "Mathematics", new String[]{"Topology"});

        System.out.println(phd1);
        System.out.println("phd1 equals phd2: " + phd1.equals(phd2));
        System.out.println("phd1 equals phd3: " + phd1.equals(phd3));

        // --- Setters test ---
        System.out.println();
        p3.setFirstName("Robert");
        p3.setLastName("Johnson");
        System.out.println("Updated person: " + p3);

        t3.setDepartment("Music");
        System.out.println("Updated teacher: " + t3);

        s3.setStudentId(9999);
        System.out.println("Updated student: " + s3);

        phd3.setDepartment("Physics");
        System.out.println("Updated PhD student: " + phd3);
    }
}
