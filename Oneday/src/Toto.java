
/**
 * @PackageName		: 
 * @FileName		: Toto.java
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
public class Toto {
	
	private int prediction; //승무패 예측
	private int result; // 승무패 결과
	private int price;	// 걸 돈
	
	//result는 랜덤 매서드로 1~3사이의 값 랜덤으로 초기화 
	public Toto() {
		this.result = (int)((Math.random()*3)+1) ;
	}
	
	public void setgame(int pre) {
		this.prediction = pre;		
	}
	
	public void betmoney(int bet) {
		this.price = bet;		
	}
	
	//1은 승 2는 무 3은 패
	public int getResult() {
		return this.result;
	}
	
	//예측값아 결과와 같으면 3배 리턴 
	public int getPrice() {
		if (this.prediction == this.result) {
			this.price = this.price*3;
		}else {
			this.price = 0;
		}
		return this.price;
	}
	
	public int getPrediction() { return this.prediction;
	}
}
