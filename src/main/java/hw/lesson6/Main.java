package hw.lesson6;

import com.squareup.okhttp.HttpUrl;
import com.squareup.okhttp.OkHttpClient;
import com.squareup.okhttp.Request;

import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {

        String apiKey = "dgWhZkU27srt9GmdF4pgmlkYu81HZZlH";
        //String city = "Saint Petersburg";
        String cityKey = "295212";
        String host = "dataservice.accuweather.com";
        String response;
        OkHttpClient client = new OkHttpClient();

        Request request = new Request.Builder().url(getCityForecastUrl(apiKey, cityKey, host)).build();

        response = client.newCall(request).execute().body().string();
        System.out.println(response);
    }

    public static HttpUrl getCityForecastUrl(String apiKey, String cityKey, String host) {
        return new HttpUrl.Builder().scheme("http")
                .host(host)
                .addPathSegment("forecasts")
                .addPathSegment("v1")
                .addPathSegment("daily")
                .addPathSegment("5day")
                .addPathSegment(cityKey)
                .addQueryParameter("apikey", apiKey)
                .addQueryParameter("metric", "true")
                .build();
    }

}
