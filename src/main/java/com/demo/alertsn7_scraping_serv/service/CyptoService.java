package com.demo.alertsn7_scraping_serv.service;

import com.demo.alertsn7_scraping_serv.model.Crypto;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;
import java.util.List;

@Service
public class CyptoService implements ICryptoService{

    private static final String API_URL = "aca va la API";

    @Override
    public List<Crypto> listaCryptos() {
        try {
            // Crear una instancia de RestTemplate
            RestTemplate restTemplate = new RestTemplate();

            // Realizar la solicitud HTTP y deserializar la respuesta automáticamente a una lista de ApiCoin
            Crypto[] apiCoinsArray = restTemplate.getForObject(API_URL, Crypto[].class);

            // Convertir el array a lista
            List<Crypto> apiCoinList = Arrays.asList(apiCoinsArray);

            return apiCoinList;
        } catch (Exception e) {
            // Manejar errores, lanzar excepciones o devolver una lista vacía según tus necesidades.
            e.printStackTrace();
            return null;
        }
    }

}
