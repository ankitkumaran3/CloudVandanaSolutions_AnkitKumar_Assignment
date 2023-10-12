import java.util.Random;

public class Task1{
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6, 7};      
        Random random = new Random();
        for (int i = array.length - 1; i > 0; i--) {
            int index = random.nextInt(i + 1);
            int temp = array[i];
            array[i] = array[index];
            array[index] = temp;
        }

        
        System.out.print("Shuffled Array: ");
        for (int num : array) {
            System.out.print(num + " ");
        }
    }
}
