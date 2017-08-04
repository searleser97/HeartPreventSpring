package com.san.user;

import com.san.Role.Role;
import com.san.accountState.AccountState;
import com.san.category.Category;
import com.san.country.Country;
import com.san.language.Language;
import com.san.sex.Sex;

import javax.persistence.*;
import java.io.Serializable;
import java.sql.Timestamp;
import java.util.Date;
import java.util.Set;

@Entity
public class User implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(unique = true, nullable = false)
    private String username;
    @Column(columnDefinition = "BIT DEFAULT 0")
    private boolean loggedIn;
    @Column(unique = true)
    private String email;
    @Column(unique = true)
    private String gcm_id;
    @Column(nullable = false)
    private String name;
    @Column(nullable = false)
    private String last_name;
    @Column(nullable = false)
    private String password;
    private String phone_number;
    private String profile_picture;
    @Column(nullable = false)
    private Date birth_date;
    @Column(columnDefinition = "BIT DEFAULT 0")
    private boolean remember_me;
    @Column(unique = true)
    private String access_token;

    @ManyToOne
    @JoinColumn(nullable = false)
    private Sex sex;
    @ManyToOne
    @JoinColumn(nullable = false)
    private Category category;
    @ManyToOne
    @JoinColumn(nullable = false)
    private AccountState account_state;
    @ManyToOne
    @JoinColumn(nullable = false)
    private Country country;
    @ManyToOne
    @JoinColumn(nullable = false)
    private Language language;

    @ManyToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    @JoinTable(name = "role_x_user", joinColumns = @JoinColumn(name = "user_id"),
            inverseJoinColumns = @JoinColumn(name = "role_id"))
    private Set<Role> roles;


    @Column(columnDefinition = "TIMESTAMP DEFAULT CURRENT_TIMESTAMP")
    private Timestamp user_created_at;
    @Column(columnDefinition = "TIMESTAMP DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP")
    private Timestamp user_updated_at;

    public User() {

    }

    public User(User user) {
        this.id = user.getId();
        this.loggedIn = user.isLoggedIn();
        this.email = user.getEmail();
        this.gcm_id = user.getGcm_id();
        this.name = user.getName();
        this.last_name = user.getLast_name();
        this.access_token = user.getAccess_token();
        this.password = user.getPassword();
        this.phone_number = user.getPhone_number();
        this.profile_picture = user.getProfile_picture();
        this.sex = user.getSex();
        this.remember_me = user.isRemember_me();
        this.category = user.getCategory();
        this.account_state = user.getAccount_state();
        this.birth_date = user.getBirth_date();
        this.roles = user.getRoles();
        this.user_created_at = user.getUser_created_at();
        this.user_updated_at = user.getUser_updated_at();
    }

    public User(String username, boolean loggedIn, String email, String gcm_id, String name, String last_name, String access_token, String password, String phone_number, String profile_picture, Date birth_date, boolean remember_me, Sex sex, Language language, Country country, Category category, AccountState account_state, Set<Role> roles, Timestamp user_created_at, Timestamp user_updated_at) {
        this.username = username;
        this.loggedIn = loggedIn;
        this.email = email;
        this.gcm_id = gcm_id;
        this.name = name;
        this.last_name = last_name;
        this.access_token = access_token;
        this.password = password;
        this.phone_number = phone_number;
        this.profile_picture = profile_picture;
        this.birth_date = birth_date;
        this.remember_me = remember_me;
        this.sex = sex;
        this.language = language;
        this.country = country;
        this.category = category;
        this.account_state = account_state;
        this.roles = roles;
        this.user_created_at = user_created_at;
        this.user_updated_at = user_updated_at;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public boolean isLoggedIn() {
        return loggedIn;
    }

    public void setLoggedIn(boolean loggedIn) {
        this.loggedIn = loggedIn;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getGcm_id() {
        return gcm_id;
    }

    public void setGcm_id(String gcm_id) {
        this.gcm_id = gcm_id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLast_name() {
        return last_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    public String getAccess_token() {
        return access_token;
    }

    public void setAccess_token(String access_token) {
        this.access_token = access_token;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPhone_number() {
        return phone_number;
    }

    public void setPhone_number(String phone_number) {
        this.phone_number = phone_number;
    }

    public String getProfile_picture() {
        return profile_picture;
    }

    public void setProfile_picture(String profile_picture) {
        this.profile_picture = profile_picture;
    }

    public Date getBirth_date() {
        return birth_date;
    }

    public void setBirth_date(Date birth_date) {
        this.birth_date = birth_date;
    }

    public boolean isRemember_me() {
        return remember_me;
    }

    public void setRemember_me(boolean remember_me) {
        this.remember_me = remember_me;
    }

    public Sex getSex() {
        return sex;
    }

    public void setSex(Sex sex) {
        this.sex = sex;
    }

    public Language getLanguage() {
        return language;
    }

    public void setLanguage(Language language) {
        this.language = language;
    }

    public Country getCountry() {
        return country;
    }

    public void setCountry(Country country) {
        this.country = country;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public AccountState getAccount_state() {
        return account_state;
    }

    public void setAccount_state(AccountState account_state) {
        this.account_state = account_state;
    }

    public Set<Role> getRoles() {
        return roles;
    }

    public void setRoles(Set<Role> roles) {
        this.roles = roles;
    }

    public Timestamp getUser_created_at() {
        return user_created_at;
    }

    public void setUser_created_at(Timestamp user_created_at) {
        this.user_created_at = user_created_at;
    }

    public Timestamp getUser_updated_at() {
        return user_updated_at;
    }

    public void setUser_updated_at(Timestamp user_updated_at) {
        this.user_updated_at = user_updated_at;
    }
}