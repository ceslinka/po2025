class CodingBat {
    public boolean sleepIn(boolean weekday, boolean vacation) {
        if (!weekday || vacation) {
            return true;
        } else {
            return false;
        }

    }

    public static void main(String[] args) {
        CodingBat s = new CodingBat();
        System.out.println(s.sleepIn(true, true));
        System.out.println(s.sleepIn(true, false));
        System.out.println(s.sleepIn(false, true));
        System.out.println(s.sleepIn(false, false));

    }
}