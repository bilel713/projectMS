package app.iset.repository;

import java.util.Date;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import app.iset.entity.CategorieClient;
import app.iset.entity.Client;

@Repository
public interface ClientRepository extends JpaRepository<Client,Long> {

    /*@Query("SELECT c FROM Client c  WHERE c.verificationCode =:code")
    public Client findByVerificationCode(String code);*/
@Query("SELECT c FROM Client c where c.dateNaissance between '01/01/1995' and '31/12/1995'")
	public List<Client> ClientBetweenDate();
@Query("SELECT count(c.active) FROM Client c where c.active= true")
public int activeAccount();
@Query("SELECT count(c.active) FROM Client c where c.active= false")
public int desactiveAccount();
@Query("SELECT count(c.categorieClient) FROM Client c where c.categorieClient= 'premuim'")
public int premuimAccount();
@Query("SELECT count(c.categorieClient) FROM Client c where c.categorieClient= 'ordinaire'")
public int ordinaireAccount();
@Query("SELECT count(c.categorieClient) FROM Client c where c.categorieClient= 'fidele'")
public int fideleAccount();

Client findByEmail(String email);
Client findByVerificationCode(String code);
//Docteur,ingenieur,etudiant,commercial,cadre,autre
@Query("SELECT count(c.Profession) FROM Client c where c.Profession='Docteur'")
public int docteurProfession();
@Query("SELECT count(c.Profession) FROM Client c where c.Profession='ingenieur'")
public int ingenieurProfession();
@Query("SELECT count(c.Profession) FROM Client c where c.Profession='etudiant'")
public int etudiantProfession();
@Query("SELECT count(c.Profession) FROM Client c where c.Profession='commercial'")
public int commercialProfession();
@Query("SELECT count(c.Profession) FROM Client c where c.Profession='cadre'")
public int cadreProfession();
@Query("SELECT count(c.Profession) FROM Client c where c.Profession='autre'")
public int autreProfession();

@Query
Client findByCategorieClient(CategorieClient category);
}


