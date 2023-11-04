public class MethodObject1 {
    public static int simpleInterest(int  p, int  r, int t){
        int result = (p*r*t)/100;
        return result;
      }
      public static void main(String args[]){
        MethodObject1 O1 = new MethodObject1();
        int simpleInterest = O1.simpleInterest(100000, 5, 5);
        System.out.println("The Simple Interest is:"+" " + simpleInterest);
      }
    }
