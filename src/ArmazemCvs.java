
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;
import java.io.FileWriter;
import org.json.simple.JSONObject;
import org.json.JSONException;


public class ArmazemCvs {

    public static void main(String[] args) {
        File armazem = new File("csv/[Ambiente] Armazém 03.csv");
        JSONObject armazemJson = new JSONObject();
        FileWriter armazemFile = null;
        String LinhasDoArquivo = new String();
        String Ts = new String();
        String Dado = new String();

        try {

            Scanner leitor = new Scanner(armazem);

            while (leitor.hasNext()) {
                LinhasDoArquivo = leitor.nextLine();

                String[] ValoresDoArquivo = LinhasDoArquivo.split(",");

                Ts = ValoresDoArquivo[0];
                Dado = ValoresDoArquivo[1];

                armazemJson.put("xid", "ID0001_TEMP");
                armazemJson.put("ts", Ts);
                armazemJson.put("dado", Dado);

                armazemFile = new FileWriter("armazem.json");
                armazemFile.write(armazemJson.toJSONString());
                armazemFile.flush();
                armazemFile.close();
                System.out.println(armazemJson.toJSONString());




            }
        } catch (FileNotFoundException e) {
            System.out.println("erro ao abrir arquivo!");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }


    }

}
