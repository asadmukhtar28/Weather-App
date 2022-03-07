package com.weather.data.db.dao

import androidx.room.Dao

@Dao
abstract class CurrenciesDao {
    /*@Insert(onConflict = OnConflictStrategy.REPLACE)
    abstract fun insertCurrencyNames(currencyNames: List<CurrencyNames>)

    @Query("Select *FROM $TABLE_CURRENCY_NAMES")
    abstract fun getAllCurrencyNames(): Flow<List<CurrencyNames>>

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    abstract fun insertCurrencyQuotes(currencyQuotes: List<CurrencyRates>)

    @Query("Select *FROM $TABLE_CURRENCY_RATES")
    abstract fun getAllCurrencyQuotes(): Flow<List<CurrencyRates>>*/
}