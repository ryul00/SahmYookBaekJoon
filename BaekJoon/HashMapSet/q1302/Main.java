package q1302;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		HashMap<String, Integer> map = new HashMap<>();
		
		//입력
		for(int i=0; i<N; i++) {
			String title = sc.next();
			map.put(title, map.getOrDefault(title, 0) + 1);
		}
		sc.close();
		
		String FeqTitle = "";
		int maxCount = 0;
		
		// 기존 해시맵인 map을 Set형태(entrySet)로 변환하여 개별 키,값을 분리하여 사용할 수 있음
		for(Map.Entry<String, Integer> entry : map.entrySet()) {
			int count = entry.getValue();
			String key = entry.getKey();
			
			if(count > maxCount) {
				maxCount = count;
				FeqTitle = key;
			}else if (count == maxCount) {
				// key가 기존 FeqTitle보다 사전순으로 더 크면 음수 반환, 해당 key를 FeqTitle로 대체
				if(key.compareTo(FeqTitle) < 0) {
					FeqTitle = key;
				}
			}
		}
		System.out.println(FeqTitle);
		
	}

}
