import java.applet.*;
import java.awt.*;
import java.net.*;          // URL Ŭ����

public class EX extends Applet
   { 
   TextField jsTfd;

   public void init()
   {         
      setLayout(null);           
      // ���� bt�� �߰�, ��ġ/ũ�� ����
      Button bt = new Button("Ok");     
      add(bt);
      bt.setBounds(10,40, 70,30);


           // �Է¶� jsTfd�� �߰�, ��ġ/ũ�� ����     
      jsTfd = new TextField("http://www.kbs.co.kr/", 50);
      add(jsTfd);     
      jsTfd.setBounds(10, 10, 200, 25);
   }


     public boolean action(Event evt, Object arg)
   { 
      if (arg.equals("Ok"))                
      { 
         try
         { 
            // �Է¶����� �Է��� �ּҿ� ���� URL
            URL u = new URL((String)jsTfd.getText());

            // ���ø� ���ؽ�Ʈ�� text�� ���Ѵ�
            AppletContext text = getAppletContext();           


                       // text�� ������ ǥ��
            text.showDocument(u);
         }
         catch(Exception e)
         { 
            showStatus("Error : " + e);
         }
      }
      else
         return super.action(evt, arg);
         return true;
      }
}

