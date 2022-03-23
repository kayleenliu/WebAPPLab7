
package ca.sait.lab7.services;

import ca.sait.lab7.dataaccess.RoleDB;
import ca.sait.lab7.models.Role;
import ca.sait.lab7.models.User;
import java.util.List;


public class RoleService {
    private RoleDB roleDb = new RoleDB();
    
    public List<Role> getAll() throws Exception {
        List<Role> roles = this.roleDb.getAll();
        return roles;
    }
}
