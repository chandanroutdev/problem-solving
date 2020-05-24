package Array._3;

class IntersectionOfThreeSortedArrays {
    public static void intersectionOfThreeArrays(int arr1[], int arr2[], int arr3[]) {
        int x = 0, y = 0, z = 0;
        while (x < arr1.length && y < arr2.length && z < arr3.length) {
            if (arr1[x] == arr2[y] && arr2[y] == arr3[z]) {
                System.out.print(arr1[x] + " ");
                x++;
                y++;
                z++;
            } else if (arr1[x] < arr2[y]) {
                x++;
            } else if (arr2[y] < arr3[z]) {
                y++;
            } else {
                z++;
            }
        }
    }

    public static void main(String args[]) {
        int arr1[] = { 2, 5, 6, 8, 9 };
        int arr2[] = { 2, 3, 5, 8, 10 };
        int arr3[] = { 2, 6, 7, 8 };
        intersectionOfThreeArrays(arr1, arr2, arr3);
    }
}

// credit: https://youtu.be/rUPdTNmKa6A?list=PLlhM4lkb2sEhfuXL-2BDrJ67WkUdQ2v9b

// practice : https://practice.geeksforgeeks.org/problems/common-elements/0