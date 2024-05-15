/*
 *  File        : DAOManager.java            15/05/2024
 *  Pembuat     : Zikry Alfahri Akram (2060122120033)
 *  Deskripsi   : Pengelola DAO dalam program
 */

public class DAOManager {
    private PersonDAO personDAO;

    public void setPersonDAO(PersonDAO person){
        personDAO = person;
    }

    public PersonDAO getPersonDAO(){
        return personDAO;
    }
}
