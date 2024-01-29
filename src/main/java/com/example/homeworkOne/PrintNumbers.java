package com.example.homeworkOne;

public class PrintNumbers {
    private int n;
    private int m = 0;

    public void setN(int n) {
        this.n = n;
    }

    public void setM(int m) {
        this.m = m;
    }

    public PrintNumbers(int n, int m) {
        this.n = n;
        this.m = m;
    }
    public PrintNumbers(int n) {
        this.n = n;
    }
    public String printNumbers(){
        String numbers = "";
            int min = Math.min(m, n);
            int max = Math.max(m, n);
            for (int i = min; i <= max; i++) {
                numbers += i;
                if(i < max){
                    numbers += ", ";
                }
            }
        return numbers;
    }
}
