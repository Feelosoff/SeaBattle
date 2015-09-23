/**
 * Created by FeelOsOff on 13.09.2015.
 */
public class Field {
    private static final int VALEU_X = 3;
    private static final int VALUE_Y = 3;
    private static final String MARKER_DEFAULT = " . ";
    private static final String MARKER_SHOOT_X = " X ";
    private static final String MARKER_SHOOT_O = " O ";
    private static char[][] cells = new char[VALUE_Y][VALEU_X];

    public static void initField() {
        for (int i = 1; i < cells.length; i++) {
            for (int j = 1; j < cells.length; j++) {

            }
        }
    }

    public static void showField() {
        for (int i = 0; i < cells.length; i++) {
            for (int j = 0; j < cells.length; j++) {
                System.out.print(MARKER_DEFAULT);
            }
            System.out.println();
        }
    }
}
