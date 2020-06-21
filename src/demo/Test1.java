package demo;


import java.io.*;

public class Test1 {
    public static void main(String[] args) {
//Test1.testFileInputStream();
//Test1.testFileOutputStream();
//Test1.copy("C:/Users/xp/Desktop/git命令.txt","C:/Users/xp/Desktop/1.txt");
//    Test1.testFileReader("C:/Users/xp/Desktop/git命令.txt");
        try {
            Test1.testInputStreamReader();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /*
     * 文件字节输入流*/
    public static void testFileInputStream() {
        try {
            FileInputStream f = new FileInputStream("C:/Users/xp/Desktop/git命令.txt");
            byte[] b = new byte[10];//接收读取内容
            int len = 0;//设置读取数据长度
            while ((len = f.read(b)) != -1) {
                System.out.println(new String(b, 0, len));
            }

            f.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    /*
     * 文件字节输出流*/
    public static void testFileOutputStream() {
        try {
            FileOutputStream fo = new FileOutputStream("C:/Users/xp/Desktop/1.txt");
            String str = "dsajdkhasd";
            fo.write(str.getBytes());
            fo.flush();
            fo.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void copy(String InPath, String OutPath) {
        try {
            FileInputStream f = new FileInputStream(InPath);
            FileOutputStream fo = new FileOutputStream(OutPath);
            byte[] b = new byte[10];//接收读取内容
            int len = 0;//设置读取数据长度
            while ((len = f.read(b)) != -1) {
                fo.write(b, 0, len);
                //System.out.println(new String(b,0,len));
            }
            fo.flush();
            fo.close();
            f.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void testFileReader(String InPath) {
        try {
            FileReader fr = new FileReader(InPath);
            char[] c = new char[100];
            int len = 0;//设置读取数据长度
            while ((len = fr.read(c)) != -1) {

                System.out.println(new String(c, 0, len));
            }
            fr.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void testInputStreamReader() throws Exception {
        FileInputStream fs = new FileInputStream("C:/Users/xp/Desktop/git命令.txt");
        InputStreamReader in = new InputStreamReader(fs, "GBK");
        char[] c = new char[100];
        int len = 0;
        while ((len = in.read(c)) != -1) {
            System.out.println(new String(c, 0, len));
        }
        in.close();
        fs.close();
    }
}
