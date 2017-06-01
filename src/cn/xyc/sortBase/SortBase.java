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
@SuppressWarnings({ "rawtypes", "unchecked" })
public class SortBase {

	/**
	 * 比较大小,如果a大于等于b返回false
	 * 
	 * @param a
	 * @param b
	 * @return
	 */

	public static boolean less(Comparable a, Comparable b) {
		return a.compareTo(b) < 0;
	}

	/**
	 * 遍历数组a
	 * 
	 * @param a
	 */
	public static void show(Comparable[] a) {
		int i = 1;
		for (Comparable c : a) {
			if (i % 10 == 0) {
				System.out.println();
			} else {
				System.out.print(c + "\t");
			}
		}
	}

	/**
	 * 交换数组a中i和j的位置
	 * 
	 * @param a
	 * @param i
	 * @param j
	 */
	public static void exch(Comparable[] a, int i, int j) {
		Comparable t = a[i];
		a[i] = a[j];
		a[j] = t;
	}

	/**
	 * 检验数组a是否升序排列
	 * 
	 * @param a
	 * @return
	 */
	public static boolean isSort(Comparable[] a) {
		for (int i = 0; i < a.length; i++) {
			if (!less(a[i], a[i + 1])) {
				return false;
			}
		}
		return true;
	}

}
