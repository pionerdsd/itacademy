package by.test.service;

/**
 * Created by dmurashko on 23.03.2018.
 */
public class Parser {
    String val;

    public Parser(String val) {
        this.val = val;
    }

    public int checkVal() {
        if ((val.matches("^[0-9]{1,10}$"))) {
            return 0;
        }

        return -1;
    }
}
