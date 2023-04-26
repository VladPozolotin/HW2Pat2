package org.example;

public class BinOps {
    public String sum(String a, String b) {
        int stra = Integer.parseInt(a, 2);
        int strb = Integer.parseInt(b, 2);
        int res = stra + strb;
        return Integer.toBinaryString(res);
    }

    public String mult(String a, String b) {
        int stra = Integer.parseInt(a, 2);
        int strb = Integer.parseInt(b, 2);
        int res = stra * strb;
        return Integer.toBinaryString(res);
    }
}
