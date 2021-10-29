package com.nguyenduc.service.role;

import com.nguyenduc.model.Role;
import com.nguyenduc.service.IGeneralService;

public interface IRoleService extends IGeneralService<Role> {
    Role findByName(String name);
}