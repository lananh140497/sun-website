package vn.sunasterisk.sunwebsite.service;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import vn.sunasterisk.sunwebsite.model.UserDto;

import java.util.ArrayList;
import java.util.List;
@Data
@NoArgsConstructor
public class UserService {
    private List <UserDto> listUser = new ArrayList<>() ;

    public boolean login(String username, String password) {
        int dem = 0;
        for (UserDto u: listUser){
            if(u.getPassword()== password&& u.getUsername()==username){
                dem++;
            }
        }
        if(dem==0){
            return false;
        }else {
            return true;
        }
    }
    public void registerUser(String username, String password){
        int dem = 0;
        for (UserDto u: listUser){
            if(u.getPassword()== password&& u.getUsername()==username){
                dem++;
            }
        }
        if(dem==0){
            listUser.add( new UserDto(username,password));
        }
    }
}
