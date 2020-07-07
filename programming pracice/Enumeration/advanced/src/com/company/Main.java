package com.company;

public class Main {
    static void answer(Case result) {
        switch(result) {
            case NO:
                System.out.println("No");
                break;
            case YES:
                System.out.println("Yes");
                break;
            case MAYBE:
                System.out.println("Maybe");
                break;
            case LATER:
                System.out.println("Later");
                break;
            case SOON:
                System.out.println("Soon");
                break;
            case NEVER:
                System.out.println("Never");
                break;
        }}
    public static void main(String[] args) {
	choose o=new choose();
	answer(o.Answer());
    answer(o.Answer());
    answer(o.Answer());
    answer(o.Answer());
    }
}
