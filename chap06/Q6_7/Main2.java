class Main2 {
  public static void main(String[] args) {
    Sample.num = 10;
    Sample s = new Sample();
    Sample s2 = new Sample();
    s.num += 10;
    System.out.println("L6_Sample.num: " + Sample.num);
    System.out.println("L6_s.num: " + s.num);
    System.out.println("L6_s2.num: " + s2.num);
    s2.num = 30;
    System.out.println("L10: " + Sample.num);
  }
}
