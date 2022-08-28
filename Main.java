import java.util.Scanner;
class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    Flower rose = new Rose();

    Flower casablanca = new Casablanca();

    Clerk clerk = new Clerk();
    
    rose.getprintData();
    clerk.print();
    int number = sc.nextInt();
    rose.printBuy(number);
    rose.printColor();
    
    // 以下同じ処理のため配列にして繰り返せないだろうか？
    casablanca.getprintData();
    clerk.print();
    int number2 = sc.nextInt();
    casablanca.printBuy(number);
  }
}