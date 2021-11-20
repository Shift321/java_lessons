
import java.util.*;

public class Xornot {
    public static boolean run() {
        Scanner input = new Scanner(System.in);
        String str = input.nextLine();
        for (int i = 0; i < str.length() - 1; i++) {
            if (str.charAt(i) == 'x' && str.charAt(i++) == 'x') {
                input.close();
                return true;
            }

        }
        input.close();
        return false;

    }

}
