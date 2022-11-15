public class Main {
    public static void main(String[] args) {
        LabClass lab = new LabClass(5);
        Student pierre = new Student("Pierre", "12345");
        lab.enrollStudent(pierre);
        Teacher jean = new Teacher ("M. Dupont", "123");
        lab.setInstructor(jean);
        lab.printList();
        println("login Pierre: " + pierre.getLoginName());
        println("login Jean: " + jean.getLoginName());

        pierre.addCredits(10);
        pierre.addCredits(20);
        pierre.addCredits(30);
        pierre.printCredits();

    }

    public static void println(String s) {
        System.out.println(s);
    }
}