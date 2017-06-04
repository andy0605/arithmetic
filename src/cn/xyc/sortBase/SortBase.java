package cn.xyc.sortBase;

/**
 * 
 **************************************************************************************************
 * 排序的基类
 **************************************************************************************************
 * @author andy<br/>
 * 
 *         代码时间:2016年9月17日 下午10:58:44
 */
public class SortBase {
	public static int compareCount = 0;
	public static int exchCount = 0;

	/**
	 * 比较大小,如果a大于等于b返回false
	 * 
	 * @param a
	 * @param b
	 * @return
	 */

	public static <T extends Comparable<T>> boolean less(T a, T b) {
		return a.compareTo(b) < 0;
	}

	/**
	 * 遍历数组a
	 * 
	 * @param a
	 */
	public static <T extends Comparable<T>> void show(T[] a) {
		int i = 1;

		for (T c : a) {

			if (i % 10 == 0) {
				System.out.println(c + "\t");
			} else {
				System.out.print(c + "\t");
			}
			i++;
		}
		System.err.printf("比较次数：%d\t交换次数:%d", compareCount, exchCount);
	}

	/**
	 * 交换数组a中i和j的位置
	 * 
	 * @param arr
	 * @param i
	 * @param j
	 */
	public static <T extends Comparable<T>> void exch(T[] arr, int i, int j) {
		T t = arr[i];
		arr[i] = arr[j];
		arr[j] = t;
	}

	/**
	 * 检验数组a是否升序排列
	 * 
	 * @param a
	 * @return
	 */
	public static <T extends Comparable<T>> boolean isSorted(T[] a) {
		for (int i = 0; i < a.length; i++) {
			if (!less(a[i], a[i + 1])) {
				return false;
			}
		}
		return true;
	}

}
