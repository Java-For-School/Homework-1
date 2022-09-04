public class Draw {
    public static void drawFace() {
        System.out.println(" @@@@@@@@\n" + " @@@@@@@@@@\n" + "@@@@@@@@@@@@\n" + " *          *\n" + "*    O O     *\n" + "*     ^       *\n" + " *            *\n" + "  * /_______\\\\ *\n" + "   *          *\n" + "*************************");
    }
    public static int drawShape(int count, boolean turned) {
        if (count > 3) return 0;
        if (count == 0) return drawShape(count + 1, true);
        System.out.println(" ".repeat(3 - count) + "00".repeat(count) + " ".repeat(3 - count));
        return drawShape(turned ? count + 1 : count - 1, turned);
    }
}