package com.codeclan.example.filefolderuser.components;


import com.codeclan.example.filefolderuser.models.User;
import com.codeclan.example.filefolderuser.models.Folder;
import com.codeclan.example.filefolderuser.models.File;
import com.codeclan.example.filefolderuser.repositories.UserRepository;
import com.codeclan.example.filefolderuser.repositories.FolderRepository;
import com.codeclan.example.filefolderuser.repositories.FileRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements ApplicationRunner {

    @Autowired
    UserRepository userRepository;

    @Autowired
    FolderRepository folderRepository;

    @Autowired
    FileRepository fileRepository;


    public DataLoader() {

    }

    public void run(ApplicationArguments args) {
       
        User user1 = new User("Francois");
        userRepository.save(user1);

        Folder folder1 = new Folder("Photos", user1);
        folderRepository.save(folder1);

        File file1 = new File("Lombard Street", "JPEG", "2MB", folder1);
        fileRepository.save(file1);
    }
}