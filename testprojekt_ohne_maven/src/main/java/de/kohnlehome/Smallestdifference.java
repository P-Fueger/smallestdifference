package de.kohnlehome;

import java.util.ArrayList;
import java.util.Collections;

public class Smallestdifference implements ISmallestdifference {

    public ArrayList<Integer> result;
    public int zahl1, zahl2;

    public Smallestdifference() {
        result = new ArrayList<>();
    }


    @Override
    public int difference(int[] n, int[] m) {
        for (int i = 0; i < n.length; i++) {
            zahl1 = n[i];
            for (int y = 0; y < m.length; y++) {
                zahl2 = m[y];
                result.add(rechner(zahl1, zahl2));
            }
        }
        return Collections.min(result);
    }


    public static int rechner(int a, int b) {
        int res;

        if (a > b) {
            res = a - b;
        } else {
            res = b - a;
        }
        return res;
    }
}
