package server;

public interface AuthService {
    /**
     * @return null если пользоватаеля нет
     */
    String getNicknameByLoginAndPassword(String login, String password);
}
