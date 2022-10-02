import java.util.HashMap;

public class gridTraveler {
    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();
        System.out.println(grid(1, 1, map));
        System.out.println(grid(2, 3, map));

        System.out.println(grid(3, 2, map));

        System.out.println(grid(3, 3, map));
        System.out.println(grid(10, 10, map));


        // grid(2, 3, map);
        // grid(3, 2, map);
        // grid(3, 3, map);
    }

    public static Integer grid(int m, int n, HashMap<String, Integer> map) {
        Integer result;
        String key = String.valueOf(m) + ',' + String.valueOf(n);
        // System.out.println("key:  "+key);
        if (map.containsKey(key)) {
            result = map.get(key);
            // System.out.println("map result:  " + result);
            return result;
        }

        if (m == 1 && n == 1) {
            result = 1;
        } else if (m <= 0 || n <= 0) {
            result = 0;
        } else {
            result = grid(m - 1, n, map) + grid(m, n - 1, map);
        }
        // System.out.println("normal result:  " + result);
        map.put(key, result);

        return result;
    }
}
