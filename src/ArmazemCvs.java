
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import org.json.JSONException;
import org.json.JSONObject;


public class ArmazemCvs {

    public static void main(String[] args) {
        File armazem = new File("csv/[Ambiente] Armazém 03.csv");

        try {
            String LinhasDoArquivo = new String();
            String Ts = new String();
            String Dado = new String();



            Scanner leitor = new Scanner(armazem);

            while (leitor.hasNext()) {
                LinhasDoArquivo = leitor.nextLine();

                String[] ValoresDoArquivo = LinhasDoArquivo.split(",");

                Ts = ValoresDoArquivo[0];
                Dado = ValoresDoArquivo[1];

                JSONObject armazemJson = new JSONObject();

                armazemJson.put("xid", "ID0001_TEMP");
                armazemJson.put("ts", Ts);
                armazemJson.put("dado", Dado);


                System.out.println(armazemJson);




            }
        } catch (FileNotFoundException e) {
            System.out.println("erro ao abrir arquivo!");
        } catch (JSONException e) {
            throw new RuntimeException(e);
        }


    }

}
