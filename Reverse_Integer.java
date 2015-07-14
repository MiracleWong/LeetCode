package com;

/**
 *  题目：07-颠倒整数(Reverse Integer)
 *  描述：将一个整数中的数字进行颠倒，当颠倒后的整数溢出时，返回 0 (标记为 32 位整数)。
 * @author MiracleWong
 *
 */
public class Reverse_Integer {
	
	public int reverse(int x) {
        long ret = 0;
        
        while (x != 0) {
            ret = ret * 10 + x % 10;
            x /= 10;
        }
        
        if (ret > Integer.MAX_VALUE || ret < Integer.MIN_VALUE) {
            return 0;
        }
        
        return (int)ret;
    }
}
