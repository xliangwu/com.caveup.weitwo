package com.caveup.weitwo.web.service;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import com.caveup.weitwo.biz.domain.dataobject.Member;
import com.caveup.weitwo.biz.service.SSOService;

public class CustomUserDetailsService implements UserDetailsService {

    private static final Logger LOGGER = LoggerFactory.getLogger(CustomUserDetailsService.class);

    protected SSOService ssoService;

    @Override
    public UserDetails loadUserByUsername(String email) throws UsernameNotFoundException {
        UserDetails user = null;

        try {
            Member member = ssoService.getUserByEmail(email);
            if (null == member) {
                new UsernameNotFoundException("Error in retrieving user : " + email);
            }
            user = new User(member.getAccount(), member.getEncryptPassword(), member.isActive(), true, true,
                    true, getDefaultAuthorities());
        } catch (Exception e) {
            LOGGER.error("Error in retrieving user", e);
            throw new UsernameNotFoundException("Error in retrieving user");
        }

        return user;
    }

    /**
     * all the user has the admin access for own application
     * 
     * @return
     */
    public Collection<GrantedAuthority> getDefaultAuthorities() {
        List<GrantedAuthority> authList = new ArrayList<GrantedAuthority>(2);
        LOGGER.debug("Grant ROLE_USER to this user");
        authList.add(new SimpleGrantedAuthority("ROLE_ADMIN"));

        return authList;
    }

    public void setSsoService(SSOService ssoService) {
        this.ssoService = ssoService;
    }

}
