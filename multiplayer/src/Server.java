import jakarta.websocket.OnClose;
import jakarta.websocket.OnMessage;
import jakarta.websocket.OnOpen;
import jakarta.websocket.Session;
import jakarta.websocket.server.ServerEndpoint;

import java.io.IOException;
import java.util.*;


@ServerEndpoint("/endpoint")
public class Server {


    //Chat Endpoint code from Websocket Lecture
    private static Set<Session> peers =
            Collections.synchronizedSet(new HashSet<Session>());

    //when session is opened add peer
    @OnOpen
    public void onOpen(Session peer){
        peers.add(peer);
    }

    //when session is closed remove peer
    @OnClose
    public void onClose(Session peer){
        peers.remove(peer);
    }

    @OnMessage
    public void onMessage(Session session, String message){

        System.out.println("Message :   " + message);


        for (Session peer : peers){
            if (!peer.equals(session)){
                try{
                    peer.getBasicRemote().sendText(message);
                } catch (IOException e){
                    System.out.println(e.getMessage());
                }
            }
        }
    }
}

