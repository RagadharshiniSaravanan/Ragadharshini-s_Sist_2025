import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

class Result {

    /*
     * Complete the 'gameWithCells' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts following parameters:
     *  1. INTEGER n
     *  2. INTEGER m
     */

    public static int gameWithCells(int n, int m) {
        int counter = 0;
        int ncount = 0;
        if(m%2!=0)
        {
            counter = (m/2)+1;
        }else{
            counter = (m/2);
        }
        if (n>2 && n%2!=0)
        {
            ncount = (n/2) + 1;
            counter = counter * ncount;
        }else if(n>2 && n%2==0){
            ncount = n/2;
            counter = counter * ncount;
        }
        return counter;

        }

}

