import java.io.Serializable;
import java.util.Arrays;

public class Group implements Serializable {
    private Student[] group = new Student[10];
    private String nameGroup;

    public Group(Student[] group, String nameGroup) {
        this.group = group;
        this.nameGroup = nameGroup;
    }

    public Group(String nameGroup) {

        this.nameGroup = nameGroup;
    }

    public Group() {

    }

    public void addStudent(Student student) {
        for (int i = 0; i < this.group.length; i++) {
            if (this.group[i] == null) {
                this.group[i] = student;
                return;
            }
        }
        System.out.println("Exceeded the maximum number of students");
    }

    public Student[] getGroup() {
        return group;
    }

    public void setGroup(Student[] group) {
        this.group = group;
    }

    public String getNameGroup() {
        return nameGroup;
    }

    public void setNameGroup(String nameGroup) {
        this.nameGroup = nameGroup;
    }

    @Override
    public String toString() {
        return "Group{" +
                "group=" + Arrays.toString(group) +
                ", nameGroup='" + nameGroup + '\'' +
                '}';
    }
}
