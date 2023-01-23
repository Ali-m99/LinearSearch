public class Main {
    public static void main(String[] args) {

        //Linear Search = Iterate through a collection one element at a time

        int[] array = {99, 8, 9, 13, 15, 18, 87};

        int index = linearSearch(array, 13);

        if (index != -1){
            System.out.println("Element found at index: " + index);
        }
        else{
            System.out.println("Element not found");
        }

    }

    static int linearSearch(int[] array, int value) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == value) {
                return i;
            }
        }
        return -1;
    }

}