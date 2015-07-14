package com;
/**
 * 问题：09-回文数字(Palindrome Number)
 * 描述：
 * @author MiracleWong
 *
 */
public class Palindrome_Number {
	public boolean isPalindrome(int x) {
        if(x < 0) {
            return false;
        }
        return x == reverse(x);    
    }
    
    public int reverse(int x) {
        int rst = 0;
        while(x != 0) {
            rst = rst * 10 + x % 10;
            x = x / 10;
        }
        return rst;
    }
}
