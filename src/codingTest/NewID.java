package codingTest;


public class NewID {

	public static void main(String[] args) {
		String new_id = "0abcdefghijklmn.p";
		new_id = new_id.toLowerCase();
		String caseString = "";
		String answer ="";
		//불필요 문자 제거
		System.out.println(new_id.charAt(0));
		for(int i=0; i<new_id.length(); i++) {
			if(new_id.charAt(i) == 46 || new_id.charAt(i) == 45
			|| new_id.charAt(i) == 95 ||new_id.charAt(i) ==0
			|| new_id.charAt(i) >=97 &&  new_id.charAt(i) <=122
			|| new_id.charAt(i) >=49 &&  new_id.charAt(i) <=57) {
				caseString +=String.valueOf(new_id.charAt(i));
			}
			
		}
		System.out.println(caseString +"문자제거");
		//.여러개 제거
		while(caseString.contains("..")) {
			caseString = caseString.replace("..",".");
		}
		System.out.println(caseString+"..제거");
		//앞 뒤 . 제거
		if (String.valueOf(caseString.charAt(0)).equals(".")) {
			caseString =caseString.substring(1, caseString.length());
		}
		try {
			if (String.valueOf(caseString.charAt(caseString.length()-1)).equals(".")) {
				caseString =caseString.substring(0, caseString.length()-1);
			} 
		}catch (Exception e) {
				// TODO: handle exception
			}
		System.out.println(caseString + "앞뒤 . 제거");
		// 빈문자열이면 a
		if (caseString.isEmpty()) {
			caseString = "a";
		}
		System.out.println(caseString + "빈문자열이면 a");
		// 15개문자만
		if (caseString.length()>=16) {
			caseString = caseString.substring(0,15);
		}
		System.out.println(caseString + "15글자만");
		if (caseString.length() ==2) {
			caseString += caseString.charAt(caseString.length()-1);
		}
		if (caseString.length() == 1) {
			caseString += caseString.charAt(caseString.length()-1);
			caseString += caseString.charAt(caseString.length()-1);
		}
		System.out.println(caseString + "2글자 이하면 마지막 글자 붙이기");
		if (String.valueOf(caseString.charAt(0)).equals(".")) {
			caseString =caseString.substring(1, caseString.length());
		}
		try {
			if (String.valueOf(caseString.charAt(caseString.length()-1)).equals(".")) {
				caseString =caseString.substring(0, caseString.length()-1);
			} 
		}catch (Exception e) {
				// TODO: handle exception
			}
		answer = caseString;
		System.out.println(answer);
		
		
	}

}
