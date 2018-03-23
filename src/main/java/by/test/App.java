package by.test;

        import by.test.pojo.DanceFloor;
        import by.test.pojo.Dancer;
        import by.test.service.Dance;
        import by.test.service.Input;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        Dancer dancer = new Dancer(new Input().input());
        Dance dance = new Dance(dancer,new DanceFloor(dancer.danceCode.length));
        dance.dance();
        System.out.println(dance.steps);


    }
}
