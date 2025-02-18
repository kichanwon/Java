package edu.kh.array.ex;

import java.util.Arrays;
import java.util.Scanner;
import java.util.SortedSet;

public class ArrayExample2 {
	Scanner sc = new Scanner(System.in);
	
	public void shallowCopy() {
		int[] arr= {1,2,3,4,5};
		
		int[] copyArr = arr; //address copy
		
		System.out.println("변경 전\narr주소"+arr);
		System.out.println("copyArr주소"+copyArr);
		System.out.println("arr주소"+Arrays.toString(arr));
		System.out.println("copyArr주소"+Arrays.toString(copyArr));
		System.out.println();
	}
	
	public void deepCopy() {
		int[] arr= {1,2,3,4,5};
		int[] copyArr = arr;
		int[] copyArr1 = Arrays.copyOf(arr, arr.length); //data copy
		int[] copyArr2= new int[arr.length];
		System.arraycopy(arr, 0, copyArr2, 0, arr.length); //data copy
		
		System.out.println("변경 전\narr주소"+arr);
		System.out.println("copyArr주소"+copyArr);
		System.out.println("copyArr1주소"+copyArr1);
		System.out.println("copyArr2주소"+copyArr2);
		
		System.out.println("arr:"+Arrays.toString(arr));
		System.out.println("copyArr:"+Arrays.toString(copyArr));
		System.out.println("copyArr1:"+Arrays.toString(copyArr1));
		System.out.println("copyArr2:"+Arrays.toString(copyArr2));
		
		copyArr[3]=9;
		copyArr1[3]=99;
		copyArr2[3]=999;

		System.out.println("변경 후\narr주소"+arr);
		System.out.println("copyArr주소"+copyArr);
		System.out.println("copyArr1주소"+copyArr1);
		System.out.println("copyArr2주소"+copyArr2);
		
		System.out.println("arr:"+Arrays.toString(arr));
		System.out.println("copyArr:"+Arrays.toString(copyArr));
		System.out.println("copyArr1:"+Arrays.toString(copyArr1));
		System.out.println("copyArr2:"+Arrays.toString(copyArr2));
	}
	
	
	
	public void createLottoNum() {
		int[] lottoNum = new int[6];

		
		for(int i=0;i<lottoNum.length;i++) {
			int random =(int)(Math.random()*45+1);
			lottoNum[i]=random; // 0.0<=random<1.0  # 1포함 안됨
			
			for(int j=0;j<i;j++) {
				if (random==lottoNum[j]) {i--; break;}
			}
		}
		
//		int tmp;
//		for(int i=0;i<lottoNum.length;i++) {
//			if (lottoNum[i]<lottoNum[i+1]) {
//				tmp=lottoNum[i];
//				lottoNum[i]=lottoNum[i-1];
//			}
//		}
		
		Arrays.sort(lottoNum);
		System.out.println(Arrays.toString(lottoNum));
		
	}
		
}
