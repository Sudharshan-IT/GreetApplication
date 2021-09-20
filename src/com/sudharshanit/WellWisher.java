package com.sudharshanit;

public class WellWisher {
	public static void wish(Greet greet) {
		greet.greet();
	}

	public static void main(String[] args) {
		Greet teluguGreet=new Telugu();
		wish(teluguGreet);
        Greet englishGreet=new English();
        wish(englishGreet);
        Greet hindiGreeting=new Hindi();
        wish(hindiGreeting);
        }

}
