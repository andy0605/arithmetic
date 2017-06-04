package cn.xyc.sortUtil;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * 
 * 描述：从文件中获取数据并转化成数组工具类
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
@SuppressWarnings("rawtypes")
public class GetDataUtil {
	/**
	 * 
	 * @param path
	 * @return
	 */

	public static Integer[] getData(String path) {
		BufferedReader br = null;
		FileReader fr = null;
		try {
			fr = new FileReader(path);
			br = new BufferedReader(fr);
			List<Integer> temp = new ArrayList<>();
			String line = null;
			while ((line = br.readLine()) != null) {
				if (StringUtil.isNotEmpty(line)) {
					temp.add(Integer.parseInt(line.trim()));
				}
			}
			return ListToArrayUtil.toArray(temp);
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (br != null) {
				if (fr != null) {
					try {
						fr.close();
					} catch (IOException e1) {
						e1.printStackTrace();
					}
				}
				try {
					br.close();
				} catch (IOException e1) {
					e1.printStackTrace();
				}
			}
		}
		return null;

	}
}
