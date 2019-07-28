package org.kartashov.part18_security.jaas.login_module;

import java.security.Permission;

public class CustomPermission extends Permission {
    public CustomPermission(String name) {
        super(name);
    }
    @Override
    public boolean implies(Permission permission) {
        return false;
    }
    @Override
    public boolean equals(Object obj) {
        return true;
    }
    @Override
    public int hashCode() {
        return 0;
    }
    @Override
    public String getActions() {
        return null;
    }
}
