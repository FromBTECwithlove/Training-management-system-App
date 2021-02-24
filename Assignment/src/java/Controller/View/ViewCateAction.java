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
public class ViewCateAction extends ActionSupport {
    private ArrayList<Category> cate;

    public ArrayList<Category> getCate() {
        return cate;
    }

    public void setCate(ArrayList<Category> cate) {
        this.cate = cate;
    }
    
    public ViewCateAction() {
    }
    
    public String execute() throws Exception {
        UpdateProcess up = new UpdateProcess();
        cate = up.getCategory();
        return "success";
    }    
}
