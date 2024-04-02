/*
 * 유저가 입력을 했을 때
 * 모든 경우의 수를 생각해서 반환
 * 가능한 요소 : String(항공편명)
 * 불가능한 요소 : 나머지 : double, char, ..
 */
import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.util.Scanner;

public interface User {
    Scanner scan = new Scanner(System.in);

    static String userInput() {
        return scan.next();
    }
    static String reserveInput(){
        String userTyped = userInput();
        System.out.format("User typed information %s for reservation",userTyped);
        return userTyped;
    }


}
