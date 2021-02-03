package Condition.test;
public class SwitchRandomTest5 {
	public static void main(String[] args) {
		//dice 1~6 ������ ������ �������� �ڵ带 ����....
		int dice = (int)(Math.random()*6)+1;
		String message = "";
		switch(dice) {
		case 1:
			message = "Dice 1";
			break;
		case 2:
			message = "Dice 2";
			break;
		case 3:
			message = "Dice 3";
			break;
		case 4:
			message = "Dice 4";
			break;
		case 5:
			message = "Dice 5";
			break;
		default:
			message = "Dice 6";		
		}
		System.out.println(message);
	}
}








