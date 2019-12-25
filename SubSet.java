package practice.simple;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SubSet {
	public ArrayList<String> subSet(String input)
	{
		ArrayList<String>  result=new ArrayList<String>();
		findSubSet(result, new StringBuffer(), new StringBuffer(input), 0);
		return result;
	}
	public void findSubSet(ArrayList<String> result,StringBuffer resultString, StringBuffer input,int start)
	{
		result.add(resultString.toString());
		for(int i=start;i<input.length();i++)
		{
			resultString.append(input.charAt(i));
			findSubSet(result, resultString, input, i+1);
			resultString.deleteCharAt(resultString.length()-1);
			
		}
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String input=sc.next();
		SubSet subSet=new SubSet();
		ArrayList<String> allSubSet=subSet.subSet(input);
		System.out.println(allSubSet.size());
//		for(String str:allSubString )
//		{
//			System.out.println(str);
//		}
	}

}
