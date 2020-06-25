class Main2 {
    public static void main(String[] args) {
        Main2 m2 = new Main2();
        System.out.println(m2.calc(2, 3));
    }

    private double calc(double a, int b){
        return (a + b) / 2;
    }

/*
    private double calc(int a, double b){
        return (a + b) / 2;
    }
*/
}
