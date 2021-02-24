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
public class Category {
    private String cateId;
    private String cateName;
    private String cateDes;

    public Category() {
    }

    public Category(String cateId, String cateName, String cateDes) {
        this.cateId = cateId;
        this.cateName = cateName;
        this.cateDes = cateDes;
    }

    public String getCateId() {
        return cateId;
    }

    public void setCateId(String cateId) {
        this.cateId = cateId;
    }

    public String getCateName() {
        return cateName;
    }

    public void setCateName(String cateName) {
        this.cateName = cateName;
    }

    public String getCateDes() {
        return cateDes;
    }

    public void setCateDes(String cateDes) {
        this.cateDes = cateDes;
    }
    
    
}
