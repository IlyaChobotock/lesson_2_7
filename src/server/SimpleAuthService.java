package server;

import java.util.ArrayList;
import java.util.List;

public class SimpleAuthService implements AuthService {
    private class UserData {
        String login;
        String password;
        String nickname;

        public UserData(String login, String password, String nickname, int id) {
            this.login = login;
            this.password = password;
            this.nickname = nickname;
        }
    }

    List<UserData> users;

    public SimpleAuthService() {
        users = new ArrayList<>();
        for (int i = 1; i <= 10; i++) {
            users.add(new UserData("login" + i, "pass" + i, "nick" + i, i));
        }

        users.add(new UserData("qwe", "qwe", "qwe", 11));
        users.add(new UserData("asd", "asd", "asd", 12));
        users.add(new UserData("zxc", "zxc", "zxc", 13));
    }

    @Override
    public String getNicknameByLoginAndPassword(String login, String password) {
        for (UserData user : users) {
            if (user.login.equals(login) && user.password.equals(password)) {
                return user.nickname;
            }
        }
        return null;
    }
}
