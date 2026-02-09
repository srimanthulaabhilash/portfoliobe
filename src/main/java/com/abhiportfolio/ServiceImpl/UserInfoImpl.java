package com.abhiportfolio.ServiceImpl;

import java.time.LocalDateTime;

import org.springframework.stereotype.Service;

import com.abhiportfolio.Dto.UserInfoDto;
import com.abhiportfolio.Repository.UserInfoRepo;
import com.abhiportfolio.Service.UserInfoService;
import com.abhiportfolio.entity.UserInfo;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class UserInfoImpl implements UserInfoService {

    private final UserInfoRepo userInfoRepo;

    @Override
    public UserInfoDto createUser(UserInfoDto userInfoDto) {
        // Map DTO -> Entity
        UserInfo user = new UserInfo();
        user.setFullName(userInfoDto.getFullName());
        user.setEmail(userInfoDto.getEmail());
        user.setPhone(userInfoDto.getPhone());
        user.setCompany(userInfoDto.getCompany());
        user.setMessage(userInfoDto.getMessage());

        LocalDateTime now = LocalDateTime.now();
        user.setCreatedAt(now);
        user.setUpdatedAt(now);

        // Save
        UserInfo saved = userInfoRepo.save(user);

        // Map Entity -> DTO and return
        return new UserInfoDto(
                saved.getId(),
                saved.getFullName(),
                saved.getEmail(),
                saved.getPhone(),
                saved.getCompany(),
                saved.getMessage(),
                saved.getCreatedAt(),
                saved.getUpdatedAt());
    }

}