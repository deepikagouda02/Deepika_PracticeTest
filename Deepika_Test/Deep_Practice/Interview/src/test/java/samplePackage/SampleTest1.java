package samplePackage;

import org.testng.annotations.Test;

public class SampleTest1 {
	
		/*	* 
			* * 
			* * * 
			* * * * 
			* * * * *  				*/
	
	@Test
	public void testMethod1() {
		int n=5;
		for(int i=1; i<=n;i++) {
			
			for(int j=1;j<=i;j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}
	
	/*	* * * * * 
		* * * * 
		* * * 
		* * 
		* 				*/

	@Test
	public void testMethod2() {
		int n=5;
		for(int i=1; i<=n;i++) {
			
			for(int j=i;j<=n;j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}
	
	
	
	/*	     *
		    **
		   ***
		  ****
		 *****
	 				*/

	@Test
	public void testMethod3() {
		int n=5;
		for(int i=1; i<=n;i++) {
			for(int j=i;j<=n;j++) {
				System.out.print(" ");
			}
			
			for(int j=1;j<=i;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
	
		/*			 *****
					  ****
					   ***
					    **
					     *								*/
	
	
	@Test
	public void testMethod4() {
		int n=5;
		for(int i=1; i<=n;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print(" ");
			}
			
			for(int j=i;j<=n;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
	
	
	/*			     *
				    ***
				   *****
				  *******
				 *********				*/


	@Test
	public void testMethod5() {
		int n=5;
		for(int i=1; i<=n;i++) {
			for(int j=i;j<=n;j++) {
				System.out.print(" ");
			}
			for(int j=1;j<i;j++) {
				System.out.print("*");
			}
			
			for(int j=1;j<=i;j++) {
				System.out.print("*");
			}
			
			System.out.println();
		}
	}
	
	/*			         *********
						  *******
						   *****
						    ***
						     *				*/

	
	@Test
	public void testMethod6() {
		int n=5;
		for(int i=1; i<=n;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print(" ");
			}
			for(int j=i;j<n;j++) {
				System.out.print("*");
			}
			
			for(int j=i;j<=n;j++) {
				System.out.print("*");
			}
			
			System.out.println();
		}
	}	
/*	

    *
   ***
  *****
 *******
*********
 *******
  *****
   ***
    *
	
*/	
	@Test
	public void testMethod7() {
		int n=5;
		for(int i=1; i<n;i++) {
			for(int j=i;j<=n;j++) {
				System.out.print(" ");
			}
			for(int j=1;j<i;j++) {
				System.out.print("*");
			}
			
			for(int j=1;j<=i;j++) {
				System.out.print("*");
			}
			
			System.out.println();
		}
		
		for(int i=1; i<=n;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print(" ");
			}
			for(int j=i;j<n;j++) {
				System.out.print("*");
			}
			
			for(int j=i;j<=n;j++) {
				System.out.print("*");
			}
			
			System.out.println();
		}
		
		
	}
	
	
/*
	
	1 
	1 1 
	1 1 1 
	1 1 1 1 
	1 1 1 1 1
*/	
	
	@Test
	public void testMethod8() {
		int n=5;
		for(int i=1; i<=n;i++) {
			
			for(int j=1;j<=i;j++) {
				System.out.print("1 ");
			}
			System.out.println();
		}
	}
	
	
	
/*	
	1 
	2 2 
	3 3 3 
	4 4 4 4 
	5 5 5 5 5
*/	
	
	@Test
	public void testMethod9() {
		int n=5;
		for(int i=1,p=1; i<=n;i++,p++) {
			
			for(int j=1;j<=i;j++) {
				System.out.print(p+" ");
			}
			System.out.println();
		}
	}
	
/*	
	
	5 
	4 4 
	3 3 3 
	2 2 2 2 
	1 1 1 1 1 
*/	
	@Test
	public void testMethod10() {
		int n=5;
		for(int i=1,p=5; i<=n;i++,p--) {
			
			for(int j=1;j<=i;j++) {
				System.out.print(p+" ");
			}
			System.out.println();
		}
	}
	
	
/*	
	
	0 
	2 2 
	4 4 4 
	6 6 6 6 
	8 8 8 8 8
*/	
	@Test
	public void testMethod11() {
		int n=5;
		for(int i=1,p=0; i<=n;i++,p+=2) {
			
			for(int j=1;j<=i;j++) {
				System.out.print(p+" ");
			}
			System.out.println();
		}
	}	
	
	
	
/*	
	
	1 
	2 2 
	1 1 1 
	2 2 2 2 
	1 1 1 1 1 
*/	
	@Test
	public void testMethod12() {
		int n=5;
		for(int i=1; i<=n;i++) {
			
			for(int j=1;j<=i;j++) {
				if(i%2==0) {
					System.out.print("2 ");
				}else {
					System.out.print("1 ");
				}
			}
			System.out.println();
		}
	}	
	
/*	
	
    1
   222
  33333
 4444444
555555555
 6666666
  77777
   888
    9	
	
*/	
	
	
	@Test
	public void testMethod13() {
		int n=5,p=1;
		for(int i=1; i<n;i++,p++) {
			for(int j=i;j<=n;j++) {
				System.out.print(" ");
			}
			for(int j=1;j<i;j++) {
				System.out.print(p);
			}
			
			for(int j=1;j<=i;j++) {
				System.out.print(p);
			}
			
			System.out.println();
		}
		
		for(int i=1; i<=n;i++,p++) {
			for(int j=1;j<=i;j++) {
				System.out.print(" ");
			}
			for(int j=i;j<n;j++) {
				System.out.print(p);
			}
			
			for(int j=i;j<=n;j++) {
				System.out.print(p);
			}
			
			System.out.println();
		}
		
		
	}
	
	
	
	
	
/*	
	
     1
    222
   33333
  4444444
 555555555
  4444444
   33333
    222
     1	
	
*/	
	
	
	@Test
	public void testMethod14() {
		int n=5;
		for(int i=1,p=1; i<n;i++,p++) {
			for(int j=i;j<=n;j++) {
				System.out.print(" ");
			}
			for(int j=1;j<i;j++) {
				System.out.print(p);
			}
			
			for(int j=1;j<=i;j++) {
				System.out.print(p);
			}
			
			System.out.println();
		}
		
		for(int i=1,p=n; i<=n;i++,p--) {
			for(int j=1;j<=i;j++) {
				System.out.print(" ");
			}
			for(int j=i;j<n;j++) {
				System.out.print(p);
			}
			
			for(int j=i;j<=n;j++) {
				System.out.print(p);
			}
			
			System.out.println();
		}
		
		
	}
	
	
/*
	
	1 
	1 2 
	1 2 3 
	1 2 3 4 
	1 2 3 4 5 
*/	
	
	@Test
	public void testMethod15() {
		int n=5;
		for(int i=1; i<=n;i++) {
			int p=1;
			for(int j=1;j<=i;j++) {
				System.out.print(p++ +" ");
			}
			System.out.println();
		}
	}	
	

/*
	
	1 
	1 2 
	1 2 3 
	1 2 3 4 
	1 2 3 4 5 
*/	
	
	@Test
	public void testMethod16() {
		int n=5;
		for(int i=1; i<=n;i++) {
			int p=1;
			for(int j=1;j<=i;j++) {
				System.out.print(p++ +" ");
			}
			System.out.println();
		}
	}	

/*
	
1 
2 3 
4 5 6 
7 8 9 10 
11 12 13 14 15 
*/	
	
	@Test
	public void testMethod17() {
		int n=5;int p=1;
		for(int i=1; i<=n;i++) {
			
			for(int j=1;j<=i;j++) {
				System.out.print(p++ +" ");
			}
			System.out.println();
		}
	}	
	
	
/*	

	 12345
	  1234
	   123
	    12
	     1

*/
	
	
	@Test
	public void testMethod18() {
		int n=5;
		for(int i=1; i<=n;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print(" ");
			}
			
			for(int j=i,p=1;j<=n;j++,p++) {
				System.out.print(p);
			}
			System.out.println();
		}
	}
	

/*
	
    1
   123
  12345
 1234567
123456789	

	
*/
	
	@Test
	public void testMethod19() {
		int n=5;
		for(int i=1; i<=n;i++) {
			int p=1;
			for(int j=i;j<=n;j++) {
				System.out.print(" ");
			}
			for(int j=1;j<i;j++,p++) {
				System.out.print(p);
			}
			
			for(int j=1;j<=i;j++,p++) {
				System.out.print(p);
			}
			
			System.out.println();
		}
	}
	
	
	
	
	
/*
	
5 
5 4 
5 4 3 
5 4 3 2 
5 4 3 2 1 
*/	
	
	@Test
	public void testMethod20() {
		int n=5;
		for(int i=1; i<=n;i++) {
			int p=n;
			for(int j=1;j<=i;j++) {
				System.out.print(p-- +" ");
			}
			System.out.println();
		}
	}	
	
	
	
/*	

 54321
  5432
   543
    54
     5
*/
	
	
	@Test
	public void testMethod21() {
		int n=5;
		for(int i=1; i<=n;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print(" ");
			}
			
			for(int j=i,p=5;j<=n;j++,p--) {
				System.out.print(p);
			}
			System.out.println();
		}
	}
	
	
	
	/*	

 54321
  4321
   321
    21
     1
     
	*/
		
		
		@Test
		public void testMethod22() {
			int n=5;
			for(int i=1,k=n; i<=n;i++,k--) {
				int p=k;
				for(int j=1;j<=i;j++) {
					System.out.print(" ");
				}
				
				for(int j=i;j<=n;j++) {
					System.out.print(p--);
				}
				System.out.println();
			}
		}
	
	
/*
		
     1
    121
   12321
  1234321
 123454321
 
 
	*/
		
		@Test
		public void testMethod23() {
			int n=5;
			for(int i=1; i<=n;i++) {
				int p=1;
				for(int j=i;j<=n;j++) {
					System.out.print(" ");
				}
				for(int j=1;j<i;j++) {
					System.out.print(p++);
				}
				
				for(int j=1;j<=i;j++) {
					System.out.print(p--);
				}
				
				System.out.println();
			}
		}	

	
}
