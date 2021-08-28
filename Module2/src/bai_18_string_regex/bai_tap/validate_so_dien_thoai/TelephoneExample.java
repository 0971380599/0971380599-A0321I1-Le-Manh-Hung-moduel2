package bai_18_string_regex.bai_tap.validate_so_dien_thoai;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TelephoneExample {
    private static Pattern pattern;
    private Matcher matcher;
    private static final String TELEPHONE_REGEX = "^[(][0-9]{2}[)][-][(][0][0-9]{9}[)]$";
    public TelephoneExample() {
        pattern = Pattern.compile(TELEPHONE_REGEX);
    }
    public boolean validate(String regex) {
        matcher = pattern.matcher(regex);
        return matcher.matches();
    }
}
