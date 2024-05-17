package class1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class CoinCase {
	
	// 硬貨の枚数
	private int fivehundredcoincount;
	private int onehundredcoincount;
	private int fiftycoincount;
	private int tencoincount;
	private int fivecoincount;
	private int onecoincount;
	
	public CoinCase() {
		this.fivehundredcoincount = 0;
		this.onehundredcoincount = 0;
		this.fiftycoincount = 0;
		this.tencoincount = 0;
		this.fivecoincount = 0;
		this.onecoincount = 0;
	}
	
	public void AddCoins(int coin, int count) {
		switch(coin) {
			case 500:
				this.fivehundredcoincount += count;
				break;			
			case 100:
				this.onehundredcoincount += count;
				break;				
			case 50:
				this.fiftycoincount += count;
				break;			
			case 10:
				this.tencoincount += count;
				break;
			case 5:
				this.fivecoincount += count;
				break;
			case 1:
				this.onecoincount += count;
				break;

		}
	}
	
	public int GetCount(int coin) {
		switch(coin) {
			case 500:
				return this.fivehundredcoincount;		
			case 100:
				return this.onehundredcoincount;			
			case 50:
				return this.fiftycoincount;			
			case 10:
				return this.tencoincount;
			case 5:
				return this.fivecoincount;
			case 1:
				return this.onecoincount;
			default:
				return 0;
		}
	}
	
	public int GetAmount() {
		int totalamount = 0;
		
		totalamount = this.fivehundredcoincount * 500 + this.onehundredcoincount * 100 + this.fiftycoincount * 50 + this.tencoincount * 10 + this.fivecoincount * 5 + this.onecoincount * 1;
		
		return totalamount;
	}
	
	public int GetAmount(int coin) {
		
		switch(coin) {
			case 500:
				return this.fivehundredcoincount * 500;		
			case 100:
				return this.onehundredcoincount * 100;			
			case 50:
				return this.fiftycoincount * 50;			
			case 10:
				return this.tencoincount * 10;
			case 5:
				return this.fivecoincount * 5;
			case 1:
				return this.onecoincount * 1;
			default:
				return 0;
		}
	}
	
	public int GetCount() {
		int totalcount = 0;
		
		totalcount = this.fivehundredcoincount + this.onehundredcoincount + this.fiftycoincount + this.tencoincount + this.fivecoincount + this.onecoincount;
		
		return totalcount;
	}
}

public class Practice7_5_6 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		CoinCase coincase = new CoinCase();
		
		// 硬貨の追加（10回）
		for(int i = 0; i < 10; i++) {
			
			System.out.print("コインの種類を入力してください。");
			int coin = Integer.parseInt(br.readLine());
			System.out.print("コインの枚数を入力してください。");
			int count = Integer.parseInt(br.readLine());
			
			coincase.AddCoins(coin, count);
		}
		
		// 硬貨の枚数出力（全種類）
		int[] coins = {500, 100, 50, 10, 5, 1};
		for(int coin: coins) {
			System.out.println(coin + "円玉の枚数は、" + coincase.GetCount(coin) + "枚です。");
		}
		
		// 硬貨の総枚数を表示
		System.out.println("総枚数は" + coincase.GetCount() + "枚です。");
		
		// 総額を表示する
		System.out.println("総額は" + coincase.GetAmount() + "円です。");
		
	}

}
