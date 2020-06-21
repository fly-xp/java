package demo;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.InputStreamReader;

public class Test2 {
    public static void main(String[] args) {
        try {
            Test2.testSystemIn();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void testSystemIn() throws Exception {
        InputStreamReader ir = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(ir);
        FileInputStream fs = new FileInputStream("C:/Users/xp/Desktop/git命令.txt");
        InputStreamReader in = new InputStreamReader(fs, "GBK");
        char[] c = new char[100];
        int len = in.read(c);
        String str = "";
        while ((str = br.readLine()) != null) {
            if (str.equals(new String(c, 0, in.read(c)))) {
                System.out.println(str);
            } else {
                //System.out.println(new String(c,0,in.read(c)));
                break;
            }
        }
        br.close();
        ir.close();
    }
}
