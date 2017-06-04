package cn.xyc.sortUtil;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;

/**
 * 
 * 描述：创建生成随机数文件的工具类
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
public class GenerateDataFileUtil {

	/**
	 * 生成文件
	 * 
	 * @param path
	 * @param num
	 */
	public static void generate(String path, int num) {
		BufferedWriter bw = null;
		try {
			File file = new File(path);
			bw = new BufferedWriter(new FileWriter(file));
			int i = 1;
			Random random = new Random(num);

			while (i <= num) {
				int s = random.nextInt(num*2);
				if (s <= 0) {
					continue;
				}
				bw.write(s + System.getProperty("line.separator", "\n"));
				System.out.printf("正在生成第%d个数字：%d %n", i, s);
				i++;
			}

		} catch (IOException e) {
			e.printStackTrace();
		}finally{
			if (bw != null) {
				try {
					bw.close();
				} catch (IOException e1) {
					e1.printStackTrace();
				}
			}
		}
	}
}
