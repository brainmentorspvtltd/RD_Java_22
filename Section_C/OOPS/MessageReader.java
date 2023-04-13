// package OOPS;

import java.util.ResourceBundle;

public class MessageReader {
    ResourceBundle rb;
    MessageReader() {
        rb = ResourceBundle.getBundle("config");
    }
    public String getValue(String key) {
        return rb.getString(key);
    }
}
