package model;

import lombok.Data;

import java.io.Serializable;

@Data
public class TrackB implements Serializable, Comparable<TrackB>, IDeneme {
    private float float1 = 3f;
    private float float2 = 4f;
    private float float3 = 5f;
    private float float4 = 6f;
    private float float5 = 7f;
    private int int1 = 123;
    private boolean b1 = true;
    private TrackEnum9 enum9 = TrackEnum9.A;

    public int compareTo(TrackB o) {
        return 0;
    }
}
