package sample.Server.inter;

public interface AuthService {
    void start();

    String getNick(String login, String password);

    void stop();
}

