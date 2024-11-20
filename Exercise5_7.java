public class Exercise5_7 {
    public static void main(String[] args) {
        //DECLARE variables 
        int tuition = 10000;
        int totalCost = 0;
        int tuitionTenthYear = 0;

        //Increase tuition boy 5% for each year
        for (int year = 1; year <= 14; year++) {
            tuition += (tuition * 0.05);

            //Determine the total price of 4 years of tuition once 10 years have passed
            if (year > 10)
                totalCost += tuition;

            //CALCULATE tuition in 10 years
            if (year == 10)
                tuitionTenthYear = tuition;
        }
        //DISPLAYTEXT tuition price in 10 years
        System.out.println("Tuition in ten years: $" + tuitionTenthYear);
        //DISPLAYTEXT price for four years of tuition after the tenth year
        System.out.println("Total cost for four years worth of tuition after the tenth year: $" + totalCost);
    }
}
