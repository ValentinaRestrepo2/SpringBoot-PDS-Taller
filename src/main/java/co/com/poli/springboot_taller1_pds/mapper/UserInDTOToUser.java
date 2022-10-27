package co.com.poli.springboot_taller1_pds.mapper;

import co.com.poli.springboot_taller1_pds.persistence.entity.User;
import co.com.poli.springboot_taller1_pds.service.dto.UserInDTO;
import org.springframework.stereotype.Component;

@Component
public class UserInDTOToUser implements IMapper<UserInDTO, User> {
    @Override
    public User map(UserInDTO in) {
        User user = new User();
        user.setBirtDate(in.getBirtDate());
        user.setActive(Boolean.FALSE);
        user.setDependency(in.getDependency());
        user.setProfile(in.getPerfil());
        user.setRows(in.getRows());

        return user;
    }
}
