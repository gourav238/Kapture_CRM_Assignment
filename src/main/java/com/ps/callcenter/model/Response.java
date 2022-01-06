package com.ps.callcenter.model;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public interface Response {
    Integer getHour();

    Integer getDay();

    Integer getWeek();

    Integer getMonth();

    Integer getYear();

}

