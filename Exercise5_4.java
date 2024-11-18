public class Exercise5_4 {
    public static void main(String[] args) {
        //DECLAREOBJECT kilometers in a mile
        final double KILOMETERS_IN_MILE = 1.607;
        //DISPLAYTEXT first line in the output
        System.out.println("Miles       Kilometers");
        //CALCULATEANDRETURN the total number of kilometers that are in a mile, up to 10 miles, printing the result
        for (int i = 1; i <= 10; i++) {
            System.out.printf(
                "%-13d%-10.3f\n", i, (i * KILOMETERS_IN_MILE));
        }
    }
}
