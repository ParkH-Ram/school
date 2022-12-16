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
    //������ ������ ������
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
    //������ �޴� ������
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
 
public class ���߿�����2 {
    public static void main(String[] args) {
        try {
            ServerSocket serverSocket = new ServerSocket(5000);
            Socket socket = serverSocket.accept();
            System.out.println("���� ��");
            ServerSend ss = new ServerSend(socket);
            ServerReceive sr = new ServerReceive(socket);
            ss.start();
            sr.start();
            
            //Socket socket = new ServerSocket(5000).accept();
            //accept�� Scanner���� scan.nextint();���� ������ �Ѵ�
            //������ ���� ��û�� ����Ѵ�. ��û�� ������ , �� scan.nextint�� ���� ��Ȳ���� ����ڰ� �Է��� �ϵ�
            //�������� ��û�� ������ �װ��� socket�� �����Ѵ�
            
        } catch (Exception e) {
            // TODO: handle eh
        //��ȣ ���� ��Ʈ ��ȣ
    }
 
}
 