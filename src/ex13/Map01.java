package ex13;

import java.util.HashMap;
import java.util.Map;

public class Map01 {
    public static void main(String[] args) {

        // Map<String, String> fishman = new HashMap<>(0);
        // fishman.put("kim", "1234");

        Map<String, String> fishman = Map.of("Kim", "1234", "park", "pass", "lee", "word");
        // 위의 HashMap-fishman을 초기화 한 버전.

        System.out.println(fishman.size());

        String value = fishman.get("Kim");
        System.out.println(value);
    }
    /**
     * HashMap
     * 
     * 가변 크기의 Map
     * 요소 추가, 제거, 변경 가능
     * HashMap 생성자를 사용하여 빈 HashMap을 생성한 후, put() 메소드를 사용하여 키-값 쌍을 추가한다.
     * put()를 통해서 여러 개의 요소를 추가할 수 있다. *
     */

    /**
     * Map.of
     * 
     * 불변 맵을 생성하는 메소드
     * 한 번 생성된 맵은 내부적으로 요소 추가, 제거, 변경할 수 없다.
     * 
     * HashMap -> Map.of (O)
     * Map.of -> HashMap(X)
     * *
     * 만약, 맵에 새로운 요소를 추가하거나 기존 요소를 수정 또는 삭제를 해야한다면,
     * 'Map.of' 대신 'new HashMap<>()'와 같은 방식으로 put을 사용해서 추가, 수정이 가능하다.
     * 
     * Map.of를 사용하여 초기화된 맵을 다른 HashMap에 복사-값 이동을 할 수 있는데,
     * 이를 위해서는 HashMap의 생성자 이용, putAll 메소드를 이용한다.
     * 
     * import java.util.HashMap;
     * import java.util.Map;
     * 
     * public class MapExample {
     * public static void main(String[] args) {
     * // 초기화된 맵
     * Map<String, String> originalMap = Map.of("Kim", "1234", "park", "pass",
     * "lee", "word");
     * System.out.println("Original Map: " + originalMap);
     * 
     * // 새로운 HashMap 생성 후 originalMap 복사
     * Map<String, String> newHashMap = new HashMap<>(originalMap);
     * System.out.println("New HashMap: " + newHashMap);
     * }
     * }
     * 
     */
}
