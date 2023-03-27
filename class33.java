public class class33 {
    public static void main(String[] args) {
        int[] numbers = {1,2,3,4,5};
        int target = 3;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i]==target) {
                System.out.println("Found target at index " + i);
                break;
            }
        }
        System.out.println("Done");
    }
}
