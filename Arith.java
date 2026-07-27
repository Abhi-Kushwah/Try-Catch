class Arith{
 public static void main(String[] args){

  int[] a={10,205,30,40};

  int[] b={1,2,0,4};

  for(int i=0;i<a.length;i++){

    System.out.println(divide(a[i], b[i]));
  }
  System.out.println("good Job");
 }

  public static int divide(int x,int y){

   try{
       return x/y;
    }catch(ArithmeticException e){
       System.out.println(e);
       return -1;
    } 
  }
}