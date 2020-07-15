package com.github.willspader.awsimageupload.datastore;

import com.github.willspader.awsimageupload.profile.UserProfile;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Repository
public class FakeUserProfileDataStore {

    private static final List<UserProfile> USER_PROFILES = new ArrayList<>();

    static {
        USER_PROFILES.add(new UserProfile(UUID.fromString("5591419a-5203-40f7-9f72-c8f035ace439"), "janetjones", null));
        USER_PROFILES.add(new UserProfile(UUID.fromString("f260a8ce-8faa-47c6-a480-f2654c7acd6a"), "antoniojunior", null));
    }

    public List<UserProfile> getUserProfiles() {
        return USER_PROFILES;
    }

}
