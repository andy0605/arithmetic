package cn.xyc.sortUtil;

/**
 * 
 * 描述：字符串工具类
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
public class StringUtil {
	/**
	 * 
	 * @param string
	 * @return
	 */
	public static boolean isNotEmpty(String string) {
		if (string == null || string.trim().length() <= 0) {
			return false;
		}
		return true;
	}

}
