package src;

import com.google.gson.Gson;
import src.model.GooglePlace;
import src.model.Result;

import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;

public class RestGoogleClient {
    public static void main(String[] args) throws IOException {

        //Google Map Places Api KEY deleted
        //Looking for restaurants in Warsaw 
        URL gUrl = new URL("https://maps.googleapis.com/maps/api/place/nearbysearch/json?location=52.2246698,21.020949299999998&radius=500&types=food&key=API_KEY");
        InputStreamReader reader = new InputStreamReader(gUrl.openStream());

        GooglePlace googlePlace = new Gson().fromJson(reader,GooglePlace.class);
        for (Result result:googlePlace.getResults()
             ) {
            System.out.println(result.getName());
        }


    }
}
