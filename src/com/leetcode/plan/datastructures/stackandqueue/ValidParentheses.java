package com.leetcode.plan.datastructures.stackandqueue;

import java.util.*;

/**
 * 给定一个只包括 '('，')'，'{'，'}'，'['，']' 的字符串 s ，判断字符串是否有效。

有效字符串需满足：

左括号必须用相同类型的右括号闭合。
左括号必须以正确的顺序闭合。

 *
 */

public class ValidParentheses {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
    public boolean isValid(String s) {
        Stack<Character>stack = new Stack<Character>();
        for(char c: s.toCharArray()){
            if(c=='(')
            	stack.push(')');
            else if(c=='[')
            	stack.push(']');
            else if(c=='{')
            	stack.push('}');
            else if (stack.isEmpty())
            	return false;
            else if(c!=stack.pop())
            	return false;
        }
        return stack.isEmpty();
    }
}
