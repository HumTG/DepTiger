/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Service;

import java.util.List;

/**
 *
 * @author Admin
 */
public interface Method<Entity> {
    List<Entity> selectbySQL(String Sql, Object... orgs);
    List<Entity> getALL();
    List<Entity> getALLresultPage();
    List<Entity> getbyEntityhidden();
    List<Entity> findEntity(String data);
    List<Entity> findEntityhidden(String data);
    Entity getbyID(int id);
    void addEntity(Entity ett);
    void deleteEntity(int id);
    void updateEntity(Entity ett,int id);
    void hiddenEntity(int id);
    void unhiddenEntity(int id);
    int resultPage (int page,int limit);
}
