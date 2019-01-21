package 지식이늘었다;

public class 브레이크와리턴의차이 {

	/**

	 * 

	 * @author h3xis9

	 *

	 * 루프문에서 break와 return 사이에 차이가 있는지 알아보기 위해 만듬.

	 * 

	 * return은 해당 메소드가 호출된 곳까지 종료시켜버림

	 */

		public static void main(String[] args){

			

			System.out.println("==========for-break");

			for(int i=0; i<10; i++){

				if(i==3) break;

				System.out.println(i);

			}

			System.out.println("break는 해당 roop만 종료시키지만, return은 해당 루프문을 가진 메소드를 종료시킴");



			System.out.println("==========for-return");

			for(int i=0; i<10; i++){

				if(i==3) return;

				System.out.println(i);

			}

			

			System.out.println("return이 실행되어 main메소드가 종료되어 이 문장은 실행되지 않는다");

		}

		

	}

