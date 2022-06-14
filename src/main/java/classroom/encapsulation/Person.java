package classroom.encapsulation;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString()
public class Person {

    protected String name = "John";
    protected String lastname = "Doe";
    // Class, Package, Subclass
    private boolean hasMood;
}
