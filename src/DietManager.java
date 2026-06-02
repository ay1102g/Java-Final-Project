import javax.swing.*;
import java.awt.*;

public class DietManager extends JFrame{

    public DietManager() {
        setTitle("개인 맞춤 섭취 열량 및 체중 관리");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Container c = getContentPane();
        c.setLayout(new BorderLayout());

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

        topPanel.add(new JLabel("현재 몸무게(kg): ", SwingConstants.RIGHT));
        JTextField currentWeightField = new JTextField(10);
        topPanel.add(currentWeightField);

        topPanel.add(new JLabel("목표 몸무게(kg): ", SwingConstants.RIGHT));
        JTextField targetWeightField = new JTextField(10);
        topPanel.add(targetWeightField);

        JButton calcBtn = new JButton("목표 칼로리 설정");
        topPanel.add(calcBtn);


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
    }

}