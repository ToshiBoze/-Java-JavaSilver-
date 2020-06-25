class Main {
  public static void main(String[] args) {
    sample:
    for (int i = 0; i < 10; i++){
        for (int j = 0; j < 10; j++){
            if (3 < j){
                break sample;
            }
        }
    }
    System.out.print("total");
  }
}
