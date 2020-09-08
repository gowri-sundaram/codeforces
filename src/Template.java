import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Template {

    private static final boolean TEST_MODE = true;
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = getInt(br);
        for (int t=0; t<T; t++) {

        }
    }

    private static void process(int[] val) throws Exception {

    }

    private static Integer getInt(BufferedReader br) throws Exception {
        return Integer.parseInt(br.readLine());
    }

    private static Long getLong(BufferedReader br) throws Exception {
        return Long.parseLong(br.readLine());
    }

    private static int[] getIntArray(int N, BufferedReader br) throws Exception {
        String s = br.readLine();
        String[] tokens = s.split(" ");
        int[] result = new int[N+1];

        for (int i=0; i<N; i++) {
            result[i+1] = Integer.parseInt(tokens[i]);
        }
        return result;
    }

    private static long[] getLongArray(int N, BufferedReader br) throws Exception {
        String s = br.readLine();
        String[] tokens = s.split(" ");
        long[] result = new long[N+1];

        for (int i=0; i<N; i++) {
            result[i+1] = Long.parseLong(tokens[i]);
        }
        return result;
    }

    private static void printArray(String message, Object[] arr) {
        if (!TEST_MODE) {
            return;
        }
        System.out.print(message + " : ");
        for (int i=0; i<arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}