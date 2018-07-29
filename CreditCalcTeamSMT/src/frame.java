import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JSplitPane;
import javax.swing.JCheckBox;
import org.eclipse.wb.swing.FocusTraversalOnArray;
import java.awt.Component;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class frame extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	int hissyu;
	int sentaku;
	int jiyu;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args)  {
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
		contentPane.setBorder(new EmptyBorder(5, 3, 3, 3));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(3, 5, 648, 10);
		contentPane.add(panel);
		
		JLabel label_1 = new JLabel("選択科目");
		label_1.setBounds(262, 152, 61, 16);
		contentPane.add(label_1);
		
		JLabel label_2 = new JLabel("必修科目");
		label_2.setBounds(61, 152, 61, 16);
		contentPane.add(label_2);
		
		JLabel lblNewLabel = new JLabel("必修科目");
		lblNewLabel.setBounds(279, 448, 61, 16);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("選択科目");
		lblNewLabel_1.setBounds(279, 513, 61, 16);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("自由科目");
		lblNewLabel_2.setBounds(447, 448, 61, 16);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("合計");
		lblNewLabel_3.setBounds(447, 513, 61, 16);
		contentPane.add(lblNewLabel_3);
		
		textField = new JTextField(String.valueOf(hissyu));
		textField.setBounds(283, 475, 130, 26);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField(String.valueOf(sentaku));
		textField_1.setBounds(283, 553, 130, 26);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField(String.valueOf(jiyu));
		textField_2.setBounds(471, 475, 130, 26);
		contentPane.add(textField_2);
		textField_2.setColumns(10);
		
		textField_3 = new JTextField();
		textField_3.setBounds(471, 553, 130, 26);
		contentPane.add(textField_3);
		textField_3.setColumns(10);
		
		
		
		JCheckBox checkBox = new JCheckBox("2年セミナー");
		checkBox.setBounds(28, 207, 128, 23);
		contentPane.add(checkBox);
		
		JCheckBox checkBox_1 = new JCheckBox("2年プロジェクト");
		checkBox_1.setBounds(28, 251, 149, 23);
		contentPane.add(checkBox_1);
		
		JCheckBox checkBox_2 = new JCheckBox("オブジェクト指向");
		checkBox_2.setBounds(28, 286, 149, 23);
		contentPane.add(checkBox_2);
		
		JCheckBox checkBox_3 = new JCheckBox("アプリケーションデザイン");
		checkBox_3.setBounds(28, 321, 203, 23);
		contentPane.add(checkBox_3);
		
		JCheckBox checkBox_4 = new JCheckBox("アルゴリズムA");
		checkBox_4.setBounds(28, 356, 128, 23);
		contentPane.add(checkBox_4);
		
		JCheckBox checkBox_5 = new JCheckBox("アルゴリズムB");
		checkBox_5.setBounds(28, 391, 128, 23);
		contentPane.add(checkBox_5);
		
		JCheckBox checkBox_6 = new JCheckBox("線形代数");
		checkBox_6.setBounds(28, 426, 128, 23);
		contentPane.add(checkBox_6);
		
		JCheckBox checkBox_7 = new JCheckBox("確率統計");
		checkBox_7.setBounds(28, 461, 128, 23);
		contentPane.add(checkBox_7);
		
		JCheckBox chckbxCsReadingSkills = new JCheckBox("CS Reading Skills");
		chckbxCsReadingSkills.setBounds(28, 496, 149, 23);
		contentPane.add(chckbxCsReadingSkills);
		
		JCheckBox chckbxCsOralEnglish = new JCheckBox("CS Oral English");
		chckbxCsOralEnglish.setBounds(28, 531, 128, 23);
		contentPane.add(chckbxCsOralEnglish);
		
		JCheckBox checkBox_8 = new JCheckBox("コンピュータリテラシー");
		checkBox_8.setBounds(233, 207, 191, 23);
		contentPane.add(checkBox_8);
		
		JCheckBox checkBox_9 = new JCheckBox("離散数学");
		checkBox_9.setBounds(233, 251, 128, 23);
		contentPane.add(checkBox_9);
		
		JCheckBox checkBox_10 = new JCheckBox("ビジュアルデザイン基礎");
		checkBox_10.setBounds(233, 286, 191, 23);
		contentPane.add(checkBox_10);
		
		JLabel lblNewLabel_4 = new JLabel("");
		lblNewLabel_4.setBounds(360, -1, 433, 437);
		contentPane.add(lblNewLabel_4);
		lblNewLabel_4.setIcon(new ImageIcon("../CreditCalcTeamSMT/src/school_tani_otosu_boy.png"));
		contentPane.setFocusTraversalPolicy(new FocusTraversalOnArray(new Component[]{panel}));
		
		///柴田が追加した計算箇所
		hissyu = 0;
		sentaku = 0;
		jiyu = 0;
		JButton btns = new JButton("計算する！");
		btns.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				

				//村：一旦0にする
				jiyu = 0;
				hissyu = 0;
				sentaku = 0;
				jiyu = Integer.parseInt(textField_2.getText());
				if(checkBox.isSelected()) {
					hissyu = hissyu + 2;
				}
				if(checkBox_1.isSelected()) {
					hissyu = hissyu + 2;	
				}
				if(checkBox_2.isSelected()) {
					hissyu = hissyu + 3;
				}
				if(checkBox_3.isSelected()) {
					hissyu = hissyu + 3;
				}
				if(checkBox_4.isSelected()) {
					hissyu = hissyu + 3;
				}
				if(checkBox_5.isSelected()) {
					hissyu = hissyu + 3;
				}
				if(checkBox_6.isSelected()) {
					hissyu = hissyu + 3;
				}
				if(checkBox_7.isSelected()) {
					hissyu = hissyu + 3;
				}
				if(chckbxCsReadingSkills.isSelected()) {
					hissyu = hissyu + 4;
				}
				if(chckbxCsOralEnglish.isSelected()) {
					hissyu = hissyu + 4;
				}
				
				if(checkBox_8.isSelected()) {
					sentaku = sentaku + 3;
				}
				if(checkBox_9.isSelected()) {
					sentaku = sentaku + 3;
				}
				if(checkBox_10.isSelected()) {
					sentaku = sentaku + 3;
				}
				
				
		
						textField.setText(String.valueOf(hissyu));
						textField_1.setText(String.valueOf(sentaku));
						textField_2.setText(String.valueOf(jiyu));
						textField_3.setText(String.valueOf(hissyu+sentaku+jiyu));
					}
				});
				btns.setBounds(244, 367, 117, 29);
				contentPane.add(btns);
				
				JButton button = new JButton("リセット");
				button.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						//計算結果を空欄にする
						hissyu=0;
						sentaku=0;
						jiyu=0;
						textField.setText(String.valueOf(hissyu));
						textField_1.setText(String.valueOf(sentaku));
						textField_2.setText(String.valueOf(jiyu));
						textField_3.setText(String.valueOf(hissyu+sentaku+jiyu));
						//checkboxの選択を外す
						checkBox.setSelected(false);
						checkBox_1.setSelected(false);
						checkBox_2.setSelected(false);
						checkBox_3.setSelected(false);
						checkBox_4.setSelected(false);
						checkBox_5.setSelected(false);
						checkBox_6.setSelected(false);
						checkBox_7.setSelected(false);
						checkBox_8.setSelected(false);
						checkBox_9.setSelected(false);
						checkBox_10.setSelected(false);
						chckbxCsReadingSkills.setSelected(false);
						chckbxCsOralEnglish.setSelected(false);
					}
				});
				button.setBounds(244, 408, 117, 29);
				contentPane.add(button);
				
		
	}
}
