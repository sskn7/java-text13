
public class forbunouyou {

	public static void main(String[] args) {
		// for文の応用(入れ子)
		
		//ある数(i)が、初期値１から１０以下の間で、
		//iが偶数の場合は、iを表示する
		for (int i = 1;i <= 10;i++) {
			if (i%2==0) {
				System.out.println(i);
			}
		}
		
		//変数ｂが初期値１から４未満の間、ｂを3回繰り返す
		//変数cが初期値１から3未満の間、上記のfor文を繰り返す
		for (int b =1;b<3;b++) {
			for (int c=1; c<4; c++) {
				System.out.println(b);
			}
		}
		
		//条件演算子
		//条件式が正しい場合は式１を実行、
		//間違いの場合は式２を実行する
		
		//ある数が０以上だった場合、プラス
		//0未満だった場合、マイナス、表記する
		int d = 10;
		String e = d> 0 ? "プラス":"マイナス";
		System.out.println(e);
		
		//ある数ｆが偶数か奇数かを判別
		int f = 2;
		String g= f%2==0 ? "偶数" : "奇数";
		System.out.println(g);
		
		//ある数iが偶数の場合「☆」
		//奇数の場合「★」を表示
		//これをiが0以上、5以下の間繰り返す
		for(int i=0; i<=5;i++) {
			String h = i%2==0? "☆":"★";
			System.out.println(h);
		}

	}

}
