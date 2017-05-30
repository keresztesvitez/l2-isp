package com.epam.cache;

import java.util.Date;
import java.util.WeakHashMap;

public class MonitoredCache<T> implements CacheMonitor<T> {

    private WeakHashMap<String, T> cache = new WeakHashMap<String, T>();
    private long hitCounter;
    private Date lastAccess;

    @Override
    public void put(String key, T value) {
        cache.put(key, value);
    }

    @Override
    public T get(String key) {
        hitCounter++;
        lastAccess = new Date();
        return cache.get(cache);
    }

    @Override
    public void clear(String key) {
        cache.remove(key);
    }

    @Override
    public void clearAll() {
        cache.clear();
    }

    @Override
    public Iterable<String> getKeys() {
        return cache.keySet();
    }

	@Override
	public Date getLastAccess(String key) {
		return lastAccess;
	}

	@Override
	public long getNumHits(String key) {
		return hitCounter;
	}

	@Override
	public void callThisMethodToWinTheLottery() {
        System.out.println("You won! :)");
    }
}
