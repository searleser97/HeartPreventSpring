package com.san.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
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

    public boolean update(DataUser dataUser) {
//        User user = dataUser.getUser();
//        String accessToken = dataUser.getUserInfo().getAccess_token();
//        String dbAccessToken = getOne(user.getId()).getAccess_token();
//        if(accessToken.equals(dbAccessToken)) {
//            userRepository.save(user);
//            return true;
//        }
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
}
