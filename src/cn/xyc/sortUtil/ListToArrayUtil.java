package cn.xyc.sortUtil;

import java.util.List;

/**
 * 
 * 描述：将集合转换成数组
 * 
 * <pre>
 * HISTORY
 * ****************************************************************************
 *  ID   DATE           PERSON          REASON
 *  1    2016年10月3日        80002253         Create
 * ****************************************************************************
 * </pre>
 * 
 * @author 蒙奇·D·许
 * @since 1.0
 */
public class ListToArrayUtil {
	public static Integer[] toArray(List<Integer> temp) {
		Integer[] com = new Integer[temp.size()];
		for (int j = 0; j < temp.size(); j++) {
			com[j] =  temp.get(j);
		}
		return com;

	}

}
