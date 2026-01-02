class CommonFactors {
    static void common(int... nums) {
        for (int i = 1; i <= nums[0]; i++) {
            boolean ok = true;
            for (int n : nums)
                if (n % i != 0) ok = false;

            if (ok) System.out.println(i);
        }
    }

    public static void main(String[] args) {
        common(12, 18, 24);
    }
}

