public class Student {
    private int ID;
    private Student name;

    public Student(int ID, Student name) {
        this.ID = ID;
        this.name = name;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public Student getName() {
        return name;
    }

    public void setName(Student name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student{" +
                "ID=" + ID +
                ", name=" + name +
                '}';
    }
}
