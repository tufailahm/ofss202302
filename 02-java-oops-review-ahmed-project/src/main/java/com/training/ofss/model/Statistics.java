package com.training.ofss.model;

public class Statistics {
	public static float average(int... nums) {
		int sum = 0;
		for (int x : nums) { 
			sum += x;
		}
		return ((float) sum / nums.length);
	}
	public static float sum(int... nums) {
		int sum = 0;
		for (int x : nums) { 
			if(x<0)
					continue;
			sum += x;
		}
		return sum;
	}
	public static void main(String[] args) {
		System.out.println(average(12,98));
		System.out.println(average(12,98,88,886,998));
		System.out.println(average(12));
		
		System.out.println(sum(12,-98));				//12
		System.out.println(sum(12,-98,-88,-886,998));		//1010
		System.out.println(sum(12));		//12
	}


}
