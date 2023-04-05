public class class41 {
    public static void main(String[] args) {
        int [] arr = new int[10];

        for (int i = 0; i< arr.length; i++) {
            arr[i] = i;
        }

        for (int i =0; i < arr.length; i++) {
            System.out.println("arr[" + i + "] = " + arr[i]);
        }

        System.out.println("배열의 총 길이는 = " + arr.length);
    }
}
