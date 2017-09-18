/** Ex. 8.16: Huge Integer Class
 * Compares integers */

public class HugeInteger {

   int[] array = new int[40];

   // accepts a String and initializes the array of digits
   void parse(String str) {

      if (str.length() <= array.length) {

         while (str.length() < array.length) {
            str = '0' + str;
         }

         for (int i = 0; i < array.length; i++) {
            char aChar = str.charAt(i);
            int number = Integer.parseInt(String.valueOf(aChar));
            array[i] = number;
         }
      } else {

         System.out.println("Invalid number.");
         System.exit(0);
      }
   }

   // presents HugeInteger's content as a String
   public String toString() {

      String str = "";
      String zero = "0";

      for (int i = 0; i < array.length; i++)
         str = str.concat(String.valueOf(array[i]));

      if (isZero() == true)
         return zero;
      else
         return str.replaceAll("^0+", "");

   }

   // determines whether the stored value is zero
   public boolean isZero() {

      boolean allZeros = true;

      for (int i = 0; i < array.length; i++) {
         if (array[i] != 0) {
            allZeros = false;
            break;
         }
      }

      return allZeros;
   }

   // computes the sum of two integers
   HugeInteger add(HugeInteger newInteger) {
      HugeInteger sum = new HugeInteger();
      int number = 0;

      for (int i = array.length - 1; i >= 0; i--) {

         sum.array[i] = array[i] + newInteger.array[i] + number;
         if (sum.array[i] > 9 && i != 0) {
            sum.array[i] -= 10;
            number = 1;
         } else
            number = 0;
      }
      //determine if the result of addition causes an overflow
      for (int i = 0; i < sum.array.length; i++) {
         if (sum.array[i = 0] > 9) {
            for (int count = 0; count < sum.array.length; count++)
               sum.array[count] = 0;
         } else
            break;
      }
      return sum;

   }
   // finds a difference between two values
   HugeInteger subtract(HugeInteger newInteger){
      HugeInteger difference = new HugeInteger();
      int number1 = 10;
      int number2 = 0;

      if (isLessThan(newInteger)==true){
         for (int i = 0; i < difference.array.length; i++)
            difference.array[i] = 0;}
            else {
               for (int i = array.length - 1; i >= 0; i--){
                  if (array[i] >= newInteger.array[i]){
                     difference.array[i] = (array[i]-number2) - newInteger.array[i];
                     number2 = 0;}
                  else{
                     difference.array[i] = (array[i]-number2+number1) - newInteger.array[i];
                     number2 = 1;}


      }}
      return difference;     }


   public boolean isEqualTo(HugeInteger newInteger) {
      boolean equal = true;
      for (int i = 0; i < array.length; i++) {
         if (array[i] != newInteger.array[i])
            equal = false;  }
      return equal;
   }

   public boolean isNotEqualTo(HugeInteger newInteger) {
      boolean notEqual = false;
      if (!isEqualTo(newInteger))
          notEqual = true;
      return notEqual;
   }

   public boolean isGreaterThan(HugeInteger newInteger) {
      boolean greater = false;
      for (int i = 0; i < array.length; i++) {
         if (array[i] <= newInteger.array[i])
            greater = false;
         else {
            greater = true;
            break;  }}
      return greater;
   }

   public boolean isLessThan(HugeInteger newInteger) {
      boolean less = false;
      if (isNotEqualTo(newInteger) && !isGreaterThan(newInteger))
         less = true;
      return less;
   }

   public boolean isGreaterThanOrEqualTo(HugeInteger newInteger) {
      boolean greaterOrEqual = false;
      if (isEqualTo(newInteger) || isGreaterThan(newInteger))
        greaterOrEqual = true;
      return greaterOrEqual;
   }

   public boolean isLessThanOrEqualTo(HugeInteger newInteger) {
      boolean lessOrEqual = false;
      if (isEqualTo(newInteger) || isLessThan(newInteger))
         lessOrEqual = true;
      return lessOrEqual;
   }
}