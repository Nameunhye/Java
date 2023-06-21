package ex13;

import java.util.*;

public class Set01 {
    public static void main(String[] args) {
        TreeSet<String> set = new TreeSet<>();

        set.add("Milk");
        set.add("Bread");
        set.add("Butter");
        set.add("Cheese");
        set.add("Ham");
        set.add("Ham");
        /*
         * HashSet : 저장될 때 순서가 일정하지 않게 저장된다. 마음대로
         * [Ham, Butter, Cheese, Milk, Bread]
         * Ham도 포함되어 있음
         */
        /*
         * LintkedHashSet : 원소가 삽입되었던 순서대로 저장된다.
         * [Milk, Bread, Butter, Cheese, Ham]
         * Ham도 포함되어 있음
         */
        /*
         * TreeSet : 값의 순서대로(오름차순)
         * [Bread, Butter, Cheese, Ham, Milk]
         * Ham도 포함되어 있음
         */

        // Set은 데이터의 중복만을 막도록 설계되어 있기 때문에, Ham이 2개를 삽입을 해도 1개만 저장이 된다.

        System.out.println(set);
        System.out.println(set.size());

        if (set.contains("Ham")) {
            System.out.println("Ham도 포함되어 있음");
        }
    }
}
