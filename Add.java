import java.util.Random;
class Add {
public static void main(String[] args) {
Random rand = new Random();
int a = rand.nextInt(100) + 1; 
int b = rand.nextInt(100) + 1;
int c = a + b;
System.out.println("The first random number is: " + a);
System.out.println("The second random number is: " + b);
System.out.println("The sum of two numbers is: " + c);
}
}
