public class newmew {
    public static void main(String args[]) {
        int array[] = { 10, 20, 4, 5, 79, 20, 22, 4, 6, 8 };
        Sort sort = new Sort();
        int array1[] = sort.sortAscending(array);
        for (int i = 0; i < array1.length; i++) {
            System.out.print(array1[i] + " ");
        }
        System.out.println();
        String array2[] = { "ram", "abdul", "hari", "nath", "keshab", "shrestha" };
        String array3[] = sort.sortAscending(array2);
        for (int i = 0; i < array3.length; i++) {
            System.out.print(array3[i] + " ");
        }
    }
}
