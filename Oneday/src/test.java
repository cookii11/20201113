import java.util.Scanner;
/**
 * @PackageName		: 
 * @FileName		: test.java
 * @Since			: 2020. 9. 2
 * @Author			: KB
 * @Description		: 
 * =====================================================================================
 * 								   Modification History
 * =====================================================================================
 * Date				Author				Note
 * -------------------------------------------------------------------------------------
 * 2020. 9. 2		KB				최초 작성
 *
 */
public class test {

	/**
	 * @MethodName		: main
	 * @Since			: 2020. 9. 2
	 * @author			: KB
	 * @Description		: 
	 *
	 * @param args
	 *
	 */
	public static void main(String[] args) {
		//사용 클래스 객체화
		Character character = new Character();
		Display display = new Display();
		Meal lunchbox = new Meal(0,10);
		Meal gisa = new Meal(5000,20);
		Meal ashley = new Meal(10000,30);	
		Meal hotelBuffet = new Meal(50000,90);
		Scanner sc= new Scanner(System.in);
		
		//시작
		display.opening();
		
		//8일간 시행
		while(character.getNowDay()<8) {
			
			//일어나고 처음에는 겟업 표시
			display.getup();
			
			
			//매일 첫 일과는 토토
			Toto toto = new Toto();
			display.beforeBuyToto();
			
			switch (sc.nextInt()) {
			case 1:
				display.afterBuyToto();
				toto.setgame(sc.nextInt());
				System.out.println("금액을 입력하세요.");
				int bet= sc.nextInt();
				toto.betmoney(bet);
				character.decreaseMoney(bet);
				break;
			case 2:
				break;
			}
			
			//토토 후 오후 9시 전까지 메인 선택지 반복시행
			while(character.getNowTime()<41) {
				
				display.mainMenu();
				switch (sc.nextInt()) {
					case 1:
						display.startWork();
						int randomTime = (int)((Math.random()*4)+1);
						int randomStress = (int)((Math.random()*50));
						Customer customer = new Customer(randomStress,randomTime);
						character.work(customer.getTime(),customer.getStress());
						display.stat(character.getMoney(),character.getStress(),character.getNowDay(),character.getNowTime());
						character.goHospital();
					break;
					case 2:
						display.chooseMeal();
						switch (sc.nextInt()) {
							case 1:
								character.eat(lunchbox.getStress(),lunchbox.getMoney());
								display.lunchbox(lunchbox.getStress());
								display.stat(character.getMoney(),character.getStress(),character.getNowDay(),character.getNowTime());
								
								break;
							case 2:
								character.eat(gisa.getStress(),gisa.getMoney());
								display.gisa(gisa.getStress(),gisa.getMoney());
								display.stat(character.getMoney(),character.getStress(),character.getNowDay(),character.getNowTime());
								break;
							case 3:
								character.eat(ashley.getStress(),ashley.getMoney());
								display.ashley(ashley.getStress(),ashley.getMoney());
								display.stat(character.getMoney(),character.getStress(),character.getNowDay(),character.getNowTime());
								break;
							case 4:
								character.eat(hotelBuffet.getStress(),hotelBuffet.getMoney());
								display.hotelBuffet(hotelBuffet.getStress(),hotelBuffet.getMoney());
								display.stat(character.getMoney(),character.getStress(),character.getNowDay(),character.getNowTime());
								break;
						}
						break;
					
					case 3:
						System.out.println("휴식");
						character.rest();
						display.stat(character.getMoney(),character.getStress(),character.getNowDay(),character.getNowTime());
						break;
				}
				if (character.checkEnding()==character.ENDING_DEAD
						|| character.checkEnding()==character.ENDING_PASAN
						|| character.checkEnding()==character.ENDING_SUCCESS
						) {
					break;
				}	
			
			}
			if (character.checkEnding()==character.ENDING_DEAD
					|| character.checkEnding()==character.ENDING_PASAN
					|| character.checkEnding()==character.ENDING_SUCCESS
					) {
				break;
			} //일과 끝
			
			
			
			display.resultToto(toto.getResult());
			if (toto.getPrediction() == toto.getResult()) {
				display.winToto();
			}else {
				display.loseToto();
			}
			character.increaseMoney(toto.getPrice());
			
			if (character.checkEnding()==character.ENDING_DEAD
					|| character.checkEnding()==character.ENDING_PASAN
					|| character.checkEnding()==character.ENDING_SUCCESS
					) {
				break;
			}
			//시행 후 잠자기
			display.sleep();
			character.setMorning(true);
		}
		display.ending(character.checkEnding());
		}
	}


