import java.util.Scanner;
//file name should be as class name 
public class pra_4_1 {
    public static void main(String args[])
    {
        try{
            int arr[]={1,3,5,7};
            System.out.println(arr[7]);//array index out of bound
        }
        //catch block for the try 
        //thi catch block is for the arithmetick exception
        catch(ArithmeticException e){
            //printing the exception
            System.out.println(e);
            System.out.println("Arithmetic Exception caught");
        }
        catch(ArrayIndexOutOfBoundsException e)
        //this catch for array index out of bound
        {
            //printing the exception
            System.out.println(e);
            System.out.println("Array index out of bound Exception caught");
        }
        catch(Exception e)
        {
            //printing the exception
            System.out.println(e);
           
        }
        
    }
   
}
