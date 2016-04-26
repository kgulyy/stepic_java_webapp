package accounts;

import java.util.HashMap;
import java.util.Map;

/**
 * @author k.gulyy
 */
public class AccountService {
    private final Map<String, UserProfile> loginToProfile;
    private final Map<String, UserProfile> sessionIdToProfile;

    public AccountService() {
        loginToProfile = new HashMap<>();
        sessionIdToProfile = new HashMap<>();
    }

    public UserProfile getUserByLogin(String login) {
        return loginToProfile.get(login);
    }

    public void addUser(UserProfile userProfile) {
        loginToProfile.put(userProfile.getLogin(), userProfile);
    }

    public UserProfile getUserBySessionId(String sessionId) {
        return sessionIdToProfile.get(sessionId);
    }

    public void addSession(String sessionId, UserProfile userProfile) {
        sessionIdToProfile.put(sessionId, userProfile);
    }

    public void deleteSession(String sessionId) {
        sessionIdToProfile.remove(sessionId);
    }
}
