package model;

import lombok.Data;

import java.io.Serializable;

@Data
public class TrackC implements Serializable, Comparable<TrackC>, IDeneme {
    private String string1 = "asdasdasdasdqweqweqwqweqwasddasdqwe";
    private String string2 = "sadaqweqweqwdasdqeqweqweqwdsadqweqweqw";
    private String string3 = "asdasdqweqweqwesdasdqweqweqweqweqweasd";
    private String string4 = "asdasdqweqweqweasdasdsdsadqweqweqweqw";
    private String string5 = "asdasdqweqweqweqdasdqweqweqweqweqwe";
    private String string6 = "asdqweqwewqdasdasdasqweqwewqeqweqw";
    private int int1 = 1;
    private int int2 = Integer.MAX_VALUE;
    private int int3 = 4;
    private int int4 = Integer.MAX_VALUE;
    private TrackEnum6 enum6 = TrackEnum6.A;
    private TrackEnum7 enum7 = TrackEnum7.B;

    public int compareTo(TrackC o) {
        return 0;
    }
}
