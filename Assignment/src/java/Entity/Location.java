/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Entity;

/**
 *
 * @author luuka
 */
public class Location {
    private String locaId;
    private String locaName;

    public Location() {
    }

    public Location(String locaId, String locaName) {
        this.locaId = locaId;
        this.locaName = locaName;
    }

    public String getLocaId() {
        return locaId;
    }

    public void setLocaId(String locaId) {
        this.locaId = locaId;
    }

    public String getLocaName() {
        return locaName;
    }

    public void setLocaName(String locaName) {
        this.locaName = locaName;
    }
    
    
}
