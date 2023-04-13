// package OOPS;

import java.text.DateFormat;
import java.text.NumberFormat;
import java.util.Date;
import java.util.Locale;

public class EmpUtils {
    Locale locale;
    public EmpUtils() {
        locale = new Locale("en", "US");
    }
    public String salaryFormat(double salary) {
        NumberFormat nf = NumberFormat.getCurrencyInstance(locale);
        String sal = nf.format(salary);
        return sal;
    }

    public String dateFormat() {   
        Date date = new Date();
        DateFormat df = DateFormat.getDateInstance(DateFormat.SHORT, locale);
        String d = df.format(date);
        return d;
    }
}
