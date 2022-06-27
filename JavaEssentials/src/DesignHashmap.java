import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;

public class DesignHashmap {

    int[] arr= new int[1000];

    public DesignHashmap() {
        Arrays.fill(arr, -1);
    }

    public void put(int key, int value) {
        arr[key] = value;
    }

    public int get(int key) {
        return arr[key];

    }

    public void remove(int key) {
        arr[key] = -1;
    }
}
