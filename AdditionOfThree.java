import java.util.Scanner;
class AdditionOfThree {
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
try{
System.out.println("Enter the 1st number:");
double n1 = sc.nextDouble();
System.out.println("Enter the 2nd number:");
double n2 = sc.nextDouble();
System.out.println("Enter the 3rd number:");
double n3 = sc.nextDouble();
double sum = n1+n2+n3;
System.out.println("The sum of three numbers is:" + sum);
}
catch(Exception e) {
System.out.println("Invalid input! Please enter valid numeric values.");
}
finally {
sc.close();
}
}
}