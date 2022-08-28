class Flower {
  private String name;
  private String symbolism;
  private int many;

  Flower(String name, String symbolism, int many) {
    this.name = name;
    this.symbolism = symbolism;
    this.many = many;
  }
  public void getprintData() {
    System.out.println("名前：" + this.name);
System.out.println("花言葉：" + this.symbolism);
    System.out.println("金額：" + this.many + "円");
    }
  // このクラスのメソッドには不適切かも
  public void printBuy(int number) {
    System.out.println(number + "本購入で合計" + number * this.many + "円です");
  }
  public void printColor() {
    System.out.println("色を入れる");
  }
}