package day35_Static;

import java.util.ArrayList;
import java.util.Arrays;

public class MyOffers {
    /*
    create a class called MyOffers
        Create 5 offer objects, and add them into the list of offers, and then:
            1. use for loop to print out the info of each offer
            2. write a program that can only retain the offers if:
                    1. the offer is for fulltime position
                    2. offer is from your local area
                    3. salary is greater than 100K
     */
    public static void main(String[] args) {

        Offer offer1 = new Offer();
        offer1.setOfferInfo("VA", "BOA", 100000, true);

        Offer offer2 = new Offer();
        offer2.setOfferInfo("MD", "Capital One", 110000, false);

        Offer offer3 = new Offer();
        offer3.setOfferInfo("CA", "Apple", 95000, true);

        Offer offer4 = new Offer();
        offer4.setOfferInfo("BayArea", "Google", 115000, false);


        Offer[] offers = {offer1, offer2, offer3, offer4};

        String myLocation = "VA";

        ArrayList<Offer> Accept = new ArrayList<>(Arrays.asList(offers));
        // Accept.removeIf(each -> each.salary<100000 || !each.isFullTime || !each.location.equals(myLocation));
        Accept.removeIf(each -> each.salary<100000);
        Accept.removeIf(each -> each.isFullTime==false);
        Accept.removeIf(each -> !each.location.equals(myLocation));

        System.out.println(Accept.size());

        for (Offer eachOffer : Accept){
            System.out.println(eachOffer);
        }






    }






}
