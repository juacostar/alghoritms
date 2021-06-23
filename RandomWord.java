import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;
import edu.princeton.cs.algs4.StdRandom;

/* *****************************************************************************
 *  Name:              Ada Lovelace
 *  Coursera User ID:  123456
 *  Last modified:     October 16, 1842
 **************************************************************************** */
public class RandomWord {
    public static void main(String[] args) {
        int aux = 2;
        while(!StdIn.isEmpty()){
            String word = StdIn.readString();
            double p = 1/aux;
            StdOut.println(StdRandom.bernoulli(p));
            aux +=1;
        }
    }
}
