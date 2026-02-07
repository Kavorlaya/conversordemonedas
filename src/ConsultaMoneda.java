import com.google.gson.Gson;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class ConsultaMoneda {
    private final String API_KEY = "ESCRIBA_AQUI_SU_API_KEY";

    public Cotizacion buscarCotizacion(String moneda_base, String moneda_cotizacion){

        URI direccion = URI.create("https://v6.exchangerate-api.com/v6/" + API_KEY +"/pair/" +
                moneda_base + "/" + moneda_cotizacion);

        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder().uri(direccion).build();

        try {
            HttpResponse<String> response = null;
            response = client
                    .send(request, HttpResponse.BodyHandlers.ofString());
            return new Gson().fromJson(response.body(), Cotizacion.class);
        } catch (Exception e) {
            throw new RuntimeException("No se encontró ese par para conversión.");
        }

    }

    public double calcularConversion(int opcion, double monto){

        String moneda_base = "";
        String moneda_cotizacion = "";
        double ratio_cotizacion;
        double montoConvertido = 0;

        switch (opcion)
        {
            case 1:
                moneda_base = "USD";
                moneda_cotizacion = "ARS";
                break;

            case 2:
                moneda_base = "ARS";
                moneda_cotizacion = "USD";
                break;

            case 3:
                moneda_base = "USD";
                moneda_cotizacion = "EUR";
                break;

            case 4:
                moneda_base = "EUR";
                moneda_cotizacion = "USD";
                break;

            case 5:
                moneda_base = "USD";
                moneda_cotizacion = "GBP";
                break;

            case 6:
                moneda_base = "GBP";
                moneda_cotizacion = "USD";
                break;

            case 7:
                moneda_base = "EUR";
                moneda_cotizacion = "GBP";
                break;

            case 8:
                moneda_base = "GBP";
                moneda_cotizacion = "EUR";
                break;

        }
        ratio_cotizacion = buscarCotizacion(moneda_base, moneda_cotizacion).conversion_rate();
        montoConvertido = monto * ratio_cotizacion;
        return montoConvertido;
    }
}
