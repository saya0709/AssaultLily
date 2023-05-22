package AssaultLily;

import java.util.Random;

public class Lottery {
	//フィールド
	private int lotteryNum;
	Random rand = new Random();
	
	//コンストラクタ
	public Lottery() {
		super();
		
		lotteryNum = rand.nextInt(6);
		System.out.println("lotterNum : " + getLotteryNum());
	}




	//getter, setter
	public int getLotteryNum() {
		return lotteryNum;
	}

	public void setLotteryNum(int lotteryNum) {
		this.lotteryNum = lotteryNum;
	}


}
