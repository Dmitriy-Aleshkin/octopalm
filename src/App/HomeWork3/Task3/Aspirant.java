package App.HomeWork3.Task3;

public class Aspirant extends Student{

    public Aspirant(String firstName, String lastName, String Group, double averageMark) {
        super(firstName, lastName, Group, averageMark);
    }

    @Override
    public void getScholarship() {
        if (averageMark == 5) {
            Scholarship = 200;
        } else if (averageMark != 5) {
            Scholarship = 180;
        }
        System.out.println(lastName + " " + firstName + " "
                + "из группы " + Group
                + " получает стипендию в размере " + Scholarship + " тугриков");
    }
}
