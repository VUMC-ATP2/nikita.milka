package classroom.encapsulation;

import lombok.*;

import java.time.Year;

@ToString(callSuper = true)
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Student extends Person {

    private final String MAIL_DOMAIN = "@lu.lv";
    @Getter
    public int graduationYear;
    @Getter
    private String mail = "";

    public Student(String accountName) {
        mail = accountName + MAIL_DOMAIN;
    }

    public void setMail(String mail) {
        if (this.mail.equals("@lu.lv") || mail.equals("")) {
            this.mail = mail;
        } else {
            System.out.printf("Your e-mail is: %s which is correct one, and it will be not changed\n", this.mail);
        }
    }

    public void setGraduationYear(int graduationYear) {
        int currentYear = Year.now().getValue();
        if (graduationYear > currentYear) {
            System.out.println("Value cannot be set! Current year: " + currentYear);
        } else {
            this.graduationYear = graduationYear;
        }
    }

    // Create getter / setter for graduationYear
    // if graduationYear is > 2022, then print message that Value cannot be set!
    // Example class -> set graduation year to 2020, get it and print it
    // Set graduation year 2023;

}
