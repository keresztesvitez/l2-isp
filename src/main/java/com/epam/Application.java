package com.epam;

import com.epam.cache.DefaultMonitoredCache;
import com.epam.cache.MonitoredCache;

public class Application {

	public static void main(String[] args) {
		MonitoredCache<String> cache = new DefaultMonitoredCache<>();
		use(cache);
		monitor(cache);
		winLottery(cache);
	}

	private static void monitor(MonitoredCache<String> cache) {
		Monitor stringCacheMonitor = new Monitor(cache);
		stringCacheMonitor.printInfo();
	}

	private static void use(MonitoredCache<String> stringCache) {
		CacheUser cacheUser = new CacheUser(stringCache);
		cacheUser.use();
	}

	private static void winLottery(MonitoredCache stringCache) {
		stringCache.callThisMethodToWinTheLottery();
	}

}
