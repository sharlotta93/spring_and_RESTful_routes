package com.codeclan.example.filesservice.components;

import com.codeclan.example.filesservice.models.File;
import com.codeclan.example.filesservice.models.Folder;
import com.codeclan.example.filesservice.models.User;
import com.codeclan.example.filesservice.respository.FileRepository;
import com.codeclan.example.filesservice.respository.FolderRepository;
import com.codeclan.example.filesservice.respository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements ApplicationRunner {

    @Autowired
    FileRepository fileRepo;

    @Autowired
    UserRepository userRepo;

    @Autowired
    FolderRepository folderRepo;

    public void run(ApplicationArguments args) {

        User user1 = new User("Bob");
        User user2 = new User("Martha");
        userRepo.save(user1);
        userRepo.save(user2);

        Folder folder1 = new Folder("Bob's secrets", user1);
        Folder folder2 = new Folder("Martha's recipes", user2);
        Folder folder3 = new Folder("Job Applications", user1);
        folderRepo.save(folder1);
        folderRepo.save(folder2);
        folderRepo.save(folder3);

        File file1 = new File("secret", folder1);
        File file2 = new File("Red Velvet Cake", folder2);
        File file3 = new File("Carbonara", folder2);
        fileRepo.save(file1);
        fileRepo.save(file2);
        fileRepo.save(file3);
    }
}
