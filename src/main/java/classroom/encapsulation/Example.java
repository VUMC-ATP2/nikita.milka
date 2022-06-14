package classroom.encapsulation;

public class Example {
    public static void main(String[] args) {

        Student nikita = new Student("nikita.milka");
        System.out.println(nikita.getMail());

        nikita.setMail("nmilka@lu.lv");
        nikita.setName("Nikita");
        nikita.setLastname("Milka");
        nikita.setHasMood(true);
        System.out.println(nikita);

        Student zana = new Student();
        System.out.println(zana.getMail());
        zana.setMail("zanna@lu.lv");

        zana.setMail("zanna@lu.lv");
        // mail = @lu.lv
        System.out.println("Zana email: " + zana.getMail());
        zana.setMail("zanna@lu.lv");
        System.out.println("Zana email: " + zana.getMail());
        zana.setMail("zanna2@lu.lv");

        zana.setGraduationYear(2023);
        System.out.println(zana.getGraduationYear());
        zana.setGraduationYear(2020);
        System.out.println(zana.getGraduationYear());
    }
}
