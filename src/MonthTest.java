public class MonthTest {
    public static void main(String[] args) {
        for (Month month : Month.values()) {
            if ( month.toString().endsWith("Y") ) {
                System.out.println(month + " ends with Y");
            } else {
                System.out.println(month + " doesn't end with Y");
            }
        }
    }
}
