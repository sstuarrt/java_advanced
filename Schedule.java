package com.company.java_advanced.homework1.task1;

import java.util.Objects;
import java.util.Set;
import java.util.TreeSet;

public class Schedule {
    Set<Seance> seances = new TreeSet<>();

    public Schedule() {}

    public Schedule(Set<Seance> seances) {
        this.seances = seances;
    }

    public Set<Seance> getSeances() {
        return seances;
    }

    public void setSeances(Set<Seance> seances) {
        this.seances = seances;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Schedule)) return false;
        Schedule schedule = (Schedule) o;
        return Objects.equals(getSeances(), schedule.getSeances());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getSeances());
    }

    public void addSeance(Seance seance) {
        seances.add(seance);
    }

    public void removeSeance(Seance seance) {
        seances.remove(seance);
    }

    @Override
    public String toString() {
        return "Shedule{" +
                "seances=" + seances +
                '}';
    }
}

