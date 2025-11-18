package encapsulation;

import java.util.Collections;
import java.util.Comparator;

public class CustomInfoComparator implements Comparator<CustomerInfo> {

    @Override
    public int compare(CustomerInfo o1, CustomerInfo o2) {
        Collections.sort(null, new CustomInfoComparator());
        Collections.sort(null);

        return 0;
    }


}
