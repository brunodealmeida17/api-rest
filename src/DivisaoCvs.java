
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import org.json.JSONException;
import org.json.JSONObject;


public class DivisaoCvs {

    public static void main(String[] args) {
        File divisao = new File("csv/[Refrigerador] Divisão.csv");


        try {
            String linhasDoArquivo = new String();
            String Ts = new String();
            String Dado = new String();



            Scanner leitor = new Scanner(divisao);

            while (leitor.hasNext()) {
                linhasDoArquivo = leitor.nextLine();

                String[] ValoresDoArquivo = linhasDoArquivo.split(",");

                Ts = ValoresDoArquivo[0];
                Dado = ValoresDoArquivo[1];

                JSONObject divisaoJson = new JSONObject();

                divisaoJson.put("xid", "ID0003_TEMP");
                divisaoJson.put("ts", Ts);
                divisaoJson.put("dado", Dado);


                System.out.println(divisaoJson);




            }
        } catch (FileNotFoundException e) {
            System.out.println("erro ao abrir arquivo!");
        } catch (JSONException e) {
            throw new RuntimeException(e);
        }


    }

}
