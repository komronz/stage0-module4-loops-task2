package school.mjc.stage0.loops.task2;

public class FactorialNumbers {
    public void printFactorialRow(int printToInclusive) {
        int counter = 0;
        int answer = 1;
        if (printToInclusive > 0) {
            while (counter <= printToInclusive) {
                if(counter == 0){
                     answer = 1;}else {
                    answer *= counter;
                }
                counter++;
                System.out.println(answer);

            }


        } else if (printToInclusive == 0) {
            System.out.println(1);
        } else {
            System.out.println("wrong");
        }

    }
}
