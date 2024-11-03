public class censuscompute {
    public static void main(String[] args) {
        /* one birth every 7 seccs
        one death every 13 secs
        one immigrant every 45 secs
         */
        int cp = 312032486;
        int days=365;
        double popupin45secs=  (((1.0/7.0)*45)-((1.0/13.0)*45)+1);
        int dayinsecs=60*60*24;
        double popupin1day= (popupin45secs/45.0)*dayinsecs;
        int currentPopulation= cp;
        for (int year = 1; year <= 5; year++) {
            int popupInYear = (int) (popupin1day * days);
            currentPopulation += popupInYear;  // Update population for the year
            System.out.println("Population after year " + year + ": " + currentPopulation);
        }

        System.out.println("The population after 5 year is: "+(currentPopulation));
        System.out.println();
    }
}
