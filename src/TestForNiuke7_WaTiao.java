public class TestForNiuke7_WaTiao {
    public static void main(String[] args) {
        System.out.println(Jump2(4));
    }

    public static int Jump2(int target) {
        if (target > 2) {
            int resp = 1;
            for (int i = 1; i < target; i++) {
                resp = resp + Jump2(target - i);
            }
            return resp;
        } else if (target == 2) {
            return 2;
        } else if (target == 1) {
            return 1;
        } else {
            return 0;
        }

    }

    public int JumpFloor(int target) {

        if (target > 2) {
            return JumpFloor(target - 1) + JumpFloor(target - 2);
        } else if (target == 2) {
            return 2;
        } else if (target == 1) {
            return 1;
        } else {
            return 0;
        }
    }
}
