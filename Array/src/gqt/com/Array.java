package gqt.com;
public class ArrayExample {
    public static void main(String[] args) {
        // Question: What is the array we are working with?
        int[] numbers = {10, 20, 5, 30, 15};

        // Question: How do we find the maximum and minimum values in the array?
        int max = numbers[0];  // Assume first element is max initially
        int min = numbers[0];  // Assume first element is min initially
        int sum = 0;           // Variable to store sum of elements

        // Loop through each number in the array
        for (int num : numbers) {
            // Question: How do we update the max value if current number is greater?
            if (num > max) {
                max = num;
            }
            // Question: How do we update the min value if current number is smaller?
            if (num < min) {
                min = num;
            }
            // Question: How do we calculate the sum of all array elements?
            sum += num;
        }

        // Question: How to calculate the average of the array elements?
        double average = (double) sum / numbers.length;

        // Question: How do we print all the elements of the array?
        System.out.println("Array elements: ");
        for (int num : numbers) {
            System.out.print(num + " ");
        }
        System.out.println();

        // Print the results
        System.out.println("Maximum value: " + max);
        System.out.println("Minimum value: " + min);
        System.out.println("Sum: " + sum);
        System.out.println("Average: " + average);
    }
}
