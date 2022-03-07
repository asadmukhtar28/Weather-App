package com.weather.data.db.repository

import com.weather.data.db.dao.CurrenciesDao
import javax.inject.Inject

class CurrenciesRepository @Inject constructor(var currenciesDao: CurrenciesDao) {
    /*fun insertCurrencyNames(currencyNames: List<CurrencyNames>) {
        currenciesDao.insertCurrencyNames(currencyNames)
    }

    fun getAllCurrencyNames(): Flow<List<CurrencyNames>> {
        return currenciesDao.getAllCurrencyNames()
    }

    fun insertCurrencyQuotes(currencyQuotes: List<CurrencyRates>) {
        currenciesDao.insertCurrencyQuotes(currencyQuotes)
    }

    fun getAllCurrencyQuotes(): Flow<List<CurrencyRates>> {
        return currenciesDao.getAllCurrencyQuotes()
    }*/
}