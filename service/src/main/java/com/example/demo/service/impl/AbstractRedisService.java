//package com.example.demo.service.impl;
//
//import com.example.demo.service.RedisActService;
//import com.example.demo.service.RedisService;
//
//import java.util.*;
//import java.util.concurrent.TimeUnit;
//
///**
// * @author wangkai
// * @date 2018-05-24 11:13
// * @desc com.example.demo.service.impl
// */
//public abstract class AbstractRedisService implements RedisService, RedisActService {
//	@Override public Boolean expire(String key, long timeout, TimeUnit timeUnit) {
//		System.out.println(key);
//		return null;
//	}
//
//	@Override public Boolean expireAt(String key, Date date) {
//		return null;
//	}
//
//	@Override public Long getExpire(String key) {
//		return null;
//	}
//
//	@Override public Long getExpire(String key, TimeUnit timeUnit) {
//		return null;
//	}
//
//	@Override public void delete(String key) {
//
//	}
//
//	@Override public void delete(String... keys) {
//
//	}
//
//	@Override public void delete(Collection<String> keys) {
//
//	}
//
//	@Override public Boolean hasKey(String key) {
//		return null;
//	}
//
//	@Override public void rename(String oldKey, String newKey) {
//
//	}
//
//	@Override public Boolean renameIfAbsent(String oldKey, String newKey) {
//		return null;
//	}
//
//	@Override public <T> T get(String key) {
//		return null;
//	}
//
//	@Override public <T> T get(String key, long start, long end) {
//		return null;
//	}
//
//	@Override public <T> T getAndSet(String key, T value) {
//		return null;
//	}
//
//	@Override public <T> T getBit(String key, long offset) {
//		return null;
//	}
//
//	@Override public <E> List<E> multiGet(Collection<String> keys) {
//		return null;
//	}
//
//	@Override public Integer append(String key, String value) {
//		return null;
//	}
//
//	@Override public void set(String key, Object value) {
//
//	}
//
//	@Override public void set(String key, Object value, long offset) {
//
//	}
//
//	@Override public void set(String key, Object value, long timeout, TimeUnit timeUnit) {
//
//	}
//
//	@Override public Boolean setBit(String key, long offset, boolean value) {
//		return null;
//	}
//
//	@Override public Boolean setIfAbsent(String key, Object value) {
//		return null;
//	}
//
//	@Override public void multiSet(Map<String, Object> map) {
//
//	}
//
//	@Override public Boolean multiSetIfAbsent(Map<String, Object> map) {
//		return null;
//	}
//
//	@Override public Long increment(String key) {
//		return null;
//	}
//
//	@Override public Double incrementBy(String key, double increment) {
//		return null;
//	}
//
//	@Override public Long incrementBy(String key, long increment) {
//		return null;
//	}
//
//	@Override public Long decrement(String key) {
//		return null;
//	}
//
//	@Override public Double decrementBy(String key, Double decrement) {
//		return null;
//	}
//
//	@Override public Long decrementBy(String key, long decrement) {
//		return null;
//	}
//
//	@Override public void hDel(String key, String... hashKeys) {
//
//	}
//
//	@Override public <V> Map<String, V> hGetAll(String key) {
//		return null;
//	}
//
//	@Override public <T> T hGet(String key, Object hashKey) {
//		return null;
//	}
//
//	@Override public <E> List<E> hGets(String key, Collection<String> hashKeys) {
//		return null;
//	}
//
//	@Override public Long hIncrement(String key, String hashKey) {
//		return null;
//	}
//
//	@Override public Double hIncrementBy(String key, String hashKey, double increment) {
//		return null;
//	}
//
//	@Override public Long hIncrementBy(String key, String hashKey, long increment) {
//		return null;
//	}
//
//	@Override public Long hDecrement(String key, String hashKey) {
//		return null;
//	}
//
//	@Override public Double hDecrementBy(String key, String hashKey, Double decrement) {
//		return null;
//	}
//
//	@Override public Long hDecrementBy(String key, String hashKey, long decrement) {
//		return null;
//	}
//
//	@Override public Boolean hHasHashKey(String key, String hashKey) {
//		return null;
//	}
//
//	@Override public <E> Set<E> hHashKeys(String key) {
//		return null;
//	}
//
//	@Override public <E> List<E> hValues(String key) {
//		return null;
//	}
//
//	@Override public void hPut(String key, String hashKey, Object value) {
//
//	}
//
//	@Override public Boolean hPutIfAbsent(String key, String hashKey, Object value) {
//		return null;
//	}
//
//	@Override public void hPutAll(String key, Map<String, Object> map) {
//
//	}
//
//	@Override public <T> T lIndex(String key, Long index) {
//		return null;
//	}
//
//	@Override public Long lLen(String key) {
//		return null;
//	}
//
//	@Override public void lSet(String key, long index, Object value) {
//
//	}
//
//	@Override public void lRemove(String key, long index, Object value) {
//
//	}
//
//	@Override public <E> List<E> lRange(String key, long start, long end) {
//		return null;
//	}
//
//	@Override public void lTrim(String key, long start, long end) {
//
//	}
//
//	@Override public <T> T leftPop(String key) {
//		return null;
//	}
//
//	@Override public <T> T leftPop(String key, Long timeout, TimeUnit timeUnit) {
//		return null;
//	}
//
//	@Override public Long lLeftPush(String key, Object value) {
//		return null;
//	}
//
//	@Override public Long lLeftPush(String key, Object pivot, Object value) {
//		return null;
//	}
//
//	@Override public Long lLeftPushAll(String key, Object... values) {
//		return null;
//	}
//
//	@Override public Long lLeftPushAll(String key, Collection values) {
//		return null;
//	}
//
//	@Override public Long lLeftPushIfPresent(String key, Object value) {
//		return null;
//	}
//
//	@Override public <T> T lRightPop(String key) {
//		return null;
//	}
//
//	@Override public <T> T lRightPop(String key, Long timeout, TimeUnit timeUnit) {
//		return null;
//	}
//
//	@Override public Long lRightPush(String key, Object value) {
//		return null;
//	}
//
//	@Override public Long lRightPush(String key, Object pivot, Object value) {
//		return null;
//	}
//
//	@Override public Long lRightPushAll(String key, Object... values) {
//		return null;
//	}
//
//	@Override public Long lRightPushAll(String key, Collection values) {
//		return null;
//	}
//
//	@Override public Long lRightPushIfPresent(String key, Object value) {
//		return null;
//	}
//
//	@Override public <T> T lRightPopAndLeftPush(String sourceKey, String destinationKey) {
//		return null;
//	}
//
//	@Override public <T> T lRightPopAndLeftPush(String sourceKey, String destinationKey, Long timeout,
//			TimeUnit timeUnit) {
//		return null;
//	}
//
//	@Override public Long sAdd(String key, Object... values) {
//		return null;
//	}
//
//	@Override public <E> Set<E> sDifference(String key, String otherKey) {
//		return null;
//	}
//
//	@Override public <E> Set<E> sDifference(String key, Collection<String> otherKeys) {
//		return null;
//	}
//
//	@Override public Long sDifferenceAndStore(String key, String otherKey, String destKey) {
//		return null;
//	}
//
//	@Override public Long sDifferenceAndStore(String key, Collection<String> otherKeys, String destKey) {
//		return null;
//	}
//
//	@Override public <E> Set<E> sIntersect(String key, String otherKey) {
//		return null;
//	}
//
//	@Override public <E> Set<E> sIntersect(String key, Collection<String> otherKeys) {
//		return null;
//	}
//
//	@Override public Long sIntersectAndStore(String key, String otherKey, String destKey) {
//		return null;
//	}
//
//	@Override public Long sIntersectAndStore(String key, Collection<String> otherKeys, String destKey) {
//		return null;
//	}
//
//	@Override public <E> Set<E> sUnion(String key, String otherKey) {
//		return null;
//	}
//
//	@Override public <E> Set<E> sUnion(String key, Collection<String> otherKeys) {
//		return null;
//	}
//
//	@Override public Long sUnionAndStore(String key, String otherKey, String destKey) {
//		return null;
//	}
//
//	@Override public Long sUnionAndStore(String key, Collection<String> otherKeys, String destKey) {
//		return null;
//	}
//
//	@Override public Boolean sIsMember(String key, Object value) {
//		return null;
//	}
//
//	@Override public <E> Set<E> sMembers(String key) {
//		return null;
//	}
//
//	@Override public Boolean sMove(String key, Object value, String destKey) {
//		return null;
//	}
//
//	@Override public <T> T sPop(String key) {
//		return null;
//	}
//
//	@Override public <T> T sRandomMember(String key) {
//		return null;
//	}
//
//	@Override public <E> List<E> sRandomMembers(String key, long count) {
//		return null;
//	}
//
//	@Override public <E> Set<E> sDistinctRandomMembers(String key, long count) {
//		return null;
//	}
//
//	@Override public Long sRemove(String key, Object... values) {
//		return null;
//	}
//
//	@Override public Boolean zAdd(String key, Object value, double score) {
//		return null;
//	}
//
//	@Override public <T> Long zAdd(String key, Map<T, Double> values) {
//		return null;
//	}
//
//	@Override public Long zCount(String key, double min, double max) {
//		return null;
//	}
//
//	@Override public Double zIncrementScore(String key, Object value, double increment) {
//		return null;
//	}
//
//	@Override public Double zDecrementScore(String key, Object value, double decrement) {
//		return null;
//	}
//
//	@Override public Long zIntersectAndStore(String key, String otherKey, String destKey) {
//		return null;
//	}
//
//	@Override public Long zIntersectAndStore(String key, Collection<String> otherKeys, String destKey) {
//		return null;
//	}
//
//	@Override public <E> Set<E> zRange(String key, long start, long end) {
//		return null;
//	}
//
//	@Override public <E> Set<E> zRangeByScore(String key, double min, double max) {
//		return null;
//	}
//
//	@Override public <E> Set<E> zRangeByScore(String key, double min, double max, long offset, long count) {
//		return null;
//	}
//
//	@Override public <E> Set<E> zReverseRange(String key, long start, long end) {
//		return null;
//	}
//
//	@Override public <E> Set<E> zReverseRangeByScore(String key, double min, double max) {
//		return null;
//	}
//
//	@Override public <E> Set<E> zReverseRangeByScore(String key, double min, double max, long offset, long count) {
//		return null;
//	}
//
//	@Override public Long zUnionAndStore(String key, String otherKey, String destKey) {
//		return null;
//	}
//
//	@Override public Long zUnionAndStore(String key, Collection<String> otherKeys, String destKey) {
//		return null;
//	}
//
//	@Override public Long zRank(String key, Object value) {
//		return null;
//	}
//
//	@Override public Long zReverseRank(String key, Object value) {
//		return null;
//	}
//
//	@Override public Long zRemove(String key, Object value) {
//		return null;
//	}
//
//	@Override public Long zRemove(String key, Object... values) {
//		return null;
//	}
//
//	@Override public Long zRemove(String key, Collection<Object> values) {
//		return null;
//	}
//
//	@Override public Long zRemoveRange(String key, long start, long end) {
//		return null;
//	}
//
//	@Override public Long zRemoveRangeByScore(String key, double min, double max) {
//		return null;
//	}
//
//	@Override public Double zScore(String key, Object value) {
//		return null;
//	}
//
//	@Override public Long zCard(String key) {
//		return null;
//	}
//}
