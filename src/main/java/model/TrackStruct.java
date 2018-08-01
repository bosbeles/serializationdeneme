package model;

import lombok.Data;

import java.io.Serializable;

@Data
public class TrackStruct implements Serializable, Comparable<TrackStruct> {

    private long deneme = 5;
    private TrackA trackA = new TrackA();
    private TrackB trackB = new TrackB();

    public int compareTo(TrackStruct o) {
        return 0;
    }
}
