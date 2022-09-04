public class AgeCalculator {
    private int age;
    private int year;
    AgeCalculator(int age, int year) { this.age = age; this.year = year; }
    public int calculate(int target) {
        return this.year + target - this.age;
    }
}