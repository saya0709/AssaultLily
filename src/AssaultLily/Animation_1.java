package AssaultLily;

import javax.swing.ImageIcon;
import javax.swing.JLabel;

public class Animation_1 extends Thread {
	public JLabel label;//ラベルのフィールド
	public ImageIcon[] imgs;
	public int num;

		

	public Animation_1(JLabel label ,ImageIcon[] imgs, int num){
		this.label=label;
		this.imgs=imgs;
		this.num=num;
	}

	
	public void run(){
		for(int i =0;;i++){
			try {
				sleep(800);
			} catch (InterruptedException e) {
				// TODO 自動生成された catch ブロック
				e.printStackTrace();
			}
//			label.setIcon(imgs.get(i%6));
//			label.setIcon(imgs[i%6]);  //ちかる
			label.setIcon(imgs[i%this.num]);  //エヴァ
		}
	}

}
