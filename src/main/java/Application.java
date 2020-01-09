import com.github.ka4ok85.wca.Engage;
import com.github.ka4ok85.wca.config.SpringConfig;
import org.springframework.context.annotation.Import;

@Import(SpringConfig.class)

public class Application {

    public static void main(String[] args) {
//TODO implemenentieren

        //DEVELOPMENT
    }

    public Engage getEngage() {
        return new Engage(6, "0b412575-759d-4321-a467-4b87a831c1c4", "0d2dadeb-850a-45da-a80e-6751a9c8b829", "rsCAqdkyqjWcjKtinRwwUs3EPGSFV28fyriafwdGPbQES1");
    }
}
