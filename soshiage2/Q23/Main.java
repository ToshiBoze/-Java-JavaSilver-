public class Main {
    public static void main(String[] args) {
        int num = 0;
        String[] array = {"A", "B", "C", "D"};
        for (String s : array) {
            switch(s) {
            case "D":
            case "A":
                num -= 1;
                break;
            case "B":
                num++;
            case "C":
                num +=2;
            }
        }
        System.out.println(num);
    }
}
