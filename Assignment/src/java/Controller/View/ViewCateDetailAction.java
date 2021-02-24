/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Controller.View;

import Entity.Category;
import Model.UpdateProcess;
import com.opensymphony.xwork2.ActionSupport;
import java.util.ArrayList;

/**
 *
 * @author luuka
 */
public class ViewCateDetailAction extends ActionSupport {
    
    private ArrayList<Category> cate2;
    private String id;
    
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public ArrayList<Category> getCate2() {
        UpdateProcess up = new UpdateProcess();
        cate2 = up.getCategory2(id);
        return cate2;
    }

    public void setCate2(ArrayList<Category> cate2) {
        this.cate2 = cate2;
    }

    
    public ViewCateDetailAction() {
    }
    
    public String execute() throws Exception {
        UpdateProcess up = new UpdateProcess();
        cate2 = up.getCategory2(id);
        return "success";
    }
    
}
