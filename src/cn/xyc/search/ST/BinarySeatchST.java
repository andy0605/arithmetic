package cn.xyc.search.ST;

/**
 * 
 **************************************************************************************************
 * 查找：基于有序数组的查找<br/>
 * 1、 Keys[]数组存储键<br/>
 * 2、Value[]数组存储值<br/>
 **************************************************************************************************
 * @author andy<br/>
 * 
 *         代码时间:2016年10月24日 下午9:44:39
 */
public class BinarySeatchST<Key extends Comparable<Key>, Value> {
	private Key[] keys;
	private Value[] vals;

	private int N;// 符号表中元素的个数

	/**
	 * 初始化符号表
	 * 
	 * @param n
	 */
	@SuppressWarnings("unchecked")
	public BinarySeatchST(int n) {
		keys = (Key[]) new Comparable[n];
		vals = (Value[]) new Comparable[n];
		N = 0;
	}

	public int size() {
		return N;
	}

	public Value get(Key key) {
		if (isEmpty()) {
			return null;
		}
		int temp = rank(key);
		if (N > temp && key.compareTo(keys[temp]) == 0) {
			return vals[temp];
		} else {
			return null;
		}
	}

	/**
	 * 添加
	 * 
	 * @param key
	 * @param val
	 */
	public void put(Key key, Value val) {

		int temp = rank(key);
		// 找到就替换F
		if (temp < N && key.compareTo(keys[temp]) == 0) {
			vals[temp] = val;
			return;
		}

		for (int j = N; j > temp; j--) {
			keys[j] = keys[j - 1];
			vals[j] = vals[j - 1];
		}

		keys[temp] = key;
		vals[temp] = val;
		N++;
	}

	/**
	 * 
	 * @return
	 */
	public boolean isEmpty() {
		return N == 0;
	}

	/**
	 * 二分查找:
	 * 
	 * @param key
	 * @return
	 */
	public int rank(Key key) {
		int lo = 0, hi = N - 1;

		while (lo < hi) {
			int mid = lo + (hi - lo) / 2;
			if (keys[mid].compareTo(key) < 0) {
				lo = mid + 1;
			} else if (keys[mid].compareTo(key) > 0) {
				hi = mid - 1;
			} else {
				return mid;
			}
		}
		return lo;
	}

	public int rank_1(Key key, int lo, int hi) {
		if (hi < lo) {
			return lo;
		}
		int mid = lo + (hi - lo) / 2;
		if (key.compareTo(keys[mid]) < 0) {
			return rank_1(key, lo, mid - 1);
		} else if (key.compareTo(keys[mid]) > 0) {
			return rank_1(key, mid + 1, hi);
		} else {
			return mid;
		}
	}

}
