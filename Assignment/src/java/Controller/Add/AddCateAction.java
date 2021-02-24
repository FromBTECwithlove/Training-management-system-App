/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Controller.Add;

import Entity.Category;
import Model.DataProcess;
import Model.UpdateProcess;
import com.opensymphony.xwork2.ActionSupport;
import java.util.ArrayList;

/**
 *
 * @author luuka
 */
public class AddCateAction extends ActionSupport {
    private String cateId;
    private String cateName;
    private String cateDes;
    private ArrayList<Category> cate;

    public ArrayList<Category> getCate() {
        return cate;
    }

    public void setCate(ArrayList<Category> cate) {
        this.cate = cate;
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
    
    public AddCateAction() {
    }
    
    public String execute() throws Exception {
        DataProcess dp = new DataProcess();
        UpdateProcess up = new UpdateProcess();
        if (dp.addCate(cateId, cateName, cateDes)) {
            cate = up.getCategory();
            return "success";
        }
        return "fail";
    }
    
}
