
package com.example.linearalgebra.slark0.model;

import java.util.ArrayList;
import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;


public class Model {

    @SerializedName("objects")
    @Expose
    private ArrayList<MySet> mySets = new ArrayList<MySet>();

    /**
     * 
     * @return
     *     The mySets
     */
    public ArrayList<MySet> getMySets() {
        return mySets;
    }

    /**
     * 
     * @param mySets
     *     The mySets
     */
    public void setMySets(ArrayList<MySet> mySets) {
        this.mySets = mySets;
    }

    public Model withObjects(ArrayList<MySet> mySets) {
        this.mySets = mySets;
        return this;
    }

}
