import java.awt.*;  
import java.awt.event.*;  
class Mou {  
    static Frame f;  
    static Color sss;
    static int siz=25;
    
    public static void main(String[] args) {  
        f=new Frame("Mouse Adapter");  
        f.addWindowListener(new WindowAdapter(){  
            public void windowClosing(WindowEvent e) {  
                f.dispose();  
            }  
        }); 

        Button b1=new Button("");
        b1.setBounds(30,50,30,30); 
        b1.setBackground(Color.BLUE);

        Button b2=new Button("Erase");
        b2.setBounds(70,50,50,30);
        b2.setBackground(Color.WHITE); 

        Button b3=new Button("");
        b3.setBounds(30,90,30,30); 
        b3.setBackground(Color.RED);

        Button b4=new Button("");
        b4.setBounds(30,130,30,30); 
        b4.setBackground(Color.ORANGE);

        Button b5=new Button("");
        b5.setBounds(30,170,30,30); 
        b5.setBackground(Color.BLACK);

        Button b6=new Button("");
        b6.setBounds(30,210,30,30); 
        b6.setBackground(Color.MAGENTA);

        Button b7=new Button("+");
        b7.setBounds(70,90,30,30);

        Button b8=new Button("-");
        b8.setBounds(70,130,30,30);

        sss=Color.BLUE;
        
        b1.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){  
                sss=Color.BLUE;
            }
        });

        b3.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){  
                sss=Color.RED;
                
            }
        });

        b4.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){  
                sss=Color.ORANGE;
                
            }
        });

        b2.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){  
                sss=Color.WHITE;
                
            }
        });

        b5.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){  
                sss=Color.BLACK;
                
            }
        });

        b6.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){  
                sss=Color.MAGENTA;
                
            }
        });

        b7.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){  
                siz+=10;
            }
        });

        b8.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){  
                siz-=10;
            }
        });

        f.add(b1);
        f.add(b3);
        f.add(b4);
        f.add(b5);
        f.add(b6);
        f.add(b7);
        f.add(b8);

        f.add(b2);

        f.addMouseMotionListener(new MouseMotionAdapter(){
            public void mouseDragged(MouseEvent e){  
            Graphics g=f.getGraphics();  
            g.setColor(sss);  
            if(sss==Color.WHITE){
                g.fillOval(e.getX(),e.getY(),siz,siz);  
            }
            else{
                g.fillOval(e.getX(),e.getY(),siz,siz);  
            }
        }
        }); 

        f.setSize(1300,900);
        f.setLayout(null);  
        f.setVisible(true);     
    }  
}