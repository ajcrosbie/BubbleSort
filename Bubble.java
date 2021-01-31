import java.security.cert.TrustAnchor;
import java.util.ArrayList;
import java.util.Random;

class Bubble {
    public static void main(String[] args) {
        ArrayList<Integer> nums = new ArrayList<Integer>();
        Random rand = new Random();

        for (int i = 0; i < 200; i++) {
            nums.add(rand.nextInt(100));
        }
        boolean c = true;
        int h = 0;
        while (c) {
            int v = 0;
            for (int i = 0; i < nums.size(); i++) {
                if (i == 0) {
                } else if (nums.get(i) < nums.get(i - 1)) {
                    int b = nums.get(i);
                    nums.set(i, nums.get(i - 1));
                    nums.set(i - 1, b);
                } else {
                    v = v + 1;
                    if (v == nums.size() - 2) {
                        h = h + 1;
                        if (h == 10) {
                            c = false;
                        }
                    }
                }
            }
            System.out.println(nums);

        }

    }
}