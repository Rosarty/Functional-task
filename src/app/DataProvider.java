package app;

import java.util.Arrays;
import java.util.List;

public class DataProvider {
    public List<User> getData() {
        return Arrays.asList(
                new User("Bill", "+380-672-349-321"),
                new User("Roman", "+380-652-346-647"),
                new User("Micha", "+380-973-346-456"),
                new User("Artem", "+380-903-456-589"),
                new User("Artur", "+380-934-204-580")
        );
    }
}
