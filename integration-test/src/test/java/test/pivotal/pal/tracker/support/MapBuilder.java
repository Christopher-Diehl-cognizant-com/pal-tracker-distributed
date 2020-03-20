package test.pivotal.pal.tracker.support;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author 780449
 * @param <K>
 * @param <V>
 */
public class MapBuilder<K, V> {

    private Map<K, V> map = new HashMap<>();

	/**
	 *
	 * @return
	 */
	public static MapBuilder<String, String> envMapBuilder() {
        return new MapBuilder<>();
    }

	/**
	 *
	 * @return
	 */
	public static MapBuilder<String, Object> jsonMapBuilder() {
        return new MapBuilder<>();
    }

	/**
	 *
	 * @param key
	 * @param value
	 * @return
	 */
	public MapBuilder<K, V> put(K key, V value) {
        map.put(key, value);
        return this;
    }

	/**
	 *
	 * @return
	 */
	public Map<K, V> build() {
        return map;
    }
}
