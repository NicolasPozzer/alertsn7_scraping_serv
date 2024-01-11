package com.demo.alertsn7_scraping_serv.service;

import com.demo.alertsn7_scraping_serv.model.Index;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class IndexService implements IIndexService{

    public static final String API_URL = "url api";

    @Override
    public List<Index> listaIndices() {
        return null;
    }
}
