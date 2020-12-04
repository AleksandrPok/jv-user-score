package core.basesyntax;

import core.basesyntax.exception.UserNotFoundException;

public class UserService {

    public int getUserScore(String[] records, String email) {
        return findIndex(records, email);
    }

    private int findIndex(String[] records, String email) {
        for (String record : records) {
            if (record.contains(email) && !record.replace(email, "").isEmpty()) {
                return Integer.parseInt(record.substring(record.indexOf(":") + 1));
            }
        }
        throw new UserNotFoundException();
    }
}
