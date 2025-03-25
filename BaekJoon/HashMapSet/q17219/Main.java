package q17219;

import java.util.HashMap;
import java.util.Scanner;

public class Main {

	public static void main(String[] args){
//        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
//        
//        // 첫 번째 줄에서 N과 M을 한 번에 읽어오기
//        String[] input = bf.readLine().split(" ");
//        int N = Integer.parseInt(input[0]);
//        int M = Integer.parseInt(input[1]);
		
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int M = sc.nextInt();
		HashMap<String, String> map = new HashMap<>();
		
		for(int i=0; i<N; i++) {
//            String[] siteInfo = bf.readLine().split(" ");
//            String site = siteInfo[0];
//            String password = siteInfo[1];
            
			String site = sc.next();
			String password = sc.next();
			map.put(site, password);
		}
		
		for(int i=0; i<M; i++) {
//            String siteToFind = bf.readLine();
			
			String findPwd = sc.next();
			if(map.containsKey(findPwd)) {
				System.out.println(map.get(findPwd));
			}
		}
//		bf.close();
		sc.close();

	}

}
