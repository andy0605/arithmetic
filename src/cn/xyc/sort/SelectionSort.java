package cn.xyc.sort;

import cn.xyc.sortBase.SortBase;

/**
 * 
 **************************************************************************************************
 * 选择排序：每次选出剩余元素中最小的元素<br/>
 * 1、找到最小的那个元素 <br/>
 * 2、将最小的元素与第一个元素进行交换位置<br/>
 * 3、以此类推知道最后一个元素
 **************************************************************************************************
 * @author andy<br/>
 * 
 *         代码时间:2016年9月17日 下午11:28:46
 */
@SuppressWarnings("rawtypes")
public class SelectionSort extends SortBase {

	/**
	 * 将a进行升序排列
	 * 
	 * @param a
	 */
	public static void sort(Comparable[] a) {
		for (int i = 0; i < a.length; i++) {
			int min = i;// 最小元素的位置
			for (int j = i + 1; j < a.length - 1; j++) {
				if (less(a[j], a[min])) {
					min = j;
				}
			}
			if (min != i) {
				exch(a, i, min);
			}
		}

	}

	public static void main(String[] args) {
		
	}

}
