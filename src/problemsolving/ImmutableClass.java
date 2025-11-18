package problemsolving;
import java.util.Date;
public class ImmutableClass {
    private final String name;
    private final Date birthDate;  // Date is mutable!

    public ImmutableClass(String name, Date birthDate) {
        this.name = name;
        this.birthDate = birthDate; // ❌ directly assigning external object
    }

    public String getName() {
            return name;
        }

        public Date getBirthDate() {
            return birthDate; // ❌ returning internal mutable object
        }

        public static void main(String[] args) {
            Date d = new Date();
            ImmutableClass p = new ImmutableClass("Rimjhim", d);
            System.out.println(p.getBirthDate()); // original date

            // external modification
            d.setTime(300000000); // modifies the same Date object!
            System.out.println(p.getBirthDate()); // ❌ internal state changed!
        }
    }

