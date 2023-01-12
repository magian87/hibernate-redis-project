package dev.magian.redis;

import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;


@Getter
@Setter
public class Language {
    private String language;
    private Boolean isOfficial;
    //private Integer isOfficial;
    private BigDecimal percentage;

    //Getters and Setters omitted

}
