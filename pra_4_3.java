class prac_4_3 {
    public static void main(String[] args) {
      try {
        int array[] = new int[10];
        array[11] = 30 / 0;
      }//catch block for try
      catch (ArithmeticException e) {
        System.out.println(e);
      }
      catch (ArrayIndexOutOfBoundsException e) {
        System.out.println(e);
      }
      finally{
        System.out.println("21CE081");
      }
    }
  }
  
  