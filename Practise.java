package Recursion;

/**
 * Practise
 */
public class Practise {

  public static void main(String[] args) {

    int r = 3;
    int c= 3;
    print("",r,c,0);

  }

  private static void print(String ans, int r, int c,int i) {
    if (r==2 && c==2) {
      System.out.println(ans);
      return;
      
    }
    if(i>r || i>c){
      return;
    }
    print(ans+"H", r, c, i++);
    print(ans+"V", r, c, i++);
   
  }

  
}