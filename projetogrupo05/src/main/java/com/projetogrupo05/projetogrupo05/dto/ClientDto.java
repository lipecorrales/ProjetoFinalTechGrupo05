import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ClientDto {

    @Autowired
    private ClientRepo repoClient;

    public Client novoClient(Client clientNovo) {
        Client clientInserid = repoClient.save(clientNovo);
        return clientInserid;
    }
}