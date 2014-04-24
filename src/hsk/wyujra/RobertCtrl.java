package hsk.wyujra;

//private static final
public class RobertCtrl {

    private int iniX, iniY, maxX, maxY;
    private int incX, incY, incI;

    public RobertCtrl(int x, int y) {
        maxX = x;
        maxY = y;
        incX = 0;
        incY = 0;
        iniX = 0;
        incY = 0;
        incI = 0;
    }

    public void start(int x, int y, char o) {
        iniX = x;
        iniY = y;
        checkOrientation(o);
        //moveRobot();
    }

    private void checkOrientation(char i) {
        incI = i == 'E' ? 0 : i == 'O' ? 2 : i == 'N' ? 1 : i == 'S' ? 3 : incI;
        int inc = i == 'L' ? 1 : i == 'R' ? -1 : 0;
        incI = (4 + incI + inc) % 4;
        incX = incI == 0 ? 1 : incI == 2 ? -1 : 0;
        incY = incI == 1 ? 1 : incI == 3 ? -1 : 0;
    }

    public void execute(String commando, boolean debug) {
        if (debug) {
            System.out.println("start: " + this);
        }
        for (int i = 0; i < commando.length(); i++) {
            char mov = commando.charAt(i);
            if (mov == 'M') {
                moveRobot();
            } else {
                checkOrientation(mov);
            }
            if (debug) {
                System.out.println("move: " + i + ": mov (" + mov + ") = " + this);
            }
        }
    }

    public void moveRobot() {
        iniX = (iniX + incX)%maxX;
        iniY = (iniY + incY)%maxX;
    }

    public String getStatus() {
        return iniX + " " + iniY + " " + getOrientation();
    }

    public char getOrientation() {
        return incI == 0 ? 'E' : incI == 1 ? 'N' : incI == 2 ? 'O' : 'S';
    }

    public String toString() {
        return getStatus() + " (i:" + incI + "=" + getOrientation() + " - x:" + incX + " y:" + incY + ")";
    }
}
