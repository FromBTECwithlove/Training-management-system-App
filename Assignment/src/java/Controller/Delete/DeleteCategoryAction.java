/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Controller.Delete;

import Entity.Category;
import Model.DeleteProcess;
import Model.UpdateProcess;
import com.opensymphony.xwork2.ActionSupport;
import java.util.ArrayList;

/**
 *
 * @author luuka
 */
public class DeleteCategoryAction extends ActionSupport {
    private String cateId;
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

    public DeleteCategoryAction(String cateId) {
        this.cateId = cateId;
    }
    
    
    public DeleteCategoryAction() {
    }
    
    public String execute() throws Exception {
        DeleteProcess dp = new DeleteProcess();
        UpdateProcess up = new UpdateProcess();
        if (dp.delCategory(cateId)) {
            cate = up.getCategory();
            return "success";
        }
        return "fail";
    }
    
}
