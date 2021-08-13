package com.demo;

class outerClass {

	static int out_x= 10;
	int out_y = 20;
	private int out_z =30;
	
	//local Inner class: 
		public void print() {
			int no_final_j =30;
			final int final_k =40;

			class Inner {
				public void display() {
					//no_final_j = 40; // you cant change value of it.
					System.out.println("x"+out_x);
					System.out.println("y"+out_y);
					System.out.println("z"+out_z);
					
					System.out.println("j"+no_final_j);
					System.out.println("k"+final_k);
				}
			}
			Inner inner = new Inner();
			inner.display();
			
		}
	

//	  class InnerClass{
//		void print() {
//			System.out.println("x"+out_x);
////			System.out.println("y"+out_y);
////			System.out.println("z"+out_z);
//		}
//		//you can use when create static innerclass
////		static void prints() {
////			System.out.println("xyy"+out_x);
////
////		}
//	}
	
	
	
		
}
