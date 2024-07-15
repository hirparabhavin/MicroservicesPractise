package com.bhavinhirpara.microservices.currency_exchange_service;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface CurrencyExchangeRepository extends JpaRepository<CurrencyExchange, Long> {


    CurrencyExchange findByFromAndTo(String from, String to);
}