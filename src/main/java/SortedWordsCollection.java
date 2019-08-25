import java.util.*;

public class SortedWordsCollection<String, Integer> implements SortedMap<String, Integer> {

    private Map<String, Integer> m;

    @Override
    public Comparator<? super String> comparator() {
        return null;
    }

    @Override
    public SortedMap<String, Integer> subMap(String fromKey, String toKey) {
        return null;
    }

    @Override
    public SortedMap<String, Integer> headMap(String toKey) {
        return null;
    }

    @Override
    public SortedMap<String, Integer> tailMap(String fromKey) {
        return null;
    }

    @Override
    public String firstKey() {
        return null;
    }

    @Override
    public String lastKey() {
        return null;
    }

    @Override
    public int size() {
        return m.size();
    }

    @Override
    public boolean isEmpty() {
        return m.isEmpty();
    }

    @Override
    public boolean containsKey(Object key) {
        return m.containsKey(key);
    }

    @Override
    public boolean containsValue(Object value) {
        return m.containsValue(value);
    }

    @Override
    public Integer get(Object key) {
        return m.get(key);
    }

    @Override
    public Integer put(String key, Integer value) {
        return m.put(key, value);
    }

    @Override
    public Integer remove(Object key) {
        return m.remove(key);
    }

    @Override
    public void putAll(Map<? extends String, ? extends Integer> m) {

    }

    @Override
    public void clear() {
        m.clear();
    }

    @Override
    public Set<String> keySet() {
        return m.keySet();
    }

    @Override
    public Collection<Integer> values() {
        return m.values();
    }

    @Override
    public Set<Entry<String, Integer>> entrySet() {
        return m.entrySet();
    }
}
