import java.io.*;

public class primeNumbers {
    public static void main(String[] args) throws IOException {
        BufferedReader reader;
        int line =0;

            try {
                reader = new BufferedReader(new FileReader("input.txt"));
                line = Integer.parseInt(reader.readLine());

            } catch (IOException x) {
                x.printStackTrace();
            }


    String g;
        if (check(line)) {
            g ="Prime";

        } else {
            g ="Not";

        }

        String out = g;
        BufferedWriter writer = new BufferedWriter(new FileWriter("output.txt"));
        writer.write(out);
        writer.close();
    }
    static  boolean check(int a) {
        for(int i=2;i<=a/2;i++) {
            if((a%i)==0)
                return  false;
        }
            return true;
    }


}
