package com.company.java_advanced.homework1.task1;

import java.util.Objects;

public class Time {
    private int min;
    private int hour;

    public Time() {}

    public Time(int min, int hour) {
        this.min = min;
        this.hour = hour;
    }

    public int getMin() {
        return min;
    }

    public void setMin(int min) {
        this.min = min;
    }

    public int getHour() {
        return hour;
    }

    public void setHour(int hour) {
        this.hour = hour;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Time)) return false;
        Time time = (Time) o;
        return getMin() == time.getMin() && getHour() == time.getHour();
    }

    @Override
    public int hashCode() {
        return Objects.hash(getMin(), getHour());
    }

    @Override
    public String toString() {
        return "Time{" +
                "min=" + min +
                ", hour=" + hour +
                '}';
    }
}
