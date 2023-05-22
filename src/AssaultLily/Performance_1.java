package AssaultLily;


import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;

import javax.sound.sampled.Clip;
import javax.sound.sampled.FloatControl;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JButton;
import javax.swing.JPanel;










public class Performance_1 extends JPanel {
	public JButton btnNewButton = new JButton("left");;
	public JButton btnNewButton_1 = new JButton("center");; 
	public JButton btnNewButton_2 = new JButton("right");;
	
	
	
	static int buttonCount = 0;


	//BGM関連
	BGM bgm ;  //BGMクラス
	Clip impactFlash;  //インパクトフラッシュ
	
	
	
	public Performance_1() {
		bgm = new BGM();
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				buttonCount++;
				btnNewButton.setEnabled(false);
				IF(buttonCount);
				maxbet(buttonCount);
			}
		});
		

		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				buttonCount++;
				btnNewButton_1.setEnabled(false);
				IF(buttonCount);
				maxbet(buttonCount);
			}
		});
		

		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				buttonCount++;
				btnNewButton_2.setEnabled(false);
				IF(buttonCount);
				maxbet(buttonCount);
			}
		});








		//グループレイアウト
		GroupLayout groupLayout = new GroupLayout(this);
		groupLayout.setHorizontalGroup(
				groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
						.addComponent(btnNewButton)
						.addGap(44)
						.addComponent(btnNewButton_1)
						.addGap(43)
						.addComponent(btnNewButton_2)
						.addGap(77))
				);
		groupLayout.setVerticalGroup(
				groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
						.addGap(28)
						.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
								.addComponent(btnNewButton_2)
								.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
										.addComponent(btnNewButton)
										.addComponent(btnNewButton_1)))
						.addContainerGap(46, Short.MAX_VALUE))
				);
		setLayout(groupLayout);

	}

	
	public void IF(int buttonCount) {
		if(buttonCount==1) {
			impactFlash = BGM.createClip(new File("D:\\AssaultLily\\BGM\\IF+梨璃ボイス.wav"));
			FloatControl ctrl = (FloatControl)impactFlash.getControl(FloatControl.Type.MASTER_GAIN);
			impactFlash.start();
			ctrl.setValue(6);
		}
	}
	
	public void maxbet(int buttonCount) {
		if(buttonCount==3) {
			Lever.btnNewButton.setEnabled(true);
			Performance_1.buttonCount=0;
		}
	}
	
	
	
	

}	