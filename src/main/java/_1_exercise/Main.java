package _1_exercise;

public class Main {

    public static void main(String[] args) {
        Box boxWithoutRestrictions = new Box();
        boxWithoutRestrictions.setT("");
        boxWithoutRestrictions.setT(5);
        boxWithoutRestrictions.setT(true);

        Box<Integer> boxForIntegersOnly = new Box();

        boxForIntegersOnly.setT(10);

    }

}
