import java.util.*;

public class Main {
    private static final List<Integer> nums = new ArrayList<>(List.of(1, 1, 2, 3, 4, 4, 5, 5, 6, 7));
    private static final List<String> strings = new ArrayList<>(List.of("один", "два", "два", "три", "три", "три"));

    public static void main(String[] args) {
        task4();
    }

    public static void task1() {
        for (Integer num : nums) {
            if (num % 2 != 0) {
                System.out.println(num);
            }
        }
    }

    public static void task2() {
        Collections.sort(nums);

        int lastNum = Integer.MIN_VALUE;
        for (Integer integer : nums) {
            if (integer % 2 == 0 && integer != lastNum) {
                System.out.println(integer);
                lastNum = integer;
            }
        }
    }

    public static void task3() {
        Set<String> uniqueWords = new HashSet<>(strings);
        System.out.println(uniqueWords);
    }

    public static void task4() {
        Set<String> uniqueWords = new HashSet<>(strings);
        int total = 0;
        for (String string : uniqueWords) {
            for (String s : strings) {
                if (Objects.equals(string, s)) {
                    total += 1;
                }
            }

        }
        System.out.println(strings.size() - uniqueWords.size());
        System.out.println(total);

    }



}