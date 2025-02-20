package q18870;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;

public class Main {

	public static void main(String[] args) throws IOException {
		// 배열 입력 받기
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int len = Integer.parseInt(bf.readLine());
        int [] arr = new int[len];
 
        String[] inputs = bf.readLine().split(" ");
        for (int i = 0 ; i < len ; i++) {
            arr[i] = Integer.parseInt(inputs[i]);
        }
        
        // 원본 배열 중복제거 + 오름차순 정렬
        int[] check = Arrays.stream(arr).distinct().toArray();
        Arrays.sort(check);
        
        // 이진 탐색으로 정렬배열의 각 원소가 원본배열에서 몇번 인덱스인지 찾음 + 공백 포함 출력
          for (int i : arr) {
            int index = Arrays.binarySearch(check, i);
            bw.write(index+" ");
        }
    
    bw.flush();
    bw.close();
    bf.close();
    }


}
