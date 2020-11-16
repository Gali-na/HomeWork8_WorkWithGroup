import java.io.*;

public class Faculty {

    public static void savingGroupToDatabase(Group group) {
        try (ObjectOutputStream write = new ObjectOutputStream(new FileOutputStream(group.getNameGroup()))) {
            write.writeObject(group);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static Group getGroupDatabase(String nameGroup) {
        Group group = new Group();
        try (ObjectInputStream read = new ObjectInputStream(new FileInputStream(nameGroup))) {
            group = (Group) read.readObject();
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        return group;
    }
}
