package tech.buildrun.springsecurity.entities;

import jakarta.persistence.*;

@Entity
@Table(name = "tb_roles")
public class Role {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "role_id")
    private Long roleId;

    @Column(unique = true, nullable = false)
    private String name;

    public Role() {}

    public Role(Long roleId) {
        this.roleId = roleId;
    }

    public Role(String name) {
        this.name = name;
    }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public Long getRoleId() { return roleId; }
    public void setRoleId(Long roleId) { this.roleId = roleId; }

    public enum Values {
        ADMIN(1L),
        BASIC(2L);

        private final long roleId;
        Values(long roleId) { this.roleId = roleId; }
        public long getRoleId() { return roleId; }
    }
}
