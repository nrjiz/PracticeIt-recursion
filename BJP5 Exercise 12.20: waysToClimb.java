public static void waysToClimb(int n) {
    waysToClimb(n, 0, "[");
}

private static void waysToClimb(int n, int position, String result) {
    if (n == position) {
        int index = result.lastIndexOf(",");
        if (index != -1) {
            result = result.substring(0, index) + "]";
            System.out.println(result);
        }
    } else if (n > position) {
        waysToClimb(n, position + 1, result + "1, ");
        waysToClimb(n, position + 2, result + "2, ");
    }
}
