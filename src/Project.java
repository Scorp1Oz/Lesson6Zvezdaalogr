import java.util.Random;
public class Project {


        public static void main(String[] args) {

            int randomNumber = generateRandomNumber(11, 100011);

            System.out.println("Випадкове число: " + randomNumber);

            int sum = calculateDigitSum(randomNumber);

            System.out.println("Сума розрядів числа: " + sum);
        }

        public static int generateRandomNumber(int min, int max) {
            Random random = new Random();
            return random.nextInt(max - min + 1) + min;
        }

        public static int calculateDigitSum(int number) {
            int sum = 0;
            while (number != 0) {
                sum += number % 10;
                number /= 10;
            }
            return sum;
        }
}

