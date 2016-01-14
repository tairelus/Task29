package bjs.task29;

import java.util.regex.*;

/**
 * Created by YM on 14.01.2016.
 */
public class RegexTest {

    /**
     * Checks user name with regular expression
     * User name length must be >= 4 and <= 16.
     * User name must contain only latin characters, numbers, and underscore character
     * @return True if user name is valid.
     */
    public static boolean checkUserNameRegex(String name) {
        Pattern pattern = Pattern.compile("\\w{4,16}");
        return pattern.matcher(name).find();
    }

    /**
     * Checks user name with without regular expressions
     * User name length must be >= 4 and <= 16.
     * User name must contain only latin characters, numbers, and underscore character
     * @return True if user name is valid.
     */
    public static boolean checkUserNameNative(String name) {
        final String validCharacters = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ_abcdefghijklmnopqrstuvwxyz";
        int nameLength = name.length();

        if (nameLength < 4 || nameLength > 16) {
            return false;
        }

        for (int i = 0; i < nameLength; i++) {
            Character name_char = name.charAt(i);
            if (!validCharacters.contains(name_char.toString())) {
                return false;
            }
        }

        return true;
    }
}
