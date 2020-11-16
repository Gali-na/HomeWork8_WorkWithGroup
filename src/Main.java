public class Main {
    public static void main(String[] args) {

        Student student1 = new Student("Ivan", "Zolotarev", 18, 0);
        Student student2 = new Student("Sergey", "Ivanov", 19, 700);
        Student student3 = new Student("Olga", "Prohorova", 20, 500);
        Student student4 = new Student("Pavel", "Alrhin", 21, 700);
        Student student5 = new Student("Eaterina", "Andreeva", 25, 700);
        Student student6 = new Student("Mihail", "Beliy", 17, 500);
        Student student7 = new Student("Anton", "Panlov", 20, 0);
        Student student8 = new Student("Tatyna", "Koroleva", 22, 0);
        Student student9 = new Student("Victoiy", "Kotova", 21, 700);
        Student student10 = new Student("Pet", "Nikolayv", 18, 500);

        Group FMN18 = new Group("FMN18");
        Group KHN20 = new Group("KHN20");
        Group YNK19 = new Group("YNK19");

        FMN18.addStudent(student1);
        FMN18.addStudent(student2);
        FMN18.addStudent(student3);

        KHN20.addStudent(student4);
        KHN20.addStudent(student5);
        KHN20.addStudent(student6);

        YNK19.addStudent(student7);
        YNK19.addStudent(student8);
        YNK19.addStudent(student9);
        YNK19.addStudent(student10);

        Faculty.savingGroupToDatabase(FMN18);
        Faculty.savingGroupToDatabase(KHN20);
        Faculty.savingGroupToDatabase(YNK19);

        System.out.println((Faculty.getGroupDatabase("FMN18")).toString());
        System.out.println((Faculty.getGroupDatabase("YNK19")).toString());
        System.out.println((Faculty.getGroupDatabase("KHN20")).toString());
    }
}
