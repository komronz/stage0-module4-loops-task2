package school.mjc.stage0.loops.task2;

public class NaturalNumbers {
    public void naturalNumbersPrinter(int lastPrinted) {
        int counter = -1;
        while (counter < lastPrinted) {
            counter++;
            System.out.println(counter);
        }
    }
}
