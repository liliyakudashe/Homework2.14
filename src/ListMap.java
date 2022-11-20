import java.util.*;

public class ListMap {
    private static final Random RANDOM = new Random();
    private final Map<String, List<Integer>> listMap = new HashMap<>();

    public ListMap(){
        for (int i = 0; i < 5; i++){
            listMap.put(String.valueOf(i),integerList());
        }
    }
    public Set<Map.Entry<String, List<Integer>>> mapEntries(){
        return listMap.entrySet();
    }
    public Map<String, Integer> collection(){
        Map<String, Integer> stringIntegerMap = new HashMap<>();
        for (Map.Entry<String, List<Integer>> entry : listMap.entrySet()){
            int sum = 0;
            for (Integer integer : entry.getValue()){
                sum += integer;
            }
            stringIntegerMap.put(entry.getKey(), sum);
        }
        return stringIntegerMap;
    }

    private List<Integer> integerList(){
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < 3; i++){
            list.add(RANDOM.nextInt(0));
        }
        return list;
    }
}
