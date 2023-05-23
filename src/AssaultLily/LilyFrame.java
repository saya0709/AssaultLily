package AssaultLily;

import java.awt.CardLayout;
import java.awt.EventQueue;

import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.border.EmptyBorder;
//2023/05/23/08:55//////
public class LilyFrame extends JFrame {

	private JPanel contentPane;
//	public static JPanel panel;
	static CardLayout layout;
	public static JPanel buttonPanel;
	
	
	static CardLayout layout_2;
	public static JPanel buttonPanel_2;
	
	
	static JPanel panel_1;
	JPanel panel_2;
	static JPanel panel_3;
	JPanel panel_4;
	
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LilyFrame frame = new LilyFrame();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public LilyFrame() {
		//フレーム基本設定
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 455, 357);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		
		//フレーム上部(パネル)
		panel_1 = new JPanel();  //上部パネル
		layout = new CardLayout();  //カードレイアウト
		panel_1.setLayout(layout);  //上部パネルにカードレイアウトをセット
				
		
		panel_1.add(new HomeImage_1(), "HomeImage_1");
		panel_1.add(new HomeImage_777(), "HomeImage_777");
		panel_1.add(new logo_1(), "logo_1");
		panel_1.add(new NextEpisode_1(), "NextEpisode_1()");
		
		
		
//		JPanel panel_1 = new JPanel();
		
		//maxbet、レバーパネル
		panel_2 = new Lever();
		
		
		//ボタンパネル
		panel_3 = new JPanel();
		layout_2 = new CardLayout();
		panel_3.setLayout(layout_2);
		panel_3.add(new ButtonPanel(), "ButtonPanel");
		panel_3.add(new Performance_0(), "Performance_0");
		panel_3.add(new Performance_1(), "Performance_1");
		panel_3.add(new Performance_2(), "Performance_2");
		panel_3.add(new Performance_3(), "Performance_3");
		panel_3.add(new Performance_4(), "Performance_4");
		panel_3.add(new Performance_5(), "Performance_5");
		
		
		
//		panel_3 = new Performance_2();
//		panel_4 = new Performance_1();
		
		
		
		//グループレイアウト
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(Alignment.TRAILING, gl_contentPane.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING)
						.addGroup(Alignment.LEADING, gl_contentPane.createSequentialGroup()
							.addComponent(panel_1, GroupLayout.PREFERRED_SIZE, 417, GroupLayout.PREFERRED_SIZE)
							.addGap(12))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addComponent(panel_2, GroupLayout.PREFERRED_SIZE, 110, GroupLayout.PREFERRED_SIZE)
							.addGap(18)
							.addComponent(panel_3, GroupLayout.PREFERRED_SIZE, 289, Short.MAX_VALUE)))
					.addGap(0))
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addComponent(panel_1, GroupLayout.PREFERRED_SIZE, 222, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING)
						.addComponent(panel_2, GroupLayout.PREFERRED_SIZE, 86, GroupLayout.PREFERRED_SIZE)
						.addComponent(panel_3, GroupLayout.DEFAULT_SIZE, 83, Short.MAX_VALUE))
					.addGap(2))
		);
		

		
		contentPane.setLayout(gl_contentPane);

		


//		//フレーム上部(パネル)
//		panel = new JPanel();  //上部パネル
//		layout = new CardLayout();  //カードレイアウト
//		panel.setLayout(layout);  //上部パネルにカードレイアウトをセット
//
//		panel.add(new MisatoRoom(), "MisatoRoom");  //通常時、ミサトの部屋
//		panel.add(new NextEpisodeImages(), "NextEpisodeImages");  //レバーオン時、次回予告画像
//		panel.add(new NextEpisodeImage(),"nextEpisodeImage");  //第3ボタン停止時、次回予告「最後のシ者」

		
		
		
		//パネルのグループレイアウトのコード
		
		
		
		
		
		


		
	}
}
