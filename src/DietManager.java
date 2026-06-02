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
    }

}