package day06_ShortHand_LogicalOperatores;

public class LogicalOperators {

    public static void main(String[] args) {

        // Opposite Logic !

        boolean result1 = true;
        System.out.println(!result1);

        boolean result2 = !(10 + 15 > 15);
        System.out.println(result2);

        boolean result3 = !true == !false;
                //         false == true  ===> false
        System.out.println(result3);



        // AND Logic  &&

        boolean R1 = "Corona Virus" != "End of the World" && "Toilet Paper" == "cure";
        //                        True      &&      False   ===> false
        System.out.println(R1);

        boolean R2 = 10 > 15 && 15 < 13;
        //          false   &&  false   ===> false
        System.out.println(R2);

        boolean R3 = 'a' == 'b'-1 && 'b'+1 == 'c';
        //          97 == 98-1  && 98+1 == 99
        //              true    &&  True    ===> true
        System.out.println(R3);



        // OR Logic  ||

        boolean R4 = true != false || false == !true;
            //          true        ||      true    ===>    true
        System.out.println(R4);

        boolean R5 = true != false && !false == !true;
            //          true        &&      false   ===>    false
        System.out.println(R5);

        boolean R6 = !!!false;
                //  !!true
                //  !false
                //  true
        System.out.println(R6);

        boolean R7 = !!!!false;
                 //  !!!true
                 //  !!false
                 //  !true
                 //  false
        System.out.println(R7);



    }

}
