package Array._1;

/*  APPROACH 1 (Using sum)
class MissingNumberInArray {
    public static void main(String args[]) {
        int arr[] = { 1, 2, 3, 4, 6 };
        int expectedLen = arr.length + 1;
        int totalSum = (expectedLen * (expectedLen + 1)) / 2;
        int sum = 0;
        for (int num : arr) {
            sum += num;
        }
        System.out.println("Missing number is : " + (totalSum - sum));
    }
}
*/

// APPROACH 2 (Using XOR)
class MissingNumberInArray {
    public static void main(String args[]) {
        int arr[] = { 1, 2, 3, 5, 6 };
        int xor1 = arr[0];
        for (int i = 1; i < arr.length; i++) {
            xor1 = xor1 ^ arr[i];
        }
        int xor2 = 1;
        for (int i = 2; i <= arr.length + 1; i++) {
            xor2 = xor2 ^ i;
        }
        System.out.println("Missing number is : " + (xor1 ^ xor2));
    }
}