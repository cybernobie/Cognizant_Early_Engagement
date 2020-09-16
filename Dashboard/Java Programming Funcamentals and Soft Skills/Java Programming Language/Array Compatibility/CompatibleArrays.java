import java.util.Scanner;

class CompatibleArrays {
    private static void test(int size) {
        if (size <= 0) {
            System.out.println("Invalid array size");
            System.exit(0);
        }
    }

    private static boolean isCompatible(int[] arr1, int[] arr2) {
        if (arr1.length != arr2.length) {
            return false;
        }

        for (int i = 0; i < arr1.length; ++i) {
            if (arr1[i] < arr2[i]) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int m, n;
        int[] arr1, arr2;

        System.out.println("Enter the size for First array:");
        m = scanner.nextInt();
        test(m);
        arr1 = new int[m];

        System.out.println("Enter the elements for First array:");

        for (int i = 0; i < m; ++i) {
            arr1[i] = scanner.nextInt();
        }

        System.out.println("Enter the size for Second array:");
        n = scanner.nextInt();
        test(n);
        arr2 = new int[n];

        System.out.println("Enter the elements for Second array:");

        for (int j = 0; j < n; ++j) {
            arr2[j] = scanner.nextInt();
        }

        if (isCompatible(arr1, arr2)) {
            System.out.println("Arrays are Compatible");
        } else {
            System.out.println("Arrays are Not Compatible");
        }
    }
}
