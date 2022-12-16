package test;



import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;
 
class ServerSend extends Thread{
    Socket socket;
    public ServerSend(Socket socket) {
        this.socket = socket;
 
    }
    //서버가 보내는 스레드
    @Override
    public void run() {
        BufferedWriter bw=null;
        Scanner input = new Scanner(System.in);
        
        try {
            while (true) {
                bw = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
                bw.write(input.nextLine()+"\n");
                bw.flush();
                
            }
        } catch (Exception e) {
            if (bw!=null) {
                try {
                    bw.close();                    
                } catch (Exception e2) {
                }
            }
        }
 
    }
}
class ServerReceive extends Thread{
    Socket socket;
    public ServerReceive(Socket socket) {
        this.socket = socket;
    }
    //서버가 받는 스레드
    @Override
    public void run() {
        BufferedReader br = null;
        
        try {
            while (true) {
                br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
                System.out.println(br.readLine());
                
            }
            
        } catch (Exception e) {
            try {
                if (br!=null) {
                    br.close();
                }
            } catch (Exception e2) {
            }
        }
    }
}
 
public class 나중에보기2 {
    public static void main(String[] args) {
        try {
            ServerSocket serverSocket = new ServerSocket(5000);
            Socket socket = serverSocket.accept();
            System.out.println("연결 됨");
            ServerSend ss = new ServerSend(socket);
            ServerReceive sr = new ServerReceive(socket);
            ss.start();
            sr.start();
            
            //Socket socket = new ServerSocket(5000).accept();
            //accept가 Scanner에서 scan.nextint();같은 역할을 한다
            //소켓을 열고 요청을 대기한다. 요청이 들어오면 , 즉 scan.nextint와 같은 상황에서 사용자가 입력을 하듯
            //소켓으로 요청이 들어오면 그것을 socket에 대입한다
            
        } catch (Exception e) {
            // TODO: handle eh
        //괄호 안의 포트 번호
    }
 
}
 