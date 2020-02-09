import java.util.Scanner; // Keyboard import

public class SumNumbers
{
   public long numbers(int a, int b)
   {
      long answer = 0; 
      
      if(a < b) // sum of range a to b
      {
         for(int i=a; i<=b; i++)
         {
            answer += i;
         }
      }
      else if(a > b) // sum of range b to a
      {
         for(int i=b; i<=a; i++)
         {
            answer += i;
         }
      }
      else
      {
         answer = a; // same number results same
      }
      
      return answer;
   }
   public static void main(String[] args)
   {
      Scanner kb = new Scanner(System.in);
      SumNumbers test = new SumNumbers();
      int a, b;
      System.out.print("a = "); 
      a = kb.nextInt(); // a value
      System.out.print("b = ");
      b = kb.nextInt(); // b value
      System.out.print(test.numbers(a,b)); //Calculate sum of all numbers between a and b
   }
}