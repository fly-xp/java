package demo;

import java.io.RandomAccessFile;

public class Test4 {
    public static void main(String[] args) {
        try {
            // Test4.testRandomAccessFile();
            Test4.testRandomAccessFileWrite();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void testRandomAccessFile() throws Exception {
        RandomAccessFile ra = new RandomAccessFile("C:/Users/xp/Desktop/git命令.txt", "r");
        ra.seek(2);
        byte[] b = new byte[1024];
        int len = 0;
        while ((len = ra.read(b)) != -1) {
            System.out.println(new String(b, 0, len));
        }
    }

    public static void testRandomAccessFileWrite() throws Exception {
        RandomAccessFile ra = new RandomAccessFile("C:/Users/xp/Desktop/1.txt", "rw");
        //ra.seek(0);
        ra.seek(ra.length());//末尾追加
        // ra.writeBytes("ninh");
        ra.write("ninhhh".getBytes());
        ra.close();
    }
}
