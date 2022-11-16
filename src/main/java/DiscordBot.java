import io.github.cdimascio.dotenv.Dotenv;
import net.dv8tion.jda.api.JDABuilder;
import net.dv8tion.jda.api.OnlineStatus;

import javax.security.auth.login.LoginException;

public class DiscordBot {
    public static void main(String[] args) throws LoginException {
        final Dotenv config;
        config = Dotenv.configure().load();
        String token = config.get("TOKEN");
        JDABuilder jdaBuilder = JDABuilder.createDefault(token);
            jdaBuilder.setStatus(OnlineStatus.ONLINE);

        jdaBuilder.build();
    }
}
