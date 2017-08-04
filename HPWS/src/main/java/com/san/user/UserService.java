package com.san.user;

import com.san.tokenUserInfo.TokenUserInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import javax.persistence.EntityManager;
import javax.persistence.ParameterMode;
import javax.persistence.PersistenceContext;
import javax.persistence.StoredProcedureQuery;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class UserService implements UserDetailsService {
	
    @Autowired
    private UserRepository userRepository;
//    @Autowired
//    private PasswordEncoder passwordEncoder;
    @PersistenceContext
    EntityManager entityManager;

    public List<User> getAll() {
        List<User> records = new ArrayList<>();
        userRepository.findAll().forEach(records::add);
        return records;
    }

    public User getOne(Integer id) {
        return userRepository.findOne(id);
    }

    public boolean add(User user) {
//            user.setPassword(passwordEncoder.encode(user.getPassword()));
//            userRepository.save(user);

        return false;
    }

    public boolean update() {
        return false;
    }

    public boolean delete(Integer id) {

        userRepository.delete(id);
        return false;
    }

    public User getUser(Integer id) {
        return userRepository.findOne(id);
    }

    @Override
    public UserDetails loadUserByUsername(String identifier) throws UsernameNotFoundException {
        Optional<User> optionalUser = userRepository.findByEmail(identifier);
        optionalUser.orElseThrow(() -> new UsernameNotFoundException("UserName Not Found"));

        return optionalUser.map(CustomUserDetails::new).get();
    }

    public TokenUserInfo getTokenUserInfo(LoginRequest loginRequest, String ip, String agent) {
        StoredProcedureQuery storedProcedureQuery = entityManager.createStoredProcedureQuery("get_token_user_info_sp");
        storedProcedureQuery.registerStoredProcedureParameter(1, String.class, ParameterMode.IN);
        storedProcedureQuery.registerStoredProcedureParameter(2, String.class, ParameterMode.IN);
        storedProcedureQuery.setParameter(1, loginRequest.getEmailOrUsername());
        storedProcedureQuery.setParameter(2, loginRequest.getPassword());
        List<Object[]> l = storedProcedureQuery.getResultList();

        if (l.size() > 0) {
            Object[] firstRow = l.get(0);
            Integer id = (Integer) firstRow[0];
            String access_token = (String) firstRow[1];
            String language = (String) firstRow[2];
            List<String> roles = new ArrayList<>();
            for (Object[] result: l) {
                roles.add((String) result[3]);
            }
            return new TokenUserInfo(id, access_token, roles, ip, agent, language);
        }


        return null;
    }
}
