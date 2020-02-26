public class TestPerson {

    public static void main(String[] args) {

        Student student1 = new Student("Mike","Somewhere 12", "CS", 2019, 5000.0);
        Student student2 = new Student("Homer","Somewhere 13", "CS", 2019, 5000.0);
        Student student3 = new Student("Min","Somewhere 17", "CS", 2019, 5000.0);


        System.out.println(student1.toString());
        System.out.println(student2.toString());
        System.out.println(student3.toString());

        student1.setFee(4500.0);
        student1.setProgram("art");
        student1.setYear(2020);

        System.out.println(student1.getFee());
        System.out.println(student1.getProgram());
        System.out.println(student3.getYear());

        Staff staff1 = new Staff("Mr Smith","Matrix 2","VR",500.0);
        Staff staff2 = new Staff("Mr None","Not here 1","VR",500.0);

        System.out.println(staff1.toString());

        staff2.setPay(5000.0);
        staff2.setSchool("Oxford");

        System.out.println(staff2.getPay());
        System.out.println(staff2.getSchool());

    }


}
