package by.test.pojo;

import java.util.List;

/**
 * Created by dmurashko on 23.03.2018.
 */
public class Dancer {
    public int [] danceCode;

    public Dancer(int [] danceCode) {
       this.danceCode = danceCode;
    }
    public void show(){
        System.out.println(danceCode);
    }
}
