package com.example.polls.payload;

import org.springframework.lang.NonNull;

import javax.validation.constraints.Max;

public class PollLength {

    @NonNull
    @Max(7)
    private Integer days;

    @NonNull
    @Max(23)
    private Integer hours;

    @NonNull
    public Integer getDays() {
        return days;
    }

    public void setDays(@NonNull Integer days) {
        this.days = days;
    }

    @NonNull
    public Integer getHours() {
        return hours;
    }

    public void setHours(@NonNull Integer hours) {
        this.hours = hours;
    }

}
