package com.company.java_advanced.homework1.task1;

import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Collection;

public class CinemaTest {
    private Cinema seance;

    @BeforeClass
    public void setUp() {
        seance = new Cinema();
    }

    @Test
    public void addTest1() {
        ArrayList<Cinema> seances = new ArrayList<>();
        seances.add(seance);
        ArrayList<Cinema> seances2 = new ArrayList<Cinema>((Collection<? extends Cinema>) seance);

        Assert.assertEquals(seances, seances2);
    }

    @Test
    public void addTest2() {
        ArrayList<Cinema> seances = new ArrayList<>();
        seances.remove(seance);
        ArrayList<Cinema> seances2 = new ArrayList<>();

        Assert.assertEquals(seances, seances2);
    }

    @AfterClass
    public void tearDown() {
        seance.equals(0);
    }
}
