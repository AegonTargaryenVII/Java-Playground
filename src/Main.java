import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println(convertToTitle(3647

        ));

    }



    public static String convertToTitle(int columnNumber) {
        StringBuilder sb = new StringBuilder();
        Stack<Integer> s = new Stack<>();


        while(columnNumber>0) {
            int div = columnNumber/26;
            int car = columnNumber%26;
        if(car!=0){
            s.push(car+64);
            columnNumber-=car;
        }else{
            if (div>26){
columnNumber=div;
continue;
            }else{
                s.push(div+64);
                columnNumber-= 26 * div;
            }
        }
        }

        for(int i : s){
            sb.append((char) i);
        }

        return sb.reverse().toString();
    }


    public static boolean isPalindrome(String s) {
        s = s.replaceAll("\\s|[^a-zA-Z0-9]", "").toLowerCase();
        char[] sc = s.toCharArray();
        int i = 0;
        int j = s.toCharArray().length - 1;
        for (char a : s.toCharArray()) {
            if (sc[i] == sc[j]) {
                i++;
                j--;
                continue;
            } else {

                return false;
            }
        }
        return true;
    }
}