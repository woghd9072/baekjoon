import java.io.*;

public class no15552 {
    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        try {
            int n = Integer.parseInt(br.readLine());
            for (int i = 0; i < n; i++) {
                String st[] = br.readLine().split(" ");
                bw.write(Integer.parseInt(st[0]) + Integer.parseInt(st[1]) + "\n");
            }
            bw.flush();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
