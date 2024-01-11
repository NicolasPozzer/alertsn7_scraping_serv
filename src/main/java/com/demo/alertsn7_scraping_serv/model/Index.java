package com.demo.alertsn7_scraping_serv.model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter @Setter @ToString
public class Index {
    private Long id;
    private String symbol;
    private String name;
    private Double current_price;

    public Index() {
    }

    public Index(Long id, String symbol, String name, Double current_price) {
        this.id = id;
        this.symbol = symbol;
        this.name = name;
        this.current_price = current_price;
    }
}
