package QAlearning;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class QAlearningPack {

	
	public static void main(String[] args) {
		
//		Flow1();
//		Flow2();
//		Flow3();
//		Flow5();
//		Coin();
//		ArrayPlay();
//		MultiArrayPlay();
//		ArrayMultiply();
//		AddingNumbersArray(22313);
//		ArrayListsDemo();
//		RiceBags(0,3);
//		BeerSong();
//		LargestPrimeChecker(455);
//		StringManipluation();
		StringManPartTwo(" four five  q12 adawasd hello  six");
	}
	
	
	public static void Flow1() {
		for(int A = 100; A<200; A++) {
			System.out.println(A);
		}
	}

	public static void Flow2() {
		
		for(int A = 100; A<=200; A++) {
			if (A%2==0) {
				System.out.println("-");
			}else{
					System.out.println("*");
				}		
		}
		
		
	}
	
	public static void Flow3() {
		for (int ORuns = 1; ORuns<=10; ORuns++) {
			for(int Run = 1; Run<=10; Run++) {
				System.out.println(ORuns);
				
			}					
		}
	}
	
	public static void Flow5() {
		for (int ORuns = 1; ORuns<=10; ORuns++) {
			for(int Run = 1; Run<=ORuns; Run++) {
				System.out.println(ORuns);
				
			}					
		}
	}
	
	public static void Coin() {
		double Cost = 4.58;
		double Pay = 20.00;
		double PayBack = Pay-Cost;
		int TwenN=0;
		int TenN=0;
		int FiveN=0;
		int TwenP=0;
		int OneP=0;
		
		PayBack =PayBack*100;
		PayBack = (int) PayBack;
		
		while (PayBack>=1) {
			if(PayBack>=2000) {
				PayBack=PayBack-2000;
				TwenN++;
			}else if(PayBack>=1000) {
				PayBack=PayBack-1000;
				TenN++;
			}else if(PayBack>=500) {
				PayBack=PayBack-500;
				FiveN++;
			}else if(PayBack>=20) {
				PayBack=PayBack-20;
				TwenP++;
			}else if(PayBack>=1) {
				PayBack=PayBack-1;
				OneP++;
			}
		}
		System.out.println(TwenN+" £20 Note "+TenN+" £10 Note "+FiveN+" £5 Note "+TwenP+" 20P's "+OneP+" 1P's ");
	}
	
	public static void ArrayPlay() {
		
		int[] ageArray = {1,2,3,4,5,6,7,8,9,10};
		
		
		long[] ageArray2 = new long[10];
		
		// for each loop
		for(int age : ageArray) {
			System.out.println(age);
		}
		// for loop
		
		for(int i = 0; i<ageArray.length; i++) {
			System.out.println(ageArray[i]);
			ageArray[i] = 123; 
			
		}
		for(int age : ageArray) {
			System.out.println(age);
		}

	}
	
	public static void MultiArrayPlay() {
		//Multidimensional Array
		//Works with String aswell
		//				   00,01,02,03,04//10,11,12,13,14 and so on ( shows the locations ) 
		int[][] ageArray= {{1,2,3,4,5},{5,4,3,2,1},{4,3,1,2,5}};
		
		// for each loop
		for (int[] a : ageArray) {
			for(int b : a) {
				System.out.println(b);
			}
		}
		// for loop double array loops you need nested loops shown above
		// for a double array you need two for loops instead of 1 shown in 'ArrayPlay'
		
	
		
		
	}
	
	public static void ArrayMultiply() {
		
		int[] ageArray = {1,2,3,4,5,6,7,8,9,10};
		// for loop
				for(int i = 0; i<ageArray.length; i++) {
					System.out.println(ageArray[i]);
					ageArray[i] = ageArray[i]*10; 
					System.out.println(ageArray[i]);
		}
	}
	
	public static void AddingNumbersArray(int num1) {
		int i=0;
		int outPutTotal = 0;
		int numbers[]= new int[10];
		
		// splitting the numbers
		while(num1!=0) {
			numbers[i]= num1%10;
			num1=num1/10;
			i++;
		}
		//adding numbers
		for(int Itwo=0; Itwo<=i; Itwo++ ) {
			outPutTotal =( outPutTotal + numbers[Itwo]);
		}
		System.out.println(outPutTotal);

		
		
		

	}
	
	public static void ArrayListsDemo() {
		
		List<Integer> Numbers = new ArrayList<Integer>();
		
		for(int i=0; i<10; i++) {
			Numbers.add(i);
			System.out.println(Numbers);
			System.out.println(Numbers.get(i));
		}
		
		for(int i=0; i < Numbers.size(); i++) {
			System.out.println(Numbers.get(i));
			Numbers.set(i, i*i);
			System.out.println(Numbers);
		}
		Numbers.remove(4);
		System.out.println(Numbers);
		Collections.reverse(Numbers);
		System.out.println(Numbers);
		Collections.sort(Numbers);
		System.out.println(Numbers);
		Collections.swap(Numbers, 0, 5);
		System.out.println(Numbers);
		Numbers.clear();
		System.out.println(Numbers);
		
	}

	public static void RiceBags(int Srice,int Brice) {
		int Br=Brice*5;
		int Totalr = Br+Srice;
		int Package=27;
		boolean Returnpackage = false;
		
		if (Srice>=1) {
			if (Totalr>Package) {
				System.out.println(Returnpackage);
			}
			else if (Totalr<Package) {
				Returnpackage = true;
				System.out.println(Returnpackage);
				
			}
		}else {
			System.out.println("-1 cannot package, you need at least 1 bag of small rice");
		}
		
	}	

	public static void BeerSong() {
		
		for(int Beer=99; Beer>=1;) {
			System.out.println(Beer+" Bottles of beer on the wall, "
					+Beer+ " bottles of beer take one down pass it around, ");
			Beer=Beer-1;
			if (Beer>0) {
			System.out.print(Beer+" bottles of beer on the wall ");
			}else{
				System.out.println("No more bottles of beer on the wall,"
						+ " no more bottles of beer. Go to the store "
						+ "and buy some more, ");
				//Beer = 99;
			}
		}
		
	}

	public static void LargestPrimeChecker(int Num) {
		List<Integer> Numbers = new ArrayList<Integer>();
		
		for(int i=1; i!=Num; i++) {
			if(Num%i == 0) {
				Numbers.add(i);
			}
		}
		for(int Ns=0; Ns<Numbers.size(); Ns++) {
			
		}
		Collections.reverse(Numbers);
		System.out.println(Numbers.get(0));	
	}

	public static void StringManipluation(){
		String myStr ="i like cake";
		String myStr2 = new String("i like cake");
		
		// if you done use equals it will say false not true because it
		//compares the object to the string
		System.out.println(myStr.equals(myStr2));
		
		for(int i = 0; i<myStr.length(); i++) {
			System.out.println(myStr.charAt(i));
		}
		System.out.println(myStr.toLowerCase());
		System.out.println(myStr.toUpperCase());
		System.out.println(myStr.charAt(3));
		System.out.println(myStr.startsWith("I"));
		System.out.println(myStr.startsWith("i"));
		System.out.println(myStr.endsWith("e"));
		System.out.println(myStr.contains("cake"));
		System.out.println("newliness --------------");
		System.out.println(myStr.substring(1,6));
		
		// doesn't matter about case sensitive
		System.out.println(myStr.equalsIgnoreCase(myStr2));
		System.out.println(myStr.replace("cake","Pancakes"));
		System.out.println(myStr2.toUpperCase()+", "+myStr.toUpperCase());
	}
	
	public static void StringManPartTwo(String Ui) {
		
		System.out.println("priting our the length of the supplyed text");
		System.out.println(Ui.length());
		Ui = Ui+" ";
		List<String> NewUI = new ArrayList<String>();
		//starting loop for all the words	
		for(int i = 0; i<Ui.length(); i++) {
			//removing spaces at start
			if(Ui.charAt(0) == ' ' ) {
				Ui = Ui.replaceFirst(" ","");
				
			// copying word when there is a space at the end
			}else if(Ui.charAt(i) == ' ') {	
				NewUI.add(Ui.substring(0,i));
				for(int K = 0; K<i; K++) {
					String Result = Ui.substring(1);
					Ui = Result;
				}
				//starting loop again
				i=0;
			// removing spaces
			if(Ui.charAt(0) == ' ' ) {
				Ui = Ui.replaceFirst(" ","");
			}
		}
		}
		System.out.println("");
		System.out.println("print each word on a new line ");
		for(int i = 0; i<NewUI.size(); i++) {
			System.out.println(NewUI.get(i));
		}
		System.out.println("");
		System.out.println("print each word on a new line in reverse ");
		for(int i = NewUI.size() - 1; i>-1; i=i-1) {
			System.out.println(NewUI.get(i));
		}

	}
}

