import javax.swing.*;

public class ComponentDemo {
    public static void main(String[] args) {
        //创建窗口
        JFrame jFrame=new JFrame();
        //设置窗口关闭方式S
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //设置位置
        //jFrame.setLocation(100,100);
        //设置窗口大小
        //jFrame.setSize(300,200);
        //设置位置，大小
        jFrame.setBounds(100,100,300,200);
        jFrame.setTitle("机器人AI");
        //jFrame.setIconImage();
        //窗口显示
        jFrame.setVisible(true);
    }
}
