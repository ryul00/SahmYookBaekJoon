package q27160;

import java.util.HashMap;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// 해쉬 맵 선언 <과일 과일 수>
		HashMap<String, Integer> Hali= new HashMap<>();
		// 각 과일과 과일 수를 0으로 초기화
		Hali.put("STRAWBERRY", 0);
		Hali.put("BANANA", 0);
		Hali.put("LIME", 0);
		Hali.put("PLUM", 0);
		
		int n = sc.nextInt();
		
		// 사용자 입력 값 해쉬 맵 저장, 과일 수는 해당 키(과일)에 해당 하는 값(과일 수)을 가져와서 더 해가며 갱신
		for(int i=0; i<n; i++) {
			String fruit = sc.next();
			int count = sc.nextInt();
			Hali.put(fruit, Hali.get(fruit)+ count);
		}
		sc.close();
		
		// 값이 5가 되는지 containsValue()메서드로 확인(true or false)
		if(Hali.containsValue(5) == true) {
			System.out.println("YES");
		}else {
			System.out.println("NO");
		}
		
	}

}
