package com.committee.system.controller;

import com.committee.system.service.AwsService;
import javassist.bytecode.ByteArray;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.ByteArrayResource;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

@RestController
public class StorageController {

    @Autowired
    private AwsService awsService;

    @PostMapping("/upload")
    public ResponseEntity uploadFile(MultipartFile file)
    {
        return new ResponseEntity(awsService.uploadFile(file), HttpStatus.OK);
    }

    @GetMapping("/download/{fileName}")
    public ResponseEntity<ByteArrayResource> downloadFile(@PathVariable String fileName)
    {
        byte[] data =  awsService.downloadFile(fileName);
        ByteArrayResource resource = new ByteArrayResource(data);
        return ResponseEntity
                .ok()
                .contentLength(data.length)
                .header("Content-type", "application/octet-stream")
                .header("Content-disposition","attachment; filename=\"" + fileName + "\"")
                .body(resource);
    }

    @DeleteMapping("delete/{fileName}")
    public ResponseEntity<String> deleteFile(@PathVariable String fileName)
    {
        return new ResponseEntity<>(awsService.deleteFile(fileName),HttpStatus.OK);
    }
}
