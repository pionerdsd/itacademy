package by.test.service;

import by.test.pojo.DanceFloor;
import by.test.pojo.Dancer;

import java.util.ArrayList;

/**
 * Created by dmurashko on 23.03.2018.
 */
public class Dance {

    private Dancer dancer;
    private DanceFloor danceFloor;
    private int position=0;
    public int steps=0;
    private int size;


    public Dance(Dancer dancer, DanceFloor danceFloor) {
        this.dancer = dancer;
        this.danceFloor = danceFloor;
        size = danceFloor.danceFloorSize;

    }

    public void dance() {
        int[] n = dancer.danceCode;

        for (int i = 0; i < n.length; i++) {
            if (n[i] % 2 != 0) {
                back(n[i], i);
            } else {
            forward(n[i]);}
           /* System.out.print("i = " + i + " ");
            System.out.print("n[" + i + "] = " + n[i] + " ");
            System.out.print("position = " + position + " ");
            System.out.println("steps = " + steps);*/
        }

    }

    private void forward(int num) {
        if (position + num <= size) {
            steps += num;
            position += num;
        } else {
            steps += position;
            position = 0;
        }

    }

    private void back(int num, int i) {

        if (i != 0) {
            if (position - num >= 0) {
                steps += num;
                position -= num;
            } else {
                steps += position;
                position = 0;

            }
        }


    }

}
