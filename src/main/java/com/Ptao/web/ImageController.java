package com.Ptao.web;


import org.apache.tomcat.util.codec.binary.Base64;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.Ptao.web.Domain.Photo;
import com.Ptao.web.Domain.Video;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestBody;



@Controller
public class ImageController {
    long id = (long)1;
    @Autowired
    ImageRepository IR;
    

    @GetMapping("/image")
    public String displayImage( Model model) {
      
        return "Image";
    }
    @GetMapping("/imageForm")
    public String displayForm(Model model) {
        //TODO: process POST request
        Photo photo = new Photo();
        model.addAttribute("Image", photo);
        return "addImageForm";
    }

    @PostMapping("/saveImage")
    public String saveImage(Model model, @ModelAttribute Photo Image) {
        //TODO: process POST request
        IR.save(Image);
        return "redirect:image";
    }
    
    
    
}
