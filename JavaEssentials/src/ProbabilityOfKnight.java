import javax.print.attribute.standard.RequestingUserName;

public class ProbabilityOfKnight {

    static final int n = 8;

    static int dx[] = { 1, 2, 2, 1, -1, -2, -2, -1 };
    static int dy[] = { 2, 1, -1, -2, -2, -1, 1, 2 };

    public static boolean location(int x, int y) {
        if ((x >= 0 && x <= n) && ((y >= 0 && y <= n))) {
            return true;
        } else {
            return false;
        }
    }

    public static double prob(int start_x, int start_y, int steps) {

        double chess[][][] = new double[n][n][steps + 1];
        for (int q = 0; q <= steps; q++) {
            for (int w = 0; w <= steps; w++) {
                chess[q][w][0] = 1.0;
            }
        }

        for (int step = 1; step <= steps; step++) {

            for (int x = 0; x < steps; x++) {
                for (int y = 0; y < steps; y++) {

                    double prob = 0.0;
                    for (int i = 0; i < n; i++) {
                        int ix = start_x + dx[i];
                        int iy = start_y + dy[i];

                        if (location(ix, iy) == true) {
                            prob += chess[x][y][step - 1] / 8.0;
                        }
                    }
                    chess[x][y][step] = prob;
                }
            }
        }
        return chess[start_x][start_y][steps];
    }

    public static void main(String[] args) {
        System.out.println(prob(0, 0, 3));
    }
}
