package head;


import com.solvd.hospital.general.Operation;
import com.solvd.hospital.general.Pills;
import com.solvd.hospital.general.Procedure;

import java.util.Collections;
import java.util.List;


public class Patient {

    // FIELDS
    private int iduser;
    private int idstatus;
    private String status;
    private String username;
    private String password;
    private String name;
    private String surname;
    private String diagnosis;
    private List<Pills> userDrugsList;
    private List<Operation> userOperationList;
    private List<Procedure> userProceduresList;

    // CONSTRUCTORS
    public User() {
        idstatus = 1;
        diagnosis = "Здоров";
    }
    public User(int iduser, int idstatus, String status, String username, String password, String name, String surname, String diagnosis, List<Pills> userDrugsList, List<Operation> userOperationList, List<Procedure> userProceduresList) {
        this.iduser = iduser;
        this.idstatus = idstatus;
        this.status = status;
        this.username = username;
        this.password = password;
        this.name = name;
        this.surname = surname;
        this.diagnosis = diagnosis;
        Collections.copy(this.userDrugsList, userDrugsList);
        Collections.copy(this.userOperationList, userOperationList);
        Collections.copy(this.userProceduresList, userProceduresList);
    }

    public int getIduser() { return iduser; }
    public void setUser(int user) {
        this.user = user;
    }

    public int getIdstatus() {
        return idstatus;
    }
    public void setIdstatus(int idstatus) {
        this.idstatus = idstatus;
    }

    public String getStatus() {
        return status;
    }
    public void setStatus(String status) {
        this.status = status;
    }

    public String getUsername() {
        return username;
    }
    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }
    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getDiagnosis() {
        return diagnosis;
    }
    public void setDiagnosis(String diagnosis) {
        this.diagnosis = diagnosis;
    }

    public List<Pills> getUserDrugsList() {
        return userDrugsList;
    }
    public void setUserDrugsList(List<Pills> userDrugsList) {
        this.userDrugsList = userDrugsList;
    }

    public List<Operation> getUserOperationList() {
        return userOperationList;
    }
    public void setUserOperationList(List<Operation> userOperationList) {
        this.userOperationList = userOperationList;
    }

    public List<Procedure> getUserProceduresList() {
        return userProceduresList;
    }
    public void setUserProceduresList(List<Procedure> userProceduresList) {
        this.userProceduresList = userProceduresList;
    }

    @Override
    public String toString() {
        return "Patient{" +
                "iduser=" + iduser +
                ", idstatus=" + idstatus + '\'' +
                ", status='" + status + '\'' +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", diagnosis='" + diagnosis + '\'' +
                ", userDrugsList=" + userDrugsList +
                ", userOperationList=" + userOperationList +
                ", userProceduresList=" + userProceduresList +
                '}';
    }

}


