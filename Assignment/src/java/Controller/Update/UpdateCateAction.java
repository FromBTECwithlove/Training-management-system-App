/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller.Update;

import Entity.Category;
import Model.UpdateProcess;
import com.opensymphony.xwork2.ActionSupport;
import java.util.ArrayList;

/**
 *
 * @author luuka
 */
public class UpdateCateAction extends ActionSupport {

    private String cateId;
    private String cateName;
    private String cateDes;
    private Category c;
    private ArrayList<Category> cate;

    public String execute() throws Exception {
        UpdateProcess up = new UpdateProcess();
        if (up.getCateById(cateId) != null) {
            c = up.getCateById(cateId);
            return "success";
        }
        return "fail";
    }
    
    public String doUpdate() throws Exception {
        UpdateProcess up = new UpdateProcess();
        if (up.updateCate(cateId, cateName, cateDes)) {
            cate = up.getCategory();
            return "success";
        }
        return "fail";
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

    public Category getC() {
        return c;
    }

    public void setC(Category c) {
        this.c = c;
    }

    public ArrayList<Category> getCate() {
        return cate;
    }

    public void setCate(ArrayList<Category> cate) {
        this.cate = cate;
    }

    public UpdateCateAction() {
    }

}
