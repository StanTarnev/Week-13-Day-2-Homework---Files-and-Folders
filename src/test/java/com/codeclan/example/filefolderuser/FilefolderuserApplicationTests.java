package com.codeclan.example.filefolderuser;

import com.codeclan.example.filefolderuser.models.File;
import com.codeclan.example.filefolderuser.models.Folder;
import com.codeclan.example.filefolderuser.models.User;
import com.codeclan.example.filefolderuser.repositories.UserRepository;
import com.codeclan.example.filefolderuser.repositories.FolderRepository;
import com.codeclan.example.filefolderuser.repositories.FileRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class FilefolderuserApplicationTests {
	@Autowired
	UserRepository userRepository;

	@Autowired
	FolderRepository folderRepository;

	@Autowired
	FileRepository fileRepository;

	@Test
	void contextLoads() {
	}

	@Test
	public void createFileFolderAndUser(){
		User user1 = new User("Francois");
		userRepository.save(user1);

		Folder folder1 = new Folder("Photos", user1);
		folderRepository.save(folder1);

		File file1 = new File("Lombard Street", "JPEG", "2MB", folder1);
		fileRepository.save(file1);
	}
}
