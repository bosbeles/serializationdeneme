package model;

import lombok.Data;

import java.io.Serializable;

@Data
public class TrackD implements Serializable, Comparable<TrackC>, IDeneme {
    private short short1 = 0;
    private short short2 = 1;
    private long long1 = 123123;
    private boolean b1 = true;
    private TrackEnum8 enum8 = TrackEnum8.A;

    public int compareTo(TrackC o) {
        return 0;
    }
}
