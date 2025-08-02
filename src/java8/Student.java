package java8;

public class Student {
    Integer rollNo;
    String name;
    String department;
    Integer feesPerSemester;
    String grade;

    public Student(){}

    public Student(Integer rollNo, String name, String department, Integer feesPerSemester,String grade) {
        this.rollNo = rollNo;
        this.name = name;
        this.department = department;
        this.feesPerSemester = feesPerSemester;
        this.grade =  grade;
    }

    public Integer getRollNo() {
        return rollNo;
    }

    public void setRollNo(Integer rollNo) {
        this.rollNo = rollNo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public Integer getFeesPerSemester() {
        return feesPerSemester;
    }

    public void setFeesPerSemester(Integer feesPerSemester) {
        this.feesPerSemester = feesPerSemester;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    @Override
    public String toString() {
        return "Student{" +
                "rollNo=" + rollNo +
                ", name='" + name + '\'' +
                ", department='" + department + '\'' +
                ", feesPerSemester=" + feesPerSemester +
                ", grade='" + grade + '\'' +
                '}';
    }
}
