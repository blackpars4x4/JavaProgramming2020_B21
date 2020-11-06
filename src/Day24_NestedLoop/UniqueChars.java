package Day24_NestedLoop;

public class UniqueChars {

    public static void main(String[] args) {

        /*
        3. write a program that can find the unique characters from a string
            Ex:
                 str = "AABCDC";
                 output:
                        BD
            approach:
    find the frequncy of each character one by one, and if the frequency of the character is equal to 1, it means it's unique
             In previous section we leaned how to find the frequency of one character. you will need to repeat the same steps

         */
        String str = "AABCCDEERFGG";

        for(int index = 0; index < str.length(); index++) { // index <= str.length() -1
            // purpose of this loop is to iterate through the char one at a time

            int frequency = 0; // resetting the value each iteration of the outer loop (first loop)

            // charAt(index)
            //      0 -> A
            //      1 -> A
            //      2 -> B

            for(int inner = 0; inner < str.length(); inner++) {

                // charAt(inner)
                //      0 -> A
                //      1 -> A
                //      2 -> B
                //      3 -> C
                //      4 -> C
                //      5 -> D

                if(str.charAt(index) == str.charAt(inner)) {
                    frequency++;
                }

                //  A == A  --> freq = 1
                //  A == A  --> freq = 2
                //  A == B
                //  A == C
                //  A == C
                //  A == D
                //  Freq = 2

            }

            if(frequency == 1) {
                System.out.print(str.charAt(index));
            }


        }

    }
}
