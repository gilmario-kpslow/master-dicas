/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.gilmariosoftware.masterdicas.dominio;

import java.time.LocalDate;
import java.sql.Date;
import javax.persistence.AttributeConverter;
import javax.persistence.Converter;

/**
 *
 * @author gilmario
 */
@Converter(autoApply = true)
public class LocalDateConverter implements AttributeConverter<LocalDate, Date> {

    @Override
    public Date convertToDatabaseColumn(LocalDate date) {
        try {
            return Date.valueOf(date);
        } catch (Exception e) {
            return null;
        }
    }

    @Override
    public LocalDate convertToEntityAttribute(Date value) {
        try {
            return value.toLocalDate();
        } catch (Exception e) {
            return null;
        }
    }
}
