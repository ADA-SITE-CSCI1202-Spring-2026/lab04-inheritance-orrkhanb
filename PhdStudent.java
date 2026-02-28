public class PhdStudent extends Student {
    private String department;
    private String[] courses;

    public PhdStudent() {
        super();
        this.department = "";
        this.courses = new String[0];
    }

    public PhdStudent(String firstName, String lastName, String gender, int studentId, String department, String[] courses) {
        super(firstName, lastName, gender, studentId);
        this.department = department;
        this.courses = courses;
    }

    public String getDepartment() { return department; }
    public void setDepartment(String department) { this.department = department; }

    public String[] getCourses() { return courses; }
    public void setCourses(String[] courses) { this.courses = courses; }

    public boolean equals(PhdStudent pStud) {
        if (!super.equals(pStud)) return false;
        if (!this.department.equals(pStud.department)) return false;
        if (this.courses.length != pStud.courses.length) return false;
        for (int i = 0; i < this.courses.length; i++) {
            if (!this.courses[i].equals(pStud.courses[i])) return false;
        }
        return true;
    }

    @Override
    public String toString() {
        String courseList = "";
        for (int i = 0; i < courses.length; i++) {
            if (i > 0) courseList += ", ";
            courseList += courses[i];
        }
        return "PhdStudent{firstName='" + getFirstName() + "', lastName='" + getLastName() +
               "', gender='" + getGender() + "', studentId=" + getStudentId() +
               ", department='" + department + "', courses=[" + courseList + "]}";
    }
}
