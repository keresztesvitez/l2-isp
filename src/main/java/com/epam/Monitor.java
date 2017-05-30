package com.epam;

import com.epam.cache.CacheMonitor;

public class Monitor {

	private CacheMonitor cacheMonitor;

	public Monitor(CacheMonitor cacheMonitor) {
		this.cacheMonitor = cacheMonitor;
	}
	
	public void printInfo() {
		System.out.println("Cache info:");
		for (Object key : cacheMonitor.getKeys()) {
			System.out.println("Element: " + String.valueOf(key));
			System.out.println("Last access: " + cacheMonitor.getLastAccess(String.valueOf(key)));
			System.out.println("Number of hits: " + cacheMonitor.getNumHits(String.valueOf(key)));
		}
	}
	
}
