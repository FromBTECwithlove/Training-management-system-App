/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Controller.Search;

import Entity.Course;
import Model.SearchProcess;
import com.opensymphony.xwork2.ActionSupport;
import java.util.List;

/**
 *
 * @author luuka
 */
public class SearchCourseAction extends ActionSupport {
    
    private String searchValue;
    private List<Course> listCourse;

    public String getSearchValue() {
        return searchValue;
    }

    public void setSearchValue(String searchValue) {
        this.searchValue = searchValue;
    }

    public List<Course> getListCourse() {
        return listCourse;
    }

    public void setListCourse(List<Course> listCourse) {
        this.listCourse = listCourse;
    }
    
    public SearchCourseAction() {
    }
    
    public String execute() throws Exception {
        SearchProcess sp = new SearchProcess();
        if (sp.getSearchList(searchValue)!=null) {
            listCourse= sp.getSearchList(searchValue);
            return "success";
        }
        return "fail";
    }
    
}
