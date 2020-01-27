
import java.awt.*;
import java.awt.event.*;
public class Add implements ActionListener
{
Label l1,l2,l3;
TextField t1,t2,t3;
Frame f;
Button b1,b2;
Add()
{
f=new Frame("Addition");
l1=new Label("enter a value");
l2=new Label("enter b value");
l3=new Label("Result");
t1=new TextField(20);
t2=new TextField(20);
t3=new TextField(20);
b1=new Button("Add");
b2=new Button("cancel");
f.add(l1);
f.add(t1);
f.add(l2);
f.add(t2);
f.add(b1);
f.add(b2);
f.add(l3);
f.add(t3);
f.setVisible(true);
f.setLayout(new FlowLayout(50));
f.setSize(300,300);
b1.addActionListener(this);
b2.addActionListener(this);
f.setBackground(Color.black);
}
public void actionPerformed(ActionEvent ee)
{
if((ee.getSource()).equals(b1))
{
int a=Integer.parseInt(t1.getText());
int b=Integer.parseInt(t2.getText());
int c=a+b;
t3.setText(String.valueOf(c));
}
else
{
f.setVisible(false);
}
}
public static void main(String...z)
{
new Add();
}
}