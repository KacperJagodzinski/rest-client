package src;

import com.google.gson.Gson;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;

public class RestClient {

    public static void main(String[] args) throws IOException {

        URL CatFactUrl = new URL("https://cat-fact.herokuapp.com/facts/random");
        InputStreamReader CatFactReader = new InputStreamReader(CatFactUrl.openStream());

        CatFact catFact = new Gson().fromJson(CatFactReader,CatFact.class);
        System.out.println(catFact.getText());

        //tymczasowe zapisywanie (jednolinijokwa odpowiedz)
        URL PicUrl = new URL("https://aws.random.cat/meow");
        InputStreamReader PicReader = new InputStreamReader(PicUrl.openStream());
        JsonObject jsonObject = new JsonParser().parse(PicReader).getAsJsonObject();
        System.out.println(jsonObject.get("file").getAsString());

    }
}
