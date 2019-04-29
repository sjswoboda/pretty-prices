/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.shopify.prettyprices;

import java.math.BigDecimal;

public class PriceConverter {
    private final BigDecimal EXCHANGE_RATE;

    public PriceConverter(BigDecimal exchangeRate) {
        EXCHANGE_RATE = exchangeRate;
    }
    /**
     *
     * @param price Number to convert.
     * @return A number that is rounded to the nearest <??>
     */
    public BigDecimal convert(BigDecimal price) {
        return EXCHANGE_RATE.multiply(price);
    }
}
