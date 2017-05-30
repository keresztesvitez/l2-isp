package com.epam;

import com.epam.cache.CacheMonitor;
import com.epam.cache.MonitoredCache;

public class Application {

	public static void main(String[] args) {
		CacheMonitor<String> cache = new MonitoredCache<>();
		use(cache);
		monitor(cache);
		winLottery(cache);
	}

	private static void monitor(CacheMonitor<String> cache) {
		Monitor stringCacheMonitor = new Monitor(cache);
		stringCacheMonitor.printInfo();
	}

	private static void use(CacheMonitor<String> stringCache) {
		CacheUser cacheUser = new CacheUser(stringCache);
		cacheUser.use();
	}

	private static void winLottery(CacheMonitor stringCache) {
		stringCache.callThisMethodToWinTheLottery();
	}

}
