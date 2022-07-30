package school.mjc.stage0.loops.task2;

public class PrimeNumbers {
    public void printPrimeNumbers(int printToInclusive) {
        int primes[]= {2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41 ,43, 47, 53 ,59 ,61 ,67, 71 ,73 ,79, 83, 89, 97};
        int counter = 0 ;
        while(primes[counter]<= printToInclusive){
            System.out.println(primes[counter]);
            counter++;
        }

    }
}
