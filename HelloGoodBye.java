/* *****************************************************************************
 *  Name:              Ada Lovelace
 *  Coursera User ID:  123456
 *  Last modified:     October 16, 1842
 **************************************************************************** */

import java.util.Scanner;

public class HelloGoodBye {
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        String name1 = x.next();
        String name2 = x.next();
        System.out.println("Hello " + name1 + " and " + name2);
        System.out.println("Goodbye " + name2 + " and " + name1);
    }
}
