package app.iset.service;

import java.io.UnsupportedEncodingException;
import java.util.Date;
import java.util.List;


import app.iset.entity.CategorieClient;
import app.iset.entity.Client;

public interface IClientService {
    Client add(Client client) throws UnsupportedEncodingException;
    Client update(Client client, Long id);
    void delete(long id);
    List<Client> findAll();
    Client findById(Long id);
   // float getChiffreAffaireParCategorieClient(CategorieClient  categorieClient);
    Client findByEmail(String email);

	public int desactiveAccount();
	public int premuimAccount();
	public int ordinaireAccount();
	public int fideleAccount();
	public boolean updatePassword(Long id, String currentPassword, String newPassword);
	public boolean resetPassword( String email, String newPassword);
	public int docteurProfession();
	public int ingenieurProfession();
	public int etudiantProfession();
	public int commercialProfession();
	public int cadreProfession();
	public int autreProfession();

}
