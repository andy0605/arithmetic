package cn.xyc.sort;

import cn.xyc.sortBase.SortBase;
import cn.xyc.sortUtil.GenerateDataFileUtil;
import cn.xyc.sortUtil.GetDataUtil;

/**
 * 
 * 
 * 描述：
 * 选择排序：比如在一个长度为N的无序数组中，在第一趟遍历N个数据，找出其中最小的数值与第一个元素交换，第二趟遍历剩下的N-1个数据，找出其中最小的数值与第二个元素交换......第N-1趟遍历剩下的2个数据，找出其中最小的数值与第N-1个元素交换，至此选择排序完成。
 * 
 * 算法分析：
 * 
 * 平均时间复杂度：O(n2) 空间复杂度：O(1) (用于交换和记录索引) 稳定性：不稳定 （比如序列【5，
 * 5，3】第一趟就将第一个[5]与[3]交换，导致第一个5挪动到第二个5后面）
 * 
 * 特点：
 * 
 * (1)运行时间和数据是否部分有序无关
 * 
 * (2) 数据的交换次数是最少的为N
 * 
 * <pre>
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
		System.err.printf("\t排序时间:%dms", (e - s));
	}

}
