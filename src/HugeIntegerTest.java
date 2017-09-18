/**  HugeInteger class test
 */
import java.util.Scanner;

public class HugeIntegerTest {

      public static void main(String[] args)
      {
         Scanner input = new Scanner(System.in);

         HugeInteger myInteger = new HugeInteger();

         System.out.println("Please enter a positive integer (up to 40 digits): ");
         myInteger.parse(input.next());
         System.out.printf("The integer you entered is %s%n",myInteger.toString());

         System.out.println("Please enter another positive integer (up to 40 digits) to compare it with the first one:");
         HugeInteger comparedInteger=new HugeInteger();
         comparedInteger.parse(input.next());
         System.out.printf("%s is equal to %s:  %b%n", myInteger.toString(), comparedInteger.toString(), myInteger.isEqualTo(comparedInteger));
         System.out.printf("%s is not equal to %s:  %b%n", myInteger.toString(), comparedInteger.toString(), myInteger.isNotEqualTo(comparedInteger));
         System.out.printf("%s is greater than %s:  %b%n", myInteger.toString(), comparedInteger.toString(), myInteger.isGreaterThan(comparedInteger));
         System.out.printf("%s is less than %s:  %b%n", myInteger.toString(), comparedInteger.toString(), myInteger.isLessThan(comparedInteger));
         System.out.printf("%s is greater or equal to %s:  %b%n", myInteger.toString(), comparedInteger.toString(), myInteger.isGreaterThanOrEqualTo(comparedInteger));
         System.out.printf("%s is less or equal to %s:  %b%n", myInteger.toString(), comparedInteger.toString(), myInteger.isLessThanOrEqualTo(comparedInteger));

         System.out.println("Please enter another positive integer (up to 40 digits) to add to the first one:");
         HugeInteger addend=new HugeInteger();
         addend.parse(input.next());
         HugeInteger sum=myInteger.add(addend);
         System.out.printf("The sum of %s and %s is %s%n", myInteger.toString(), addend.toString(), sum.toString());

         System.out.println("Please enter another positive integer (up to 40 digits) to subtract from the first one:");
         HugeInteger subtrahend=new HugeInteger();
         subtrahend.parse(input.next());
         HugeInteger difference=myInteger.subtract(subtrahend);
         System.out.printf("The difference between %s and %s is %s%n", myInteger.toString(), subtrahend.toString(), difference.toString());

      }
   }


