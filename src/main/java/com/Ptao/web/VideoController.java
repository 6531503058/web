package com.Ptao.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.Ptao.web.Domain.Video;



@Controller
public class VideoController {
    long id = (long)1;
    @Autowired
    VideoRepository VR;

    @GetMapping("/video")
    public String video(Model model)
    { 
        model.addAttribute("Levideo", VR.findById(id).get());
        model.addAttribute("Url", "https://storage.googleapis.com/"+VR.findById(id).get().getBucket()+"/"+VR.findById(id).get().getFileName());
        return"video";
    }
    @GetMapping("/AddVid")
    public String addVideoForm(Model model)
    {
        model.addAttribute("video", new Video());
        return"addVidForm";
    }
    @PostMapping("/Add-video")
    public String addVideo(Model model, @ModelAttribute Video video)
    {
        VR.save(video);
        return"redirect:video";
    }
}
