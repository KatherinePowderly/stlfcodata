package com.katherinepowderly.stlfcodata.models;

import java.util.ArrayList;

public class csbData {

    static ArrayList<csb> csbs = new ArrayList<>();

    // getAll
    public static ArrayList<csb> getAll() {
        return csbs;

    }

    // add
    public static void add(csb newcsb) {
        csbs.add(newcsb);
    }
    // remove

    public static void remove(int id) {
        csb RemoveCSB = getById(id);
        csbs.remove(RemoveCSB);
    }


    //getById

    public static csb getById(int id) {

        csb thecsb = null;

        for (csb CandidateCSB : csbs) {
            if (CandidateCSB.getCsbId() == id) {
                thecsb = CandidateCSB;
            }
        }



        return thecsb;
    }

}
