package ex13;

import java.util.HashMap;
import java.util.Map;

public class Map02 {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();

        map.put("kim", "1234");
        map.put("park", "pass");
        map.put("lee", "word");

        System.out.println(map.get("word"));
        /**
         * Map은 키-값 쌍을 저장하는 자료구조이므로, 키가 어떤 값에 매핑되어 있는지를 직접 알 수는 없습니다. 즉, 키를 알고 있는 경우에만
         * 해당 키에 대한 값을 가져올 수 있습니다. 따라서 "pass"라는 키에 대한 값을 알고자 한다면, 사전에 해당 키를 알고 있어야
         * 합니다.Map은 키-값 쌍을 저장하는 자료구조이므로, 키가 어떤 값에 매핑되어 있는지를 직접 알 수는 없습니다. 즉, 키를 알고 있는
         * 경우에만 해당 키에 대한 값을 가져올 수 있습니다. 따라서 "pass"라는 키에 대한 값을 알고자 한다면, 사전에 해당 키를 알고 있어야
         * 합니다.
         * 
         * String targetValue = "pass";
         * String targetKey = null;
         */
        for (String key : map.keySet()) { // -> key 모음
            String value = map.get(key); // -> key의 value값
            System.out.println("key = " + key + ", value = " + value);
        }
        /**
         * keySet() -> key모음만 나온다.(value값은 나오지 않는다.)
         * Map 인터페이스에서 제공되는 메서드 중 하나로, Map에 있는 모든 키를 Set 형태로 반환합니다. 반환된 Set은 Map의 키 집합을
         * 나타내며, 중복되지 않는 고유한 키들로 구성됩니다.
         * keySet() 메서드를 사용하면 Map의 키들을 얻을 수 있으므로, 이를 활용하여 키에 대한 값을 조회하거나 반복문을 사용하여 Map의
         * 모든 키-값 쌍을 순회할 수 있습니다.
         */
        map.remove(3);
        // remove()는 지우고 싶은 key-value에서 key를 작성해 그 항목을 삭제할 수 있다.
        map.put("lee", "love");
        // 기존의 key값에 다른 value값으로 변경하고 싶다면, 다시 put해서 작성하면 기존의 값에 덮어씌어진다.
        System.out.println(map);
    }
}
