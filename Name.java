import java.util.Scanner;

class Name {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("名前:");
    String firstname=scanner.nextLine();
    System.out.println("名前は"+firstname+"です");
  }
}
