package model;

import lombok.Data;

import java.io.Serializable;

@Data
public class TrackA implements Serializable, Comparable<TrackA>, IDeneme {
    private TrackEnum1 enum1 = TrackEnum1.A;
    private TrackEnum2 enum2 = TrackEnum2.A;
    private TrackEnum3 enum3 = TrackEnum3.A;
    private TrackEnum4 enum4 = TrackEnum4.A;
    private TrackEnum5 enum5 = TrackEnum5.A;
    private long long1 = 5;
    private float float1 = 5f;
    private float float2 = 6f;
    private float float3 = 7f;
    private float float4 = 8f;
    private String string1 = "asdqweqwsadqweqweqwewqasdqweqwewqesadqweqw";
    private TrackC trackC = new TrackC();
    private TrackC[] array1 = new TrackC[5];
    private TrackD[] array2 = new TrackD[5];

    public TrackA() {
        for (int i = 0; i < array1.length; i++) {
            array1[i] = new TrackC();
        }

        for (int i = 0; i < array2.length; i++) {
            array2[i] = new TrackD();
        }
    }

    public int compareTo(TrackA o) {
        return 0;
    }
}
