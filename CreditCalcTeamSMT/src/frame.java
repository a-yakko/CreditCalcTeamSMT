import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JSplitPane;
import javax.swing.JCheckBox;

public class frame extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frame frame = new frame();
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
	public frame() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 654, 654);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JCheckBox checkBox1 = new JCheckBox("2年セミナー");
		JCheckBox checkBox2 = new JCheckBox("2年プロジェクト");
		JCheckBox checkBox3 = new JCheckBox("オブジェクト指向");
		JCheckBox checkBox4 = new JCheckBox("アプリケーションデザイン");
		JCheckBox checkBox5 = new JCheckBox("アルゴリズムA");
		JCheckBox checkBox6 = new JCheckBox("アルゴリズムB");
		
		contentPane.add(checkBox1, BorderLayout.WEST);
		contentPane.add(checkBox2, BorderLayout.WEST);
		contentPane.add(checkBox3, BorderLayout.WEST);
		contentPane.add(checkBox4, BorderLayout.WEST);
		contentPane.add(checkBox5, BorderLayout.WEST);
		contentPane.add(checkBox6, BorderLayout.WEST);
	}

}
