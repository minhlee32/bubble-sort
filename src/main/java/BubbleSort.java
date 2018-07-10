public class BubbleSort {
    static int[] list = {10, 9, 8, 7, 3, 5, 6, 2, 0, 1};

    public static void main(String[] args) {
        printList(list);

        System.out.println("\nList after sorted:");
        sort(list);
    }

    private static void printList(int[] list) {
        for (int i = 0; i < list.length; i++) {
            System.out.print(list[i] + "\t");
        }
    }

    private static void sort(int[] list) {
        boolean nextPass = true;
        for (int i = list.length - 1; i > 0 && nextPass; i--) {
            nextPass = false;
            for (int j = 0; j < list.length-1; j++) {
                if (list[j] > list[j + 1]) {
                    int x = list[j];
                    list[j] = list[j + 1];
                    list[j + 1] = x;
                    nextPass = true;
                }
            }
            if (!nextPass) {
                break;
            }
        }
        System.out.println();
        printList(list);
    }
}