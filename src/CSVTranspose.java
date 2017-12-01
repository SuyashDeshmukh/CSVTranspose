import java.io.*;

public class CSVTranspose {

    private static BufferedReader br;
    private static BufferedWriter bw;

    public static void main(String[] args) {
        String source;
        String dest;
        br = new BufferedReader(new InputStreamReader(System.in));
        try{
            System.out.println("Enter source file path : ");
            source = br.readLine();
            System.out.println("Enter destination file path : ");
            dest = br.readLine();
            new CSVTranspose().transposeCSV(source,dest);
        }catch (IOException e){
            System.err.println(e);
        }
        System.out.println("File converted Successfully");
    }

    private void transposeCSV(String src, String dest) throws IOException {
        String line;
        br = new BufferedReader(new FileReader(src));
        bw = new BufferedWriter(new FileWriter(dest));

        if((line = br.readLine()) != null)
            bw.append(line);

        while((line = br.readLine())!= null){
            bw.append(',');
            bw.append(line);
        }
        bw.close();
    }
}
