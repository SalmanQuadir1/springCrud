package com.CrudBoot.web.controller;

import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import com.CrudBoot.web.helper.FileUploadHelper;

@RestController
public class FileUploadController {

	@Autowired
	private FileUploadHelper fileUploadHelper;

	@PostMapping("/upload-file")
	public ResponseEntity<String> uploadFile(@RequestPart("file") MultipartFile file) throws IOException {

		/*
		 * System.out.println(file.getOriginalFilename());
		 * System.out.println(file.getSize()); System.out.println(file.getBytes());
		 * System.out.println(file.getContentType()); byte image[]=file.getBytes();
		 * System.out.println(image);
		 */

		try {

			if (file.isEmpty()) {

				return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("No file found in request");

			}
			if (!file.getContentType().equals("image/jpeg")) {
				return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("File format not supported !!");

			}
			boolean f = this.fileUploadHelper.uploadFile(file);
			if (f) {
				/*
				 * return ResponseEntity.ok("File Uploaded Successfully");
				 */		
				
				return ResponseEntity.ok(ServletUriComponentsBuilder.fromCurrentContextPath().path("/images/").path(file.getOriginalFilename()).toUriString());
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

		return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Something Went Wrong !Try again");
	}

}
