package by.test.service;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by dmurashko on 23.03.2018.
 */
public class Input {

    public int [] input() {

        ArrayList<Integer> list = new ArrayList<Integer>();
        while (true) {
            System.out.println("Please input numbers and press enter. Input any other value to exit");
            Scanner in = new Scanner(System.in);
            String val = in.nextLine();
            if (new Parser(val).checkVal() == -1) {
                System.out.println("Code accepted!");
                break;
            }
            list.add(Integer.valueOf(val));

        }
        return list.stream().filter(t -> t != null).mapToInt(t -> t).toArray();

    }


}
