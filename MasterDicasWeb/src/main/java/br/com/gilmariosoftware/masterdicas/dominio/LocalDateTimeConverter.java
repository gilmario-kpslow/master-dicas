/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.gilmariosoftware.masterdicas.dominio;

import java.sql.Timestamp;
import java.time.LocalDateTime;
import javax.persistence.AttributeConverter;
import javax.persistence.Converter;

/**
 *
 * @author gilmario
 */
@Converter(autoApply = true)
public class LocalDateTimeConverter implements AttributeConverter<LocalDateTime, Timestamp> {

    @Override
    public Timestamp convertToDatabaseColumn(LocalDateTime date) {
        try {
            return Timestamp.valueOf(date);
        } catch (Exception e) {
            return null;
        }
    }

    @Override
    public LocalDateTime convertToEntityAttribute(Timestamp value) {
        try {
            return value.toLocalDateTime();
        } catch (Exception e) {
            return null;
        }
    }
}
