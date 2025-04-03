package q28446;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

public class Main {

	public static void main(String[] args)throws IOException {
		// 입출력 속도 증가를 위해 BufferedReader, StringBuilder 사용해야함
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder(); // 빠른 출력
        int M = Integer.parseInt(br.readLine());
		HashMap<Integer, Integer> map = new HashMap<>();
		
		for(int i=0; i<M; i++) {
            String[] input = br.readLine().split(" ");
            int cmd = Integer.parseInt(input[0]);
			if(cmd == 1) {
                int x = Integer.parseInt(input[1]);
                int w = Integer.parseInt(input[2]);
				map.put(w, x);
			}else {
                int w = Integer.parseInt(input[1]);
				 sb.append(map.get(w)).append("\n"); // StringBuilder에 저장
			}
		}
        System.out.print(sb.toString()); // 한 번에 출력
        br.close();
	}

}

