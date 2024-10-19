import com.google.gson.Gson;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Scanner;

public class Convertidor {

    public Moneda tipoDeMoneda(String entrada, String salida, double cantidad){

        URI direccion = URI.create("https://v6.exchangerate-api.com/v6/94fd56f1667ce59fbaef6752/pair/" + entrada + "/" + salida + "/" + cantidad);

        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(direccion)
                .build();

        try {
            HttpResponse<String> response = client
                    .send(request, HttpResponse.BodyHandlers.ofString());
            return new Gson().fromJson(response.body(), Moneda.class);

        } catch (Exception e) {
            throw new RuntimeException("No se pudo realizar esa conversion");

        }

    }
}
