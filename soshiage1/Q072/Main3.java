public class Main3 {
    public static void main(String[] args) {
        int a = 10;
        //��u�C���N�������g�̏ꍇ�A�O�p���Z�q�ł�11�ɂȂ��Ă��܂��B
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