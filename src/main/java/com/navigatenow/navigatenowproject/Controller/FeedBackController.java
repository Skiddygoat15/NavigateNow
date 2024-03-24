package com.navigatenow.navigatenowproject.Controller;

import com.navigatenow.navigatenowproject.Model.DTO.FeedBackDTOs.FeedBackGetDTO;
import com.navigatenow.navigatenowproject.Model.DTO.FeedBackDTOs.FeedBackPostDTO;
import com.navigatenow.navigatenowproject.Service.FeedBackServices;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "/feedbacks")
@CrossOrigin
@RequiredArgsConstructor
public class FeedBackController {

    public final FeedBackServices feedBackServices;
    @PostMapping(path = "/feedback/add-feadback")
    public FeedBackPostDTO addFeedBack(@RequestBody FeedBackPostDTO feedBackPostDTO){
        return this.feedBackServices.addFeedBack(feedBackPostDTO);
    }

    @GetMapping(path = "/feedback/get-feedbackbyid/{id}")
    public FeedBackGetDTO getFeedBackById(@PathVariable Integer id){
        return this.feedBackServices.getFeedBackById(id);
    }

    @GetMapping(path = "/feedback/get-allfeedbacks")
    public List<FeedBackGetDTO> getAllFeedBacks(){
        return this.feedBackServices.getAllFeedBacks();
    }
}
