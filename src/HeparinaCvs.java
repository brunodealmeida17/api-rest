
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import org.json.JSONException;
import org.json.JSONObject;


public class HeparinaCvs {

    public static void main(String[] args) {
        File arquivo1 = new File("D:\\\\downloads\\\\testesensorweb\\\\[Umidade 01] Sala Heparina.csv");

        try {
            String linhasDoArquivo = new String();
            String ts = new String();
            String dado = new String();
            String xid = new String();


            Scanner leitor = new Scanner(arquivo1);

            while (leitor.hasNext()) {
                linhasDoArquivo = leitor.nextLine();

                String[] ValoresDoArquivo = linhasDoArquivo.split(",");

                ts = ValoresDoArquivo[0];
                dado = ValoresDoArquivo[1];

                JSONObject armazem = new JSONObject();

                armazem.put("xid", "ID0001_TEMP");
                armazem.put("ts", ts);
                armazem.put("dado", dado);


                System.out.println(armazem);




            }
        } catch (FileNotFoundException e) {
            System.out.println("erro ao abrir arquivo!");
        } catch (JSONException e) {
            throw new RuntimeException(e);
        }


    }

}
