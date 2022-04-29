package _2_exercise;

public class Main {
    public static void main(String[] args) {
        Pair<String, Integer> pair1 = new Pair<>("key of pair 1", 10);
        Pair<Integer, String> pair2 = new Pair<>(20, "value of pair 2");
        Pair<String, String> pair3 = new Pair<>("key of pair 3", "value of pair 3");

        System.out.println("K1: " + pair1.getK());
        System.out.println("K2: " + pair2.getK());
        System.out.println("K3: " + pair3.getK());

        System.out.println("V1: " + pair1.getV());
        System.out.println("V2: " + pair2.getV());
        System.out.println("V3: " + pair3.getV());
    }
}
