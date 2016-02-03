import java.applet.*;
import java.awt.*;
import java.net.*;          // URL 클래스

public class EX extends Applet
   { 
   TextField jsTfd;

   public void init()
   {         
      setLayout(null);           
      // 단추 bt를 추가, 위치/크기 변경
      Button bt = new Button("Ok");     
      add(bt);
      bt.setBounds(10,40, 70,30);


           // 입력란 jsTfd를 추가, 위치/크기 변경     
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
            // 입력란에서 입력한 주소에 대한 URL
            URL u = new URL((String)jsTfd.getText());

            // 애플릿 컨텍스트를 text에 구한다
            AppletContext text = getAppletContext();           


                       // text의 내용을 표시
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

