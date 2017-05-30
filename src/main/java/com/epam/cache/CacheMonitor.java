package com.epam.cache;

import java.util.Date;

public interface CacheMonitor<T> extends Cache<T> {

   	Date getLastAccess(String key);

	long getNumHits(String key);

	// It would be great to implement this
	void callThisMethodToWinTheLottery();

    Iterable<String> getKeys();
}
