package divelnick.ru.vank.data.managers.models;


public class AccessToken {
    private String secret;
    private String userId;
    private String email;
    private String accessToken;

    public AccessToken(String secret, String userId, String email, String accessToken) {
        this.secret = secret;
        this.userId = userId;
        this.email = email;
        this.accessToken = accessToken;
    }

    public String getSecret() {
        return secret;
    }

    public String getUserId() {
        return userId;
    }

    public String getEmail() {
        return email;
    }

    public String getAccessToken() {
        return accessToken;
    }
}
