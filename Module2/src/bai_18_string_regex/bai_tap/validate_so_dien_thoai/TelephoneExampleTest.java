package bai_18_string_regex.bai_tap.validate_so_dien_thoai;


public class TelephoneExampleTest {
    public static final String[] telephones = new String[] { "(84)-(0978489648)", "(80)-(0978364865)", "(a4)-(1978489648)",  "(84)-(1978489648)", "(a8)-(22222222)"};

    public static void main(String[] args) {
        TelephoneExample telephoneExample = new TelephoneExample();
        for (String telephone : telephones) {
            boolean isValid = telephoneExample.validate(telephone);
            System.out.println("telephone is " + telephone +" is valid: "+ isValid);
        }
    }
}
