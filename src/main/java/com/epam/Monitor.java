package com.epam;

import com.epam.cache.MonitoredCache;

public class Monitor {

	private MonitoredCache monitoredCache;

	public Monitor(MonitoredCache monitoredCache) {
		this.monitoredCache = monitoredCache;
	}
	
	public void printInfo() {
		System.out.println("Cache info:");
		for (Object key : monitoredCache.getKeys()) {
			System.out.println("Element: " + String.valueOf(key));
			System.out.println("Last access: " + monitoredCache.getLastAccess(String.valueOf(key)));
			System.out.println("Number of hits: " + monitoredCache.getNumHits(String.valueOf(key)));
		}
	}
	
}
