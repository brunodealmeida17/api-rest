
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import org.json.JSONException;
import org.json.JSONObject;


public class HeparinaCvs {

    public static void main(String[] args) {
        File heparina = new File("csv/[Umidade 01] Sala Heparina.csv");

        try {
            String LinhasDoArquivo = new String();
            String Ts = new String();
            String Dado = new String();



            Scanner leitor = new Scanner(heparina);

            while (leitor.hasNext()) {
                LinhasDoArquivo = leitor.nextLine();

                String[] ValoresDoArquivo = LinhasDoArquivo.split(",");

                Ts = ValoresDoArquivo[0];
                Dado = ValoresDoArquivo[1];

                JSONObject armazem = new JSONObject();

                armazem.put("xid", "ID0002_TEMP");
                armazem.put("ts", Ts);
                armazem.put("dado", Dado);


                System.out.println(armazem);




            }
        } catch (FileNotFoundException e) {
            System.out.println("erro ao abrir arquivo!");
        } catch (JSONException e) {
            throw new RuntimeException(e);
        }


    }

}
