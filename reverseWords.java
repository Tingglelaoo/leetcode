/*leetcode 
 * Reverse Words in a String
 */
package leetcode;

import java.util.Stack;

public class reverseWords {
    public static void  main(String[] args){
    String strSource=" 1 ";//"the sky is blue"  "the   sky is blue"  "1 "
    Stack<String> strStack=new Stack<String>();
    
    String[] strArray=strSource.split(" [ ]*");
    String reverseRes="";
    for(int i=0;i<strArray.length;i++){
        if(strArray[i].equals("")){
            continue;//考虑以空格开头的字符串
        }
        else{
        strStack.push(strArray[i]);
        }
    }
    
    while(!strStack.isEmpty()){
        String tmp=strStack.pop();
        if(reverseRes.equals("")){
        reverseRes=reverseRes.concat(tmp);
        }
        else{
        reverseRes=reverseRes.concat(" ");
        reverseRes=reverseRes.concat(tmp);
        }
    }
    System.out.println(reverseRes);
    }
}
/*总结：第一、使用到数据结构的栈  Stack<String>....
 * 第二，使用到String类型的conact函数
 * 第三，谨记字符串的比较是使用equals()而不是==
 * 第四，使用到String类型的split()，其中参数为正则表达式，返回String类型的数组 String[]，这个题目要考虑单词之间可能存在不只一个空格
 * 第五，还要考虑输入字符串可能以空格开头和空格结尾，那么分割字符串的时候，可能数组中就会包含空字符串，故在入栈的时候要剔除掉
 * 第六，考虑反转之后还要以空格隔开，这里的技巧是在单词前面添加空格，而不是单词后添加空格
*/