package tools;

import java.util.LinkedHashMap;
import java.util.Map;
/**
 * HashMap with Maximum size. When it reaches the maximum size, it deletes the oldest entry.
 * @author morad
 * @param <K> Key
 * @param <V> Value
 */
public class MaxSizedHashMap<K, V> extends LinkedHashMap<K, V> {
	private final int maxSize;

	public MaxSizedHashMap(int maxSize) {
		this.maxSize = maxSize;
	}

	@Override
	protected boolean removeEldestEntry(Map.Entry<K, V> eldest) {
		return size() > maxSize;
	}
}