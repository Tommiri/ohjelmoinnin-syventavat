package io.github.tommiri.days.args;

import com.beust.jcommander.ParameterException;
import com.beust.jcommander.converters.BaseConverter;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeParseException;

public class LocalDateConverter extends BaseConverter<LocalDate> {
    private static final SimpleDateFormat DATE_FORMAT = new SimpleDateFormat("yyyy-MM-dd");
    
    public LocalDateConverter(String optionName) {
        super(optionName);
    }

    public LocalDate convert(String value) {
        try {
            return LocalDate.parse(value);
        } catch (DateTimeParseException var3) {
            throw new ParameterException(this.getErrorString(value, String.format("an ISO-8601 formatted date (%s)", DATE_FORMAT.toPattern())));
        }
    }
}