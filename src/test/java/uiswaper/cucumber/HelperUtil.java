package uiswaper.cucumber;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class HelperUtil {
    public static Map<String, String> twoListsToLinkedHasmap(List<String> keys, List<String> values){
        Map<String,String> map = new LinkedHashMap<>();
        Iterator<String> i1 = keys.iterator();
        Iterator<String> i2 = values.iterator();
        while (i1.hasNext() && i2.hasNext()) {
            map.put(i1.next(), i2.next());
        }
        return map;
    }
}
