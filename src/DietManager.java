import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class DietManager extends JFrame{

    public DietManager() {
        setTitle("개인 맞춤 섭취 열량 및 체중 관리");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Container c = getContentPane();
        c.setLayout(new BorderLayout());
//성졀 선택(라디오 버튼)
        JPanel topPanel = new JPanel(new GridLayout(4, 2, 5, 5));

        topPanel.add(new JLabel("성별 선택: ", SwingConstants.RIGHT));
        JPanel genderPanel = new JPanel(new FlowLayout(FlowLayout.LEFT));

        JRadioButton maleB = new JRadioButton("남성");
        JRadioButton femaleB = new JRadioButton("여성", true);

        ButtonGroup genderGroup = new ButtonGroup();
        genderGroup.add(maleB);
        genderGroup.add(femaleB);

        genderPanel.add(maleB);
        genderPanel.add(femaleB);
        topPanel.add(genderPanel);
//몸무게 입력칸
        topPanel.add(new JLabel("현재 몸무게(kg): ", SwingConstants.RIGHT));
        JTextField currentWeightField = new JTextField(10);
        topPanel.add(currentWeightField);

        topPanel.add(new JLabel("목표 몸무게(kg): ", SwingConstants.RIGHT));
        JTextField targetWeightField = new JTextField(10);
        topPanel.add(targetWeightField);

        JButton calcBtn = new JButton("목표 칼로리 설정");
        topPanel.add(calcBtn);

//음식 입력 칸
        JPanel centerPanel = new JPanel(new BorderLayout());

        JPanel inputPanel = new JPanel(new FlowLayout());
        inputPanel.add(new JLabel("먹은 음식 칼로리: "));

        JTextField foodCalorieField = new JTextField(10);
        inputPanel.add(foodCalorieField);

        JButton addFoodB = new JButton("입력하기");
        inputPanel.add(addFoodB);
        centerPanel.add(inputPanel, BorderLayout.NORTH);

        JTextArea logArea = new JTextArea(8, 20);
        logArea.setEditable(false);
        logArea.setText("=== 오늘의 식단 기록 ===\n");
        JScrollPane scrollPane = new JScrollPane(logArea);
        centerPanel.add(scrollPane, BorderLayout.CENTER);

//남은 칼로리 표시
        JPanel bottomPanel = new JPanel(new BorderLayout());

        JLabel statusLabel = new JLabel("오늘 남은 섭취 가능 칼로리: 0 kcal", SwingConstants.CENTER);

        JProgressBar calorieBar = new JProgressBar(0, 100);
        calorieBar.setValue(0);
        calorieBar.setStringPainted(true);
        calorieBar.setForeground(new Color(50, 205, 50));

        bottomPanel.add(statusLabel, BorderLayout.NORTH);
        bottomPanel.add(calorieBar, BorderLayout.SOUTH);

//임시 칸 설정
        c.add(topPanel, BorderLayout.NORTH);
        c.add(centerPanel, BorderLayout.CENTER);
        c.add(bottomPanel, BorderLayout.SOUTH);
//목표 칼로리 설정 버튼
        calcB.addActionListener(new ActionListener() {calcB.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {

                    int currentWeight = Integer.parseInt(currentWeightField.getText());
                    int targetWeight = Integer.parseInt(targetWeightField.getText());

                    int targetCalorie = 0;
                    if (maleB.isSelected()) {
                        // 남성 공식 넣기
                    } else {
                        // 여성 공식 넣
                    }

                    calorieBar.setMaximum(targetCalorie);
                    calorieBar.setValue(0);

                    statusLabel.setText("오늘 남은 섭취 가능 칼로리: " + targetCalorie + " kcal");
                    JOptionPane.showMessageDialog(null, "목표 칼로리: " + targetCalorie , "설정 완료", JOptionPane.INFORMATION_MESSAGE);

                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(null, "몸무게 다시 입력", "입력 오류", JOptionPane.ERROR_MESSAGE);
                }
            }
        });

        setSize(500, 580);
        setVisible(true);
    }

    public static void main(String[] args) {
        new DietManager();
    }

}