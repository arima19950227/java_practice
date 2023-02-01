import java.util.Scanner;

class Name {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("名前:");
    String firstname=scanner.next();
    System.out.print("名字:");
    String lastName=scanner.next();
    System.out.print("年齢:");
    int age=scanner.nextInt();
    String name=firstname+""+lastName;
    System.out.println("名前は"+name+"です");
    System.out.println("年齢は"+age+"です");
    if(age>=20){
      System.out.println("成年者です");
    }else{
      System.out.println("未成年者です");
    }
  }
}