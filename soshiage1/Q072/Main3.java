public class Main3 {
    public static void main(String[] args) {
        int a = 10;
        //後置インクリメントの場合、三角演算子では11になってしまう。
        a = (a++ <= 10) ? a++ : (a < 100) ? a-- : a--;
/*        if (a++ > 10) {
            if (a < 100) {
                a--;
            } else {
                a--;
            }
        } else {
            a++;
        }
*/
        System.out.println(a);
    }
}