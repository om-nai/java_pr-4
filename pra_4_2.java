//1
// import java.util.Scanner;
// 0public class prac_4_2{
//     public void Check_Odd(int n)
//     {
//         if(n%2!=0)//logic for odd and even number
//         {
//             //throw key word using at here
//          throw new ArithmeticException("Number entered is odd  number");
//         }
//         else{
//             System.out.println("Number entered is even number");
//         }

//     }
//     public static void main(String args[])
//     {
//         //main
//          prac_4_2 t=new prac_4_2 (); 
//          t.Check_Odd(7);
//          System.out.println("Rest code");
//         }
// }


//2
import java.util.Scanner;

public class pra_4_2 {
    public int Check_array(int [] array,int m) throws ArrayIndexOutOfBoundsException
    {
        int ans=array[m];
        return ans;
    }
    public static void main(String args[])
    {
        pra_4_2 t = new pra_4_2();
        try{
            int [] arr={1,2,3};
            System.out.println(t.Check_array(arr,5));
        }
        catch(ArrayIndexOutOfBoundsException e)
        {
            System.out.println(e);
            System.out.println("Caught in main");

        }
     }
}

