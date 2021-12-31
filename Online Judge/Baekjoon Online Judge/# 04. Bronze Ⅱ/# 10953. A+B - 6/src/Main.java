import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();

        String input;

        while (T>0) { // 반복 횟수만큼 입력을 받고, 결과를 출력
            input = br.readLine();
            int a = input.charAt(0)- '0';
            int b = input.charAt(2)- '0';
            sb.append(a+b).append('\n');
            T--;
        }
        br.close();
        System.out.println(sb);
    }
}
