package hsk.wyujra;

import java.io.DataInputStream;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author Willyams Yujra
 */
public class MarsRoverCodingProblem {

    private static final Pattern line1 = Pattern.compile("([0-9]*)\\s([0-9]*)");
    private static final Pattern line2 = Pattern.compile("([0-9]*)\\s([0-9-]*)\\s([E|O|N|S])");
    private static final Pattern lineI = Pattern.compile("([L|R|M]*)");

    public static void main(String[] args) throws RobertParamException {
        // Without args
        String line;
        Matcher cmd;
        RobertCtrl robert;
        line = System.console().readLine();
        cmd = line1.matcher(line);
        if (!cmd.matches()) {
            throw new RobertParamException("Formato no valido: " + line1.pattern());
        }
        int maxX = Integer.parseInt(cmd.group(1));
        int maxY = Integer.parseInt(cmd.group(2));
        robert = new RobertCtrl(maxX, maxY);
        line = System.console().readLine();
        cmd = line2.matcher(line);
        if (!cmd.matches()) {
            throw new RobertParamException("Formato no valido: " + line2.pattern());
        }
        int iniX = Integer.parseInt(cmd.group(1));
        int iniY = Integer.parseInt(cmd.group(2));
        char iniO = cmd.group(3).charAt(0);
        robert.start(iniX, iniY, iniO);
        line = System.console().readLine();
        cmd = lineI.matcher(line);
        if (!cmd.matches()) {
            throw new RobertParamException("Formato no valido: " + lineI.pattern());
        }
        String cadena = cmd.group(1);
        robert.execute(cadena, false);
        System.out.println(robert.getStatus());
    }

}
