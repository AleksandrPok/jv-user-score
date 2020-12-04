package core.basesyntax;

import core.basesyntax.exception.UserNotFoundException;

public class UserService {

    public int getUserScore(String[] records, String email) {
        for (String record : records) {
            String[] devidedRecord = record.split(":");
            if (record.contains(email)
                    && !devidedRecord[1].isEmpty()
                    && !record.equals(email)) {
                return Integer.parseInt(devidedRecord[1]);
            }
        }
        throw new UserNotFoundException("UserNotFoundException: "
                + "User with given email doesn't exist");
    }
}
