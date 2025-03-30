package q29701;

import java.util.HashMap;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		sc.nextLine();
		HashMap<String, Character>morseMap = new HashMap<>();
		
		morseMap.put(".-", 'A'); morseMap.put("-...", 'B'); morseMap.put("-.-.", 'C');
        morseMap.put("-..", 'D'); morseMap.put(".", 'E'); morseMap.put("..-.", 'F');
        morseMap.put("--.", 'G'); morseMap.put("....", 'H'); morseMap.put("..", 'I');
        morseMap.put(".---", 'J'); morseMap.put("-.-", 'K'); morseMap.put(".-..", 'L');
        morseMap.put("--", 'M'); morseMap.put("-.", 'N'); morseMap.put("---", 'O');
        morseMap.put(".--.", 'P'); morseMap.put("--.-", 'Q'); morseMap.put(".-.", 'R');
        morseMap.put("...", 'S'); morseMap.put("-", 'T'); morseMap.put("..-", 'U');
        morseMap.put("...-", 'V'); morseMap.put(".--", 'W'); morseMap.put("-..-", 'X');
        morseMap.put("-.--", 'Y'); morseMap.put("--..", 'Z');

        morseMap.put(".----", '1'); morseMap.put("..---", '2'); morseMap.put("...--", '3');
        morseMap.put("....-", '4'); morseMap.put(".....", '5'); morseMap.put("-....", '6');
        morseMap.put("--...", '7'); morseMap.put("---..", '8'); morseMap.put("----.", '9');
        morseMap.put("-----", '0');

        morseMap.put("--..--", ','); morseMap.put(".-.-.-", '.'); morseMap.put("..--..", '?');
        morseMap.put("---...", ':'); morseMap.put("-....-", '-'); morseMap.put(".--.-.", '@');
        
        // nextLine은 입력받은 전체줄을 한번에 받고, next는 공백기준 한단어 씩 입력 받음
        String morseCode = sc.nextLine();
        
        // 공백 기준으로 문자열 분리 후 각각 배열에 저장
        String array[] = morseCode.split(" ");
        //StringBuilder는 단일 문자열을 더했을 때 새로운 문자열을 생성하는 것이 아닌 기존 객체에서 변화하는 것
        StringBuilder result = new StringBuilder();
        for(String morse : array) {
        	if(morseMap.containsKey(morse)) {
        		result.append(morseMap.get(morse));
        	}
        }
        System.out.println(result.toString());
        

	}

}
