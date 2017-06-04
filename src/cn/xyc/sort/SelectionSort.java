package cn.xyc.sort;

import cn.xyc.sortBase.SortBase;
import cn.xyc.sortUtil.GenerateDataFileUtil;
import cn.xyc.sortUtil.GetDataUtil;

/**
 * 
 * 
 * 描述：
 * 
 * <pre>
 *  
 * HISTORY 
 * **************************************************************************** 
 *  ID   DATE           PERSON          REASON 
 *  1    2017年6月4日        	Jake         	Create 
 * ****************************************************************************
 * </pre>
 * 
 * @author Jake
 * @since 1.0
 */
public class SelectionSort extends SortBase {

	/**
	 * 
	 * @param arr
	 */
	public static <T extends Comparable<T>> void sort(T[] arr) {
		for (int i = 0; i < arr.length; i++) {
			int min = i;// 记下当前元素，用于交换
			// 找出i之后的元素中最小的元素
			for (int j = i + 1; j < arr.length; j++) {
				compareCount++;// 比较次数
				if (less(arr[j], arr[min])) {
					min = j;
				}
			}
			if (min != i) {
				exchCount++;// 交换次数
				exch(arr, i, min);
			}
		}
	}

	public static void main(String[] args) {
		String path = "C:\\Users\\admin\\Desktop";
		GenerateDataFileUtil.generate(path + "/a.txt", 100000);
		Integer[] datas = GetDataUtil.getData(path + "/a.txt");
		long s = System.currentTimeMillis();
		SelectionSort.sort(datas);
		long e = System.currentTimeMillis();
		SelectionSort.show(datas);
		System.err.printf("\t排序时间:%dms",(e-s));
	}

}
