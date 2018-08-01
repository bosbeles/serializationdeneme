package main;

import com.esotericsoftware.kryo.Kryo;
import com.esotericsoftware.kryo.io.Output;
import model.Track;
import org.nustaq.serialization.FSTConfiguration;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;

public class Main {
    public static void main(String[] args) throws IOException {
        long l1 = 0;
        long l2 = 0;
        long l3 = 0;
        long t = System.currentTimeMillis();
        for (int i = 0; i < 100000; i++) {
            ByteArrayOutputStream bos = new ByteArrayOutputStream();
            ObjectOutput out = null;
            try {
                out = new ObjectOutputStream(bos);
                out.writeObject(new Track());
                out.flush();
                byte[] yourBytes = bos.toByteArray();
                l1 = yourBytes.length;
            } finally {
                try {
                    bos.close();
                } catch (IOException ex) {
                    // ignore close exception
                }
            }

        }
        t = System.currentTimeMillis() - t;
        System.out.println(t);
        Kryo kryo = new Kryo();
        kryo.setRegistrationRequired(false);
        //kryo.register(Track.class);


        t = System.currentTimeMillis();
        for (int i = 0; i < 100000; i++) {
            Track object = new Track();
            ByteArrayOutputStream bos2 = new ByteArrayOutputStream();
            Output output = new Output(bos2);
            kryo.writeObject(output, object);
            output.close();
            byte[] yourBytes = bos2.toByteArray();
            l2 = yourBytes.length;
        }
        t = System.currentTimeMillis() - t;
        System.out.println(t);


        FSTConfiguration conf = FSTConfiguration.createDefaultConfiguration();
        t = System.currentTimeMillis();
        for (int i = 0; i < 100000; i++) {

            byte barray[] = conf.asByteArray(new Track());
            l3 = barray.length;
        }
        t = System.currentTimeMillis() - t;
        System.out.println(t);



        System.out.println(l1 + " " + l2 +  " " + l3);


    }
}
