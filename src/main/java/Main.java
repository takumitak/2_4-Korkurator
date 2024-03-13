import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Podaj liczbę 1:");
    int a=scanner.nextInt();
    System.out.println("Podaj liczbę 2:");
    int b=scanner.nextInt();
    System.out.println("Podaj działanie, możliwości 1:+, 2:-, 3:*, 4:/");
    int dzialanie=scanner.nextInt();
    switch(dzialanie){
      case 1:
        System.out.println(a+b);
        break;
      case 2:
        System.out.println(a-b);
        break;
      case 3:
        System.out.println(a*b);
        break;
      case 4:
        System.out.println(a/b);
        break;
    }
  }
}