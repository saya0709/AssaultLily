package AssaultLily;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;

import javax.sound.sampled.Clip;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JButton;
import javax.swing.JPanel;

public class Performance_5 extends JPanel {
	public JButton btnNewButton = new JButton("left");;
	public JButton btnNewButton_1 = new JButton("center");; 
	public JButton btnNewButton_2 = new JButton("right");;
	
	static int buttonCount = 0;
	
	//BGM関連
		BGM bgm ;  //BGMクラス
		Clip impactFlash; 
		Clip impactFlash1; 	
	
	public Performance_5() {
		bgm = new BGM();
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				buttonCount++;
				btnNewButton.setEnabled(false);
				IF(buttonCount);
				thirdButtonOff();
				maxbet(buttonCount);
			}
		});
		

		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				buttonCount++;
				btnNewButton_1.setEnabled(false);
				IF(buttonCount);
				thirdButtonOff();
				maxbet(buttonCount);
			}
		});
		

		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				buttonCount++;
				btnNewButton_2.setEnabled(false);
				IF(buttonCount);
				thirdButtonOff();
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
			LilyFrame.panel_1.add(new logo_1(), "logo_1");
			LilyFrame.layout.show(LilyFrame.panel_1, "logo_1");
			
//			impactFlash = BGM.createClip(new File("C:\\Users\\智志\\Desktop\\AssaultLily\\BGM\\Edel-Lilie-from-YouTube_Audio-Trimmer-_1_.wav"));
			impactFlash = BGM.createClip(new File("D:\\AssaultLily\\BGM\\アサルトリリィヘルヴォル【Fringed-iris】高画質【歌詞付き】-from-YouTube_Audio-Trimmer.wav"));

	//		FloatControl ctrl = (FloatControl)impactFlash.getControl(FloatControl.Type.MASTER_GAIN);
//			アサルトリリィヘルヴォル【Fringed iris】高画質【歌詞付き】 - from YouTube_Audio Trimmer
			
			impactFlash.loop(Clip.LOOP_CONTINUOUSLY);
			impactFlash.start();
			
			LilyFrame.panel_1.add(new NextEpisodeImages_2(), "NextEpisodeImages_2");
			LilyFrame.layout.show(LilyFrame.panel_1, "NextEpisodeImages_2");
//			ctrl.setValue(6);
		}
	}
	
	
	public void thirdButtonOff() {
		if(buttonCount==3) {
			impactFlash.stop();
			impactFlash.flush();
			impactFlash1 = BGM.createClip(new File("D:\\AssaultLily\\BGM\\アサルトリリィヘルヴォル【Fringed-iris】高画質【歌詞付き】-from-YouTube_Audio-Trimmer-_1_.wav"));
//			FloatControl ctrl1 = (FloatControl)impactFlash1.getControl(FloatControl.Type.MASTER_GAIN);
			impactFlash1.start();
			
			LilyFrame.panel_1.add(new NextEpisode_1(), "NextEpisode_2");
			LilyFrame.layout.show(LilyFrame.panel_1, "NextEpisode_2");
			
			
		}
	}
	
	
	
	public void maxbet(int buttonCount) {
		if(buttonCount==3) {
			Lever.btnNewButton.setEnabled(true);
			Performance_5.buttonCount=0;
		}
	}
	

}
